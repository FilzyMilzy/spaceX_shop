package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy (xpath = "//input[@name='customer[first_name]']")
    private static WebElement firstName;

    //Form fields
    @FindBy (xpath = "//input[@name='customer[last_name]']")
    private static WebElement lastName;
    @FindBy (xpath = "//input[@name='customer[email]']")
    private static WebElement customerEmail;
    @FindBy (xpath = "//input[@name='customer[password]']")
    private static WebElement customerPassword;
    @FindBy (xpath = "//button[@type='submit']")
    private static WebElement btnSubmit;

    public static CaptchaPage createAccount(String nameValue, String lastnameValue, String emailValue, String passwordValue){
        firstName.sendKeys(nameValue);
        lastName.sendKeys(lastnameValue);
        customerEmail.sendKeys(emailValue);
        customerPassword.sendKeys(passwordValue, Keys.ENTER);
        return new CaptchaPage(); //decide on naming and implementation since..well.. Ajax
        //Captcha workaround implementation
        //Assertion on successful account creation

    }




}
