package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTest5 {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

    }

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }

}
