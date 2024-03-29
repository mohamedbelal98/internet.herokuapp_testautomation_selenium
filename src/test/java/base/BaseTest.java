package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utli.Utilities;

import java.io.IOException;
import java.util.Date;
import java.util.Set;

public class BaseTest {

    WebDriver driver;
    protected HomePage homePage;
    Date date = new Date();
    String currentDate = date + "";

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        goHome();

        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {

        driver.get("https://the-internet.herokuapp.com/");
    }

//    @AfterClass
//    public void tearDown() {
//
//        driver.quit();
//    }

    @AfterMethod
    public void failed_screenShot(ITestResult iTestResult) throws IOException {

        if (iTestResult.getStatus() == ITestResult.FAILURE) {
            Utilities.takeScreenShot(driver, "screenShot/" + iTestResult.getName() + currentDate + ".png");
        }

    }

    public Set<String> getSetWindows() {

        return driver.getWindowHandles();
    }

    public void switchWindows(String window) {

        driver.switchTo().window(window);
    }

}
