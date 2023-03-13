package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABPage {

    private final WebDriver driver;

    //Locator
    private final By titleText = By.xpath("//div[@class='example']/child::h3");
    private final By bodyText = By.xpath("//div[@class='example']/child::p");


    //Variables for assertion
    public final String titleTextForAssertion = "A/B Test Variation 1";
    public final String bodyTextForAssertion =
            "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";


    //constructor
    public ABPage(WebDriver driver) {
        this.driver = driver;
    }


    //Methods
    public String getTitleText() {

        return driver.findElement(titleText).getText();
    }

    public String getBodyText() {

        return driver.findElement(bodyText).getText();
    }

}
