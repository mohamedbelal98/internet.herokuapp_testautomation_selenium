package brokenImage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.BrokenImagePage;

public class TestBrokenImage extends BaseTest {

    @Test
    public void testBrokenImage() {

        BrokenImagePage brokenImagePage = homePage.clickBrokenImageLink();

        brokenImagePage.filterImageIsBrokenOrNot();
    }

}
