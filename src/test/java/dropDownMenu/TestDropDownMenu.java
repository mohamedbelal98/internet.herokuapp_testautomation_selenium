package dropDownMenu;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownMenuPage;

public class TestDropDownMenu extends BaseTest {

    @Test
    public void testDropDownMenu() {

        DropDownMenuPage dropDownMenuPage = homePage.clickDropDownMenuLink();

        var allOptions = dropDownMenuPage.getAllOptions();
        System.out.println(allOptions);

        var option = allOptions.get(2);
        System.out.println(option);

        dropDownMenuPage.selectFromDropDownMenu(option);
    }
}
