package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private final WebDriver driver;
    private final By flashMessage = By.xpath("//div[@id='flash']");
    private final By logOutButton = By.xpath("//a[@class='button secondary radius']/child::i");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFlashMessage() {

        return driver.findElement(flashMessage).getText();
    }

    public LoginPage clickLgOut() {

        driver.findElement(logOutButton).click();
        return new LoginPage(driver);
    }
}
