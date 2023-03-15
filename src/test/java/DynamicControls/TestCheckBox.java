package DynamicControls;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;

public class TestCheckBox extends BaseTest {

    @Test
    public void testCheckBox() {

        DynamicControlsPage dynamicControlsPage = homePage.clickDynamicControlsLink();

        dynamicControlsPage.dynamicControlCheckBox();
    }
}
