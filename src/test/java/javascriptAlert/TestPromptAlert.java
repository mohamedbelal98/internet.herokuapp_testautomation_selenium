package javascriptAlert;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class TestPromptAlert extends BaseTest {

    @Test
    public void testPromptConfirm(){

        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();

        javaScriptAlertsPage.confirmPromptAlert("test");

        assertEquals(javaScriptAlertsPage.getResultText(),"You entered: test");
    }

    @Test
    public void testPromptDismiss(){

        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();

        javaScriptAlertsPage.dismissPromptAlert("test");

        assertEquals(javaScriptAlertsPage.getResultText(),"You entered: null");

    }
}
