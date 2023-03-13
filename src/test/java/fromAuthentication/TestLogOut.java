package fromAuthentication;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;

public class TestLogOut extends BaseTest {

    @Test
    public void testLogout() {

        LoginPage loginPage = homePage.clickFromAuthenticationLink();

        SecureAreaPage secureAreaPage = loginPage.login("tomsmith", "SuperSecretPassword!");

        assertEquals(secureAreaPage.getFlashMessage(), "You logged into a secure area!\n" +
                "×", "Error in login.");

        LoginPage loginPage1 = secureAreaPage.clickLgOut();

        assertEquals(loginPage1.getFlashMessage(), "You logged out of the secure area!\n" +
                "×", "Error in logout.");

    }
}
