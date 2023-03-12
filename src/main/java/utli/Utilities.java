package utli;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


public class Utilities {

    public static void takeScreenShot(WebDriver driver, String filePath) throws IOException {

        TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcFile, new File(filePath));
    }

    public static void waitStrategyVisibility(WebDriver driver, By element, int timeInSeconds) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void waitStrategyTextPresent(WebDriver driver, WebElement element, String text, int timeInSeconds) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public static void waitStrategyToBeClickable(WebDriver driver, WebElement element, int timeInSeconds) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void javaScriptExecutor(WebDriver driver, WebElement webElement, String script) {

        //String script = "arguments[0].scrollIntoView();";
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript(script, webElement);
    }

    public static void filterImageBroken(WebDriver driver, List<WebElement> elementList) {

        int brokenImage = 0;
        int nonBrokenImage = 0;
        try {

            for (WebElement element : elementList) {

                if (element.getAttribute("naturalWidth").equals("0")) {

                    System.out.println("Image " + element.getAttribute("src") + " is broken.");
                    brokenImage++;
                } else {

                    System.out.println("Image " + element.getAttribute("src") + " is NOT broken.");
                    var test = element.getAttribute("src");
                    System.out.println(test);
                    driver.switchTo().newWindow(WindowType.TAB);
                    driver.get(test);
                    nonBrokenImage++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Count number of broken image : " + brokenImage);
        System.out.println("Count number of non broken image : " + nonBrokenImage);
    }

}
