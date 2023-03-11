package checkBox;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

import static org.testng.Assert.assertEquals;

public class TestCheckBox extends BaseTest {

    @Test
    public void testCheckBoxSelected() {

        CheckBoxPage checkBoxPage = homePage.clickCheckBoxLink();

        assertEquals(checkBoxPage.getTitleText(), checkBoxPage.titleText, "Error in checkBox page");

        checkBoxPage.checkBoxSelected();
    }

    @Test
    public void testCheckBoxUnSelected() {

        CheckBoxPage checkBoxPage = homePage.clickCheckBoxLink();

        assertEquals(checkBoxPage.getTitleText(), checkBoxPage.titleText, "Error in checkBox page");

        checkBoxPage.checkBoxUnSelected();
    }
}
