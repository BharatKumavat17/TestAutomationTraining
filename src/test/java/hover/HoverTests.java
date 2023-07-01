package hover;

import base.BaseTests;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.HomePage;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverOverUSer1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption Not displayed");
        assertTrue(caption.getTitle().contains("user1"),"Test");


    }
}
