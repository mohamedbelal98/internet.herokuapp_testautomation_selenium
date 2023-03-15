package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownMenuPage {

    private final WebDriver driver;

    //Locator
    private final By dropDownMenuLocator = By.id("dropdown");

    //constructor
    public DropDownMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public Select findDropDownMenu() {

        return new Select(driver.findElement(dropDownMenuLocator));
    }

    public List<String> getAllOptions() {

        List<WebElement> elementList = findDropDownMenu().getOptions();
        return elementList.stream().map(WebElement::getText).toList();
    }

    public void selectFromDropDownMenu(String option) {

        findDropDownMenu().selectByVisibleText(option);
    }

}
