package alerts;

import base.BaseTests;
import  org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JsAlertsTest extends BaseTests {

    @Test
    public void testJsAlert()
    {
        var jsAlertPage = homePage.clickJavaScriptAlerts();
        jsAlertPage.triggerAlert();
        jsAlertPage.Alert_acceptAlert();
        assertEquals(jsAlertPage.verifyResult(),"You successfully clicked an alert", "Incorrect Result");
    }

    @Test
    public void testConfirmDismissAlert()
    {
        var jsAlertPage = homePage.clickJavaScriptAlerts();
        jsAlertPage.triggerConfirm();
        jsAlertPage.Alert_DismissAlert();
        String text = jsAlertPage.Alert_getText();
        assertEquals(text,"I am a JS Confirm", "Incorrect Result");
    }

    @Test
    public void testPromptAlert()
    {
        String text = "Text value";
        var jsAlertPage = homePage.clickJavaScriptAlerts();
        jsAlertPage.triggerPrompt();
        jsAlertPage.Alert_setInput(text);
        //String text = jsAlertPage.Alert_getText();
        assertEquals(jsAlertPage.verifyResult(),"You entered: "+text, "Incorrect Result");
    }


}
