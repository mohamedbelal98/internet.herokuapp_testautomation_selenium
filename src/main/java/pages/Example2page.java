package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utli.Utilities;

public class Example2page {

    private final WebDriver driver;

    //Locator
    private final By startButton = By.xpath("//div[@id='start']/child::button");
    private final By helloWorldMessage = By.xpath("//div[@id='finish']/child::h4");

    public final String messageText = "Hello World!";
    public Example2page(WebDriver driver) {
        this.driver = driver;
    }

    public void WaitForElementExample2() {

        driver.findElement(startButton).click();

        Utilities.waitStrategyVisibility(driver, helloWorldMessage, 20);
    }

    public String getMessageText() {

        return driver.findElement(helloWorldMessage).getText();
    }

}
