package fromAuthentication;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;

public class TestLogin extends BaseTest {

    @Test
    public void testLogin() {

        LoginPage loginPage = homePage.clickFromAuthenticationLink();

        SecureAreaPage secureAreaPage = loginPage.login("tomsmith", "SuperSecretPassword!");

        assertEquals(secureAreaPage.getFlashMessage(), "You logged into a secure area!\n" +
                "×", "Error in login.");
    }
}
