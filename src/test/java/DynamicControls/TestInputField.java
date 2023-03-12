package DynamicControls;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;

import static org.testng.Assert.assertEquals;

public class TestInputField extends BaseTest {

    @Test
    public void testInputField() {

        DynamicControlsPage dynamicControlsPage = homePage.clickDynamicControlsLink();

        dynamicControlsPage.dynamicControlInputField();

        assertEquals(dynamicControlsPage.getMessageText(), dynamicControlsPage.disableMessage, "Error in input field");
    }

}
