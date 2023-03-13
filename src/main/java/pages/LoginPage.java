package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;
    private final By userNameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.className("radius");
    private final By flashMessage = By.xpath("//div[@class='flash success']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public SecureAreaPage login(String userName, String password) {

        driver.findElement(userNameInput).sendKeys(userName);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

    public String getFlashMessage() {

        return driver.findElement(flashMessage).getText();
    }

}
