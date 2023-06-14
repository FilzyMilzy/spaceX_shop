package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public  LoginPage(){
        driver.get("https://shop.spacex.com/account/login?return_url=%2Faccount");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header[@id='section-header']//a[@href='/account']")
    private static WebElement btnLoginToAccount;

    //Login Form fields
    @FindBy(xpath = "//input[@name='customer[email]']")
    private static WebElement customerEmail;
    @FindBy (xpath = "//input[@name='customer[password]']")
    private static WebElement customerPassword;
    @FindBy(xpath = "//form[@id='customer_login']//button[@type='submit']")
    private static WebElement btnSubmit;

    @FindBy (xpath = "")
    private static WebElement btnForgotPassword;

    @FindBy(xpath = "//a[@href='/account/register']")
    private static WebElement btnCreateAccount;


    //Recovery Form fields
    @FindBy(xpath="//input[@name='email']")
    private static WebElement recoveryEmail;
    @FindBy(xpath = "//form[@id='recover_customer_password']//button[@type='submit']")
    private static WebElement btnSubmitRecovery;

    private static String pageTitle = "\n' +  '      Account – SpaceX Store\n' + '    ";

    public static String loginPageTitle(){
        return pageTitle;
    }

    public static void clickAccountBtn(){
        btnLoginToAccount.click();
    }

    public static RegisterPage clickRegisterBtn(){
        btnCreateAccount.click();
        return new RegisterPage();
    }
    public static AccountPage auth(String loginValue, String passwordValue){
        customerEmail.sendKeys(loginValue);
        customerPassword.sendKeys(passwordValue, Keys.ENTER);
        //btnSubmit.click();
        return new AccountPage();
    }
}
