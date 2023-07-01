package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class BaseTests3 {
    private WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

        WebElement Inputlink = driver.findElement(By.linkText("Inputs"));
        Inputlink.click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());


        System.out.println(driver.getTitle());
        //.quit(); //It close tab along with session
    }

    public static void main(String[] args)
    {
        BaseTests3 test = new BaseTests3();
        test.setup();
    }
}
