package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utli.Utilities;

import java.util.Objects;


public class DynamicControlsPage {

    private final WebDriver driver;

    //Locator
    private final By inputButton = By.xpath("//form[@id='input-example']/child::button");
    private final By inputField = By.xpath("//form[@id='input-example']/child::input");
    private final By messageText = By.xpath("//p[@id='message']");
    private final By addAndRemoveButton = By.xpath("//form[@id='checkbox-example']/child::button");
    private final By checkBoxInput = By.xpath("//div[@id='checkbox']/child::input");
    private final By checkBoxAfterRemove = By.xpath("//input[@id='checkbox']");

    public final String disableMessage = "It's disabled!";

    //constructor
    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public void dynamicControlInputField() {

        WebElement inputFieldElement = driver.findElement(inputField);

        driver.findElement(inputButton).click();

        Utilities.waitStrategyToBeClickable(driver, inputFieldElement, 20);

        driver.findElement(inputField).sendKeys("test");

        driver.findElement(inputButton).click();

        Utilities.waitStrategyVisibility(driver, messageText, 20);

    }

    public String getMessageText() {

        return driver.findElement(messageText).getText();
    }

    public void dynamicControlCheckBox() {

        driver.findElement(checkBoxInput).click();

        driver.findElement(addAndRemoveButton).click();

        Utilities.waitStrategyVisibility(driver, messageText, 20);

        var getMessageText = driver.findElement(messageText).getText();

        if (Objects.equals(getMessageText, "It's gone!")) {

            driver.findElement(addAndRemoveButton).click();

            Utilities.waitStrategyVisibility(driver, messageText, 20);

            driver.findElement(checkBoxAfterRemove).click();

        }
    }

}
