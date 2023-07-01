package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeClass
    public void BaseTests()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        goHome();

        driver.manage().window().maximize();

        driver.manage().window().setSize(new Dimension(800,500));

        System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
        //.quit(); //It close tab along with sessionreturn new HomePage(driver);
    }
    @BeforeMethod
    public void goHome()
    {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void Teardown()
    {
        driver.quit();
    }
}
