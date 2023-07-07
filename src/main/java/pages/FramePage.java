package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    protected WebDriver driver;
    public String editorIframeID= "mce_0_ifr";
    private  By frameArea = By.id(editorIframeID);
    private By textArea = By.cssSelector("#tinymce > p");

    public FramePage (WebDriver driver)
    {
        this.driver = driver;
    }
    public void switchToEditArea()
    {
        driver.switchTo().frame(driver.findElement(frameArea));
    }
    public void clearTextArea()
    {
        switchToEditArea();
        driver.findElement(textArea).clear();
        SwitchToMainFrame();
    }
    public void enterText(String Text)
    {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(Text);
        SwitchToMainFrame();

    }

    public void SwitchToMainFrame()
    {
        driver.switchTo().parentFrame();
    }


    public String getValueFromEditor()
    {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        SwitchToMainFrame();
        return text;

    }
}
