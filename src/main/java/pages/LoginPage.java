package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By UserName = By.id("username");
    private By Password = By.id("password");
    private By Login = By.className("radius");

    public LoginPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void setUserName(String userName)
    {
        driver.findElement(UserName).sendKeys(userName);
    }

    public void setPassword(String password)
    {
        driver.findElement(Password).sendKeys(password);
    }

    public SecureAreaPage ClickLoginButton()
    {
        driver.findElement(Login).click();
        return new SecureAreaPage(driver);
    }
}
