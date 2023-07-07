package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //private By formsAuthentication = By.linkText("Form Authentication");
    private WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication()
    {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public HoversPage clickHovers()
    {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses()
    {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public JavaScriptAlertsPage clickJavaScriptAlerts()
    {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
    public FileUploadPage clickFileUpload()
    {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public DropdownPage clickDropdown()
    {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword()
    {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }
    public FramePage clickFrame()
    {
        clickLink("WYSIWYG Editor");
        return new FramePage(driver);
    }
    public DynamicLoadPage clickDynamicLoading()
    {
        clickLink("Dynamic Loading");
        return new DynamicLoadPage(driver);
    }
    public void clickLink(String Link)
    {
        driver.findElement(By.linkText(Link)).click();
    }
}
