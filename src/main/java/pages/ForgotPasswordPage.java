package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;
    private By emailText = By.id("email");
    private By RetrievepasswordButton = By.id("form_submit");
    public ForgotPasswordPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void EnterEmail(String email)
    {
        driver.findElement(emailText).sendKeys(email);
    }

    public EmailSentPage clickRetrievepasswordButton()
    {
        driver.findElement(RetrievepasswordButton).click();
        return new EmailSentPage(driver);
    }

}
