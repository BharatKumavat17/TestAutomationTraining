package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {

    WebDriver driver;
    private By StartButton = By.cssSelector("#start > button");
    private By LoadingIndicator = By.id("loading");
    private By LoadingText = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver=driver;
    }

    public void clickStart()
    {
        driver.findElement(StartButton).click();
        //Explicit Wait Example
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(LoadingIndicator)));

        FluentWait wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(LoadingIndicator)));
    }

    public String getLoadedText()
    {
        return driver.findElement(LoadingText).getText();
    }
}
