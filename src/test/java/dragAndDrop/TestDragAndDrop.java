package dragAndDrop;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class TestDragAndDrop extends BaseTest {

    @Test
    public void testDragAndDrop() throws InterruptedException {

        DragAndDropPage dragAndDropPage = homePage.clickDragAndDropLink();

        dragAndDropPage.dragAndDrop();


    }

}
