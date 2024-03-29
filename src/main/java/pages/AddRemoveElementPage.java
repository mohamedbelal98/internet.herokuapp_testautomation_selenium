package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElementPage {

    private final WebDriver driver;

    //Locator
    private final By titlePageText = By.xpath("//div[@id='content']/child::h3");
    private final By addButton = By.xpath("//div[@class='example']/child::button");
    private final By deleteButtonList = By.xpath("//div[@id='elements']/child::button");

    //Variables for assertion
    public final String titleText = "Add/Remove Elements";

    //constructor

    public AddRemoveElementPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public String getTitleText() {

        return driver.findElement(titlePageText).getText();
    }

    public void clickAddButton() {

        driver.findElement(addButton).click();
    }

    public void delete() {

        List<WebElement> elementList = driver.findElements(deleteButtonList);

        for (WebElement element : elementList) {
            element.click();
        }
    }

}
