package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;

import java.util.List;

public class BaseTests2 {
    private WebDriver driver;
    protected HomePage homePage;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        /*DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(ChromeOptions.CAPABILITY,options);
        options.merge(dc);*/

        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/");
        //homePage = new HomePage(driver);
        driver.manage().window().maximize();

        WebElement inputlink = driver.findElement(By.linkText("Inputs"));
        inputlink.click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());


        System.out.println(driver.getTitle());
        //.quit(); //It close tab along with session
    }

    public static void main(String[] args)
    {
        BaseTests2 test = new BaseTests2();
        test.setup();
    }
}
