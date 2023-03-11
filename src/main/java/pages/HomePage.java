package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final By abTestingLink = By.linkText("A/B Testing");
    private final By addRemoveLink = By.linkText("Add/Remove Elements");
    private final By brokenImageLink = By.linkText("Broken Images");
    private final By checkBoxLink = By.linkText("Checkboxes");
    private final By contextMenuLink = By.linkText("Context Menu");

    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public ABPage clickABLink() {

        driver.findElement(abTestingLink).click();
        return new ABPage(driver);
    }

    public AddRemoveElementPage clickAddRemoveLink() {

        driver.findElement(addRemoveLink).click();
        return new AddRemoveElementPage(driver);
    }

    public BrokenImagePage clickBrokenImageLink() {

        driver.findElement(brokenImageLink).click();
        return new BrokenImagePage(driver);
    }

    public CheckBoxPage clickCheckBoxLink() {

        driver.findElement(checkBoxLink).click();
        return new CheckBoxPage(driver);
    }

    public ContextMenuPage clickContextMenuLink() {

        driver.findElement(contextMenuLink).click();
        return new ContextMenuPage(driver);
    }

}
