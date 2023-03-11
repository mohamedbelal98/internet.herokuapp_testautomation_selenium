package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private final WebDriver driver;
    private final By titleTextLocator = By.xpath("//div[@class='example']/h3");
    private final By boxLocator = By.id("hot-spot");

    public final String titleText = "Context Menu";

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

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
