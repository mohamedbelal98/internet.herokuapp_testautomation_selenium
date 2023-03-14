package javascriptAlert;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class TestAlert extends BaseTest {

    @Test
    public void testAlert() {

        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();

        javaScriptAlertsPage.alert();

        assertEquals(javaScriptAlertsPage.getResultText(), "You successfully clicked an alert", "Error in alert");
    }
}
