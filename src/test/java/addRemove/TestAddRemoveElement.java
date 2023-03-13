package addRemove;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AddRemoveElementPage;

import static org.testng.Assert.assertEquals;

public class TestAddRemoveElement extends BaseTest {

    @Test
    public void testAddButtonAnDelete() {

        AddRemoveElementPage addRemoveElementPage = homePage.clickAddRemoveLink();

        assertEquals(addRemoveElementPage.getTitleText(), addRemoveElementPage.titleText, "Error on add and remove element page");

        addRemoveElementPage.clickAddButton();
        addRemoveElementPage.delete();

    }

    @Test
    public void testAddMoreButtonAndDelete() {

        AddRemoveElementPage addRemoveElementPage = homePage.clickAddRemoveLink();

        assertEquals(addRemoveElementPage.getTitleText(), addRemoveElementPage.titleText, "Error on add and remove element page");

        int numberOfAddButton = 10;
        for (int i = 0; i < numberOfAddButton; i++) {
            addRemoveElementPage.clickAddButton();
        }

        addRemoveElementPage.delete();

    }

}
