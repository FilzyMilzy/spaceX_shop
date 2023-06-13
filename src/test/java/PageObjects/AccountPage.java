package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(xpath="//a[@href='/account/logout']")
    private static WebElement btnLogout;


    public MainPage logoutFromAccount(){
        btnLogout.click();
        return new MainPage();
    }
}
