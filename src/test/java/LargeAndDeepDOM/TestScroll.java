package LargeAndDeepDOM;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LargeAndDeepDOMPage;

public class TestScroll extends BaseTest {

    @Test
    public void testScroll() {

        LargeAndDeepDOMPage largeAndDeepDOMPage = homePage.clickLargeAndDeepDOMLink();

        largeAndDeepDOMPage.scroll();
    }

}
