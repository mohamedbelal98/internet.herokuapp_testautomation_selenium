package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {

    private final WebDriver driver;

    //Locator
    private final By chooseFileButton = By.id("file-upload");
    private final By uploadFileButton = By.id("file-submit");

    //Constructor
    public UploadFilePage(WebDriver driver) {
        this.driver = driver;
    }

    //Method
    public FileUploadedPage uploadFile(String pathName) {

        driver.findElement(chooseFileButton).sendKeys(pathName);
        driver.findElement(uploadFileButton).click();
        return new FileUploadedPage(driver);
    }

}
