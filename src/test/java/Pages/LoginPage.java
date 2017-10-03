package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zhukov on 4/18/2017.
 */
public class LoginPage extends BasePage {


    public LoginPage() {
    }

    //Login Page Elements

    //username field
    @FindBy(xpath = ".//*[@name='login' and @placeholder='Username']")
    private WebElement username_field;

    //password field
    @FindBy(xpath = ".//*[@name='password' and @placeholder='Password']")
    private WebElement password_field;

    //Signin button
    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement sign_in_button;



    //Login Page Methods

    //Filed out all fields on Login page with testing credentials
    public LoggedMainPage login_to_site(String username, String password) {
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        sign_in_button.click();
        return new LoggedMainPage();
    }



//end of class
}
