package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultField = By.id("result");
    public KeyPressesPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterText(String Text)
    {
        driver.findElement(inputField).sendKeys(Text);
    }

    public void enterPi()
    {
        enterText(Keys.chord(Keys.ALT,"p")+"=3.14");
    }
    public String getResult()
    {
        return driver.findElement(resultField).getText();
    }
}
