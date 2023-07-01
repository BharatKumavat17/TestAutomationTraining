package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By jsAlertButton = By.xpath(".//button[text()=\"Click for JS Alert\"]");
    private By jsConfirmButton = By.xpath(".//button[text()=\"Click for JS Confirm\"]");
    private By jsPromptButton = By.xpath(".//button[text()=\"Click for JS Prompt\"]");

    //Click for JS Confirm
    private By resultText = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void triggerAlert()
    {
        driver.findElement(jsAlertButton).click();
    }

    public void triggerConfirm()
    {
        driver.findElement(jsConfirmButton).click();
    }
    public void triggerPrompt()
    {
        driver.findElement(jsPromptButton).click();
    }

    public void Alert_setInput(String Text)
    {
        driver.switchTo().alert().sendKeys(Text);
    }
    public void Alert_acceptAlert()
    {
        driver.switchTo().alert().accept();
    }
    public void Alert_DismissAlert()
    {
        driver.switchTo().alert().dismiss();
    }

    public String Alert_getText()
    {
        return driver.switchTo().alert().getText();
    }

    public String verifyResult()
    {
        return driver.findElement(resultText).getText();
    }
}
