package horizontalSlider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class TestHorizontalSlider extends BaseTest {

    @Test
    public void testSlider() {

        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderLink();

        String value = "4";
        horizontalSliderPage.slider(value);
        assertEquals(horizontalSliderPage.getNumber(), value, "Error in Horizontal slider");
    }
}
