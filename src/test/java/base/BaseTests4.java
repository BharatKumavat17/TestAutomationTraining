package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class BaseTests4 {
    private WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/");

        WebElement ShiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        ShiftingContentLink.click();

        WebElement Example1MenuLink = driver.findElement(By.cssSelector("a[href*=menu]"));
        Example1MenuLink.click();

        List<WebElement> MenuElements = driver.findElements(By.cssSelector("li > a"));
        System.out.println(MenuElements.size());

        for(int i=0;i<=MenuElements.size()-1;i++)
        {
            System.out.println(MenuElements.get(i).getText());
        }
    }
    public void tear()
    {
        driver.close();
    }
    public static void main(String[] args)
    {
        BaseTests4 test = new BaseTests4();
        test.setup();
        test.tear();
    }
}


