package PageObjects;

import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public  MainPage(){
        driver.get("https://shop.spacex.com/");
        PageFactory.initElements(driver, this);
    }




}