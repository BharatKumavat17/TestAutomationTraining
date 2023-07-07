package wait;

import base.BaseTest5;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest5 {
    @Test
    public void testWaitUntilHidden()
    {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(),"Hello World!","LoadedText Incorrect");
    }
    @Test
    public void testWaitUntilHidden2()
    {
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(),"Hello World!","LoadedText Incorrect");
    }
}
