package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utli.Utilities;

public class LargeAndDeepDOMPage {

    private final WebDriver driver;

    //locator
    private final By table = By.id("large-table");
    private final By endOfTable = By.id("header-50");

    public LargeAndDeepDOMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scroll() {

        WebElement verticalScrollElement = driver.findElement(table);
        WebElement horizontalScrollElement = driver.findElement(endOfTable);
        String script = "arguments[0].scrollIntoView();";

        Utilities.javaScriptExecutor(driver, verticalScrollElement, script);
        Utilities.javaScriptExecutor(driver, horizontalScrollElement, script);
    }

}
