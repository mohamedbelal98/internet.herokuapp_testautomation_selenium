package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private final WebDriver driver;

    //Locator
    private final By titleTextLocator = By.xpath("//div[@class='example']/h3");
    private final By boxLocator = By.id("hot-spot");

    //Variables for assertion
    public final String titleText = "Context Menu";

    //constructor
    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public String getTitleText() {

        return driver.findElement(titleTextLocator).getText();
    }

    public void boxActions() {

        WebElement element = driver.findElement(boxLocator);
        Actions actions = new Actions(driver);

        actions.contextClick(element).perform();
        driver.switchTo().alert().accept();
    }

}
