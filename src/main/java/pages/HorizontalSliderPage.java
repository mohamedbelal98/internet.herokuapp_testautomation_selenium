package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HorizontalSliderPage {

    private final WebDriver driver;

    //Locator
    private final By slider = By.xpath("//input[@type='range']");
    private final By number = By.xpath("//span[@id='range']");

    //constructor
    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public String getNumber() {

        return driver.findElement(number).getText();
    }

    public void slider(String value) {

        while (!getNumber().equals(value)) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

}
