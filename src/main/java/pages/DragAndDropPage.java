package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    private final WebDriver driver;
    private final By elementALocator = By.id("column-a");
    private final By elementBLocator = By.id("column-b");
    private final By firstElementHeader = By.xpath("//*[@id='column-a']/header");


    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDrop() {

        WebElement elementA = driver.findElement(elementALocator);
        WebElement elementB = driver.findElement(elementBLocator);


        Actions actions = new Actions(driver);
        actions.dragAndDrop(elementB, elementA).perform();
//        actions.moveToElement(elementA).clickAndHold().moveToElement(elementB).release(elementB).build().perform();
    }

}
