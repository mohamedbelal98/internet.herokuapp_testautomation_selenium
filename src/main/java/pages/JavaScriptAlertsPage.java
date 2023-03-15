package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private final WebDriver driver;

    //Locators
    private final By result = By.id("result");
    private final By alertButton = By.xpath("//button[text()='Click for JS Alert']");
    private final By confirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private final By promptButton = By.xpath("//button[text()='Click for JS Prompt']");

    //constructor
    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public String getResultText() {

        return driver.findElement(result).getText();
    }

    public void acceptAnyAlert() {

        driver.switchTo().alert().accept();
    }

    public void dismissAnyAlert() {

        driver.switchTo().alert().dismiss();
    }

    public void alert() {

        driver.findElement(alertButton).click();
        acceptAnyAlert();
    }

    public void acceptConfirmAlert() {

        driver.findElement(confirmButton).click();
        acceptAnyAlert();
    }

    public void dismissConfirmAlert() {

        driver.findElement(confirmButton).click();
        dismissAnyAlert();
    }

    public void inputPrompt(String value) {

        driver.switchTo().alert().sendKeys(value);
    }

    public void confirmPromptAlert(String value) {

        driver.findElement(promptButton).click();
        inputPrompt(value);
        acceptAnyAlert();
    }

    public void dismissPromptAlert(String value) {

        driver.findElement(promptButton).click();
        inputPrompt(value);
        dismissAnyAlert();
    }

}
