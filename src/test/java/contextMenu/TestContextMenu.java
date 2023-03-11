package contextMenu;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class TestContextMenu extends BaseTest {

    @Test
    public void testContextMenuAction() {

        ContextMenuPage contextMenuPage = homePage.clickContextMenuLink();

        assertEquals(contextMenuPage.getTitleText(), contextMenuPage.titleText, "Error in context menu page");

        contextMenuPage.boxActions();
    }
}
