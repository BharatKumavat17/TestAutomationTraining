package login;

import base.BaseTest5;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class loginTests extends BaseTest5 {

    @Test
    public void successfulLogin()
    {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
        assertTrue(secureAreaPage.GetAlertText().contains("You logged into a secure area!"),"alert text incorrect");
    }
}
