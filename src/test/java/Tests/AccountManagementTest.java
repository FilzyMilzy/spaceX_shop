package Tests;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import org.junit.Test;

public class AccountManagementTest extends BaseTest{

    @Test
    public void userCanLoginWithValidCredentials() throws InterruptedException {
        String email = "registered_email@mailinator.com";
        String password = "TestPassword1493";
        LoginPage loginPage= new LoginPage();
        loginPage.clickAccountBtn(); //might wanna setup proper cookies instead
        Thread.sleep(3000);
        loginPage.auth(email, password);
        //must implement reCaptcha workaround before any asserts
    }

    @Test
    public void userCanCreateNewAccount(){
        String name = "John";
        String lastname = "Smith";
        String email = Helpers.UniqueIdentifier.getUniqueId("@mailinator.com");
        String password = "SomeTestP@ssword1034";

    }

}
