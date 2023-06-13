package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

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


}
