package frame;

import base.BaseTest5;
import org.testng.annotations.Test;
import pages.FramePage;

import static org.testng.Assert.assertTrue;

public class FramePageTest extends BaseTest5 {
    String text1 = "Hello";
    String text2 = "World";
   //protected FramePage framePage1;
    @Test
    public void enterValueInFrame()
    {

        FramePage framePage1;
        framePage1 = homePage.clickFrame();
        framePage1.clearTextArea();

        framePage1.enterText(text1);

        assertTrue(framePage1.getValueFromEditor().contains(text1),"wrong Text");
        //assertTrue(framepage1.getValueFromEditor().contains(text1),"Wrong Text");


    }
}
