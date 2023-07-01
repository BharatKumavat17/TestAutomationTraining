package forgotPassword;

import base.BaseTest5;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest5 {
    @Test
    public void SuccessfulEmailSentPage()
    {
        var ForgotPassword = homePage.clickForgotPassword();
        ForgotPassword.EnterEmail("Test@yopmail.com");
        var EmailSent = ForgotPassword.clickRetrievepasswordButton();
        var ConfirmText = EmailSent.getText();
        Assert.assertTrue(ConfirmText.contains("Text"),"Email not sent");
    }

}
