package javascriptAlert;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class TestConfirmAlert extends BaseTest {

    @Test
    public void acceptConfirmAlert() {

        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();

        javaScriptAlertsPage.acceptConfirmAlert();

        assertEquals(javaScriptAlertsPage.getResultText(), "You clicked: Ok", "Error in accept confirm alert");
    }

    @Test
    public void dismissConfirmAlert() {

        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();

        javaScriptAlertsPage.dismissConfirmAlert();

        assertEquals(javaScriptAlertsPage.getResultText(), "You clicked: Cancel", "Error in dismiss confirm alert");
    }
}
