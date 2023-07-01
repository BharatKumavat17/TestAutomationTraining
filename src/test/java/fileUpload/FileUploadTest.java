package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTests {
    @Test
    public void testFileUpload()
    {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("E:\\Learning\\JavaProjects\\SeleniumWebDriver\\resources\\chromedriver.exe");

    }
}
