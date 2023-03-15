package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utli.Utilities;

import java.util.List;

public class BrokenImagePage {

    private final WebDriver driver;
    private final By listOfImage = By.xpath("//div[@class='example']/child::img");

    public BrokenImagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void filterImageIsBrokenOrNot() {

        List<WebElement> elementList = driver.findElements(listOfImage);

        Utilities.filterImageBroken(driver, elementList);

    }
}
