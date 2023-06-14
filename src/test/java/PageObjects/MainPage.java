package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public  MainPage(){
        driver.get("https://shop.spacex.com/");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/account']")
    private static WebElement btnLoginToAccount;



    public static LoginPage openLoginPage(){
        btnLoginToAccount.click();
        return new LoginPage();
    }


}
