package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    //Locator
    private final By abTestingLink = By.linkText("A/B Testing");
    private final By addRemoveLink = By.linkText("Add/Remove Elements");
    private final By brokenImageLink = By.linkText("Broken Images");
    private final By checkBoxLink = By.linkText("Checkboxes");
    private final By contextMenuLink = By.linkText("Context Menu");
    private final By dragAndDropLink = By.linkText("Drag and Drop");
    private final By dropDropMenuLink = By.linkText("Dropdown");
    private final By dynamicControlsLink = By.linkText("Dynamic Controls");
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private final By uploadFileLink = By.linkText("File Upload");
    private final By fromAuthentication = By.linkText("Form Authentication");
    private final By horizontalSliderLink = By.linkText("Horizontal Slider");
    private final By hoversLink = By.linkText("Hovers");
    private final By javascriptAlertLink = By.linkText("JavaScript Alerts");
    private final By largeAndDeepDOMLink = By.linkText("Large & Deep DOM");

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

    public DragAndDropPage clickDragAndDropLink() {

        driver.findElement(dragAndDropLink).click();
        return new DragAndDropPage(driver);
    }

    public DropDownMenuPage clickDropDownMenuLink() {

        driver.findElement(dropDropMenuLink).click();
        return new DropDownMenuPage(driver);
    }

    public DynamicControlsPage clickDynamicControlsLink() {

        driver.findElement(dynamicControlsLink).click();
        return new DynamicControlsPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink() {

        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }

    public UploadFilePage clickUploadFileLink() {

        driver.findElement(uploadFileLink).click();
        return new UploadFilePage(driver);
    }

    public LoginPage clickFromAuthenticationLink() {

        driver.findElement(fromAuthentication).click();
        return new LoginPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink() {

        driver.findElement(horizontalSliderLink).click();
        return new HorizontalSliderPage(driver);
    }

    public HoversPage clickHoversLink() {

        driver.findElement(hoversLink).click();
        return new HoversPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlertsLink() {

        driver.findElement(javascriptAlertLink).click();
        return new JavaScriptAlertsPage(driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOMLink() {

        driver.findElement(largeAndDeepDOMLink).click();
        return new LargeAndDeepDOMPage(driver);
    }

}
