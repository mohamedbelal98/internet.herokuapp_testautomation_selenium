package dynamicLoading;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.Example1Page;
import pages.Example2page;

import static org.testng.Assert.assertEquals;


public class TestDynamicLoading extends BaseTest {

    @Test
    public void testHiddenElement() {

        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingLink();

        Example1Page example1Page = dynamicLoadingPage.clickExample1();

        example1Page.WaitForElementExample1();

        assertEquals(example1Page.getMessageText(), example1Page.messageText, "Error in example page 1.");

    }

    @Test
    public void testRenderElement() {

        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingLink();

        Example2page example2page = dynamicLoadingPage.clickExample2();

        example2page.WaitForElementExample2();

        assertEquals(example2page.getMessageText(), example2page.messageText, "Error in example 2 page.");
    }

}
