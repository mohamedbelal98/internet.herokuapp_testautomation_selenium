package abTesting;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ABPage;

import static org.testng.Assert.assertEquals;

public class TestABTesting extends BaseTest {

    @Test
    public void testABTesting() {

        ABPage abPage = homePage.clickABLink();
        assertEquals(abPage.getTitleText(), abPage.titleTextForAssertion, "Error on ABTesting page");
        assertEquals(abPage.getBodyText(), abPage.bodyTextForAssertion, "Error on ABTesting page");
    }

}
