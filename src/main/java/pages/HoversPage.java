package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class HoversPage {

    private final WebDriver driver;
    private final By listOfImage = By.className("figure");
    private final By textOfImage = By.xpath("//div[@class='figcaption']/child::h5");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverImages() {

        List<WebElement> listOfImageElement = driver.findElements(listOfImage);


        Actions actions = new Actions(driver);


        for (WebElement webElement : listOfImageElement) {

            actions.moveToElement(webElement).perform();
            getCaption();

        }

    }

    public void getCaption() {

        List<WebElement> listOfCaptionElement = driver.findElements(textOfImage);

        for (WebElement element : listOfCaptionElement) {

            var test = element.getText();
            System.out.println(test);
        }

    }

}
