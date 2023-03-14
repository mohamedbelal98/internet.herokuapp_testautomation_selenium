package hovers;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

public class TestHovers extends BaseTest {

    @Test
    public void testHovers() {

        HoversPage hoversPage = homePage.clickHoversLink();

        hoversPage.hoverOverImages();
    }
}
