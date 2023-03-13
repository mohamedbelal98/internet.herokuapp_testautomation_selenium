package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadedPage {

    private final WebDriver driver;
    private final By fileName = By.id("uploaded-files");

    public FileUploadedPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFileName() {

        var test = driver.findElement(fileName).getText();
        System.out.println(test);
        return test;
    }

}
