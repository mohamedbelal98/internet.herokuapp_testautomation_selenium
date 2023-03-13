package uploadFile;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FileUploadedPage;
import pages.UploadFilePage;

import static org.testng.Assert.assertEquals;

public class TestUploadFile extends BaseTest {

    @Test
    public void testUploadFile() {

        UploadFilePage uploadFilePage = homePage.clickUploadFileLink();

        FileUploadedPage fileUploadedPage =
                uploadFilePage.uploadFile("/Users/radwa/Downloads/internet.herokuapp_testautomation_selenium/FileToUpload/testPhoto.webp");

        assertEquals(fileUploadedPage.getFileName(), "testPhoto.webp", "Error in file Upload method");

    }
}
