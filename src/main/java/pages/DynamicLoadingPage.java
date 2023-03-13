package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private final WebDriver driver;

    //Locator
    private final By example1 = By.linkText("Example 1: Element on page that is hidden");
    private final By example2 = By.linkText("Example 2: Element rendered after the fact");

    //constructor
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public Example1Page clickExample1() {

        driver.findElement(example1).click();
        return new Example1Page(driver);
    }

    public Example2page clickExample2() {

        driver.findElement(example2).click();
        return new Example2page(driver);
    }

}
