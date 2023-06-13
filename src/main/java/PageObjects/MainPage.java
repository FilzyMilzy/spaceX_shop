package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//header[@class='header']//a[@href='/pro-nas']")
    private static WebElement btnAboutUs;

    public static void ClickAboutUs(){btnAboutUs.click();}


}
