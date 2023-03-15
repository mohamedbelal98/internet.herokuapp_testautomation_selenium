package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class CheckBoxPage {

    private final WebDriver driver;

    //Locator
    private final By titleTextLocator = By.xpath("//div[@class='example']/child::h3");
    private final By listOfCheckBox = By.xpath("//*[@id='checkboxes']/child::input");

    //Variables for assertion
    public final String titleText = "Checkboxes";

    //constructor
    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public String getTitleText() {

        return driver
                .findElement(titleTextLocator).getText();
    }

    public void checkBoxSelected() {

        List<WebElement> elementList = driver.findElements(listOfCheckBox);
        Actions actions = new Actions(driver);

        for (WebElement webElement : elementList) {
            boolean isSelected = webElement.isSelected();
            System.out.println(isSelected);

            if (!isSelected) {
                actions.moveToElement(webElement).click().perform();
            }
        }
    }

    public void checkBoxUnSelected() {
        List<WebElement> elementList = driver.findElements(listOfCheckBox);
        Actions actions = new Actions(driver);

        for (WebElement webElement : elementList) {
            boolean isSelected = webElement.isSelected();
            System.out.println(isSelected);

            if (isSelected) {
                actions.moveToElement(webElement).click().perform();
            }
        }
    }

}
