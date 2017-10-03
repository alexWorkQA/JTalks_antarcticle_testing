package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Administrator on 4/18/2017.
 */
public class MainPage extends BasePage {

    public MainPage() {
    }

    // Main Page Elements

    //Sign in button
    @FindBy(xpath = ".//*[@href='/antarcticle/signin']")
    private WebElement SignIn_button;

    @FindBy(xpath = ".//*[@href='/antarcticle/signup']")
    private WebElement SignUp_button;


    //Main Page methods

    //Click "Sign in" button on main page
    public LoginPage clickSignInButton() {
        SignIn_button.click();
        return new LoginPage();
    }

    public RegisterAccountPage clickSignUpButton() {
        SignUp_button.click();
        return new RegisterAccountPage();
    }

//end of class


    //Main Page when user is logged in
    @FindBy(xpath = ".//*[@class='dropdown-toggle' and @href='#']")
    private WebElement dropdown_menu_user;

    @FindBy(xpath = ".//*[@class='btn btn-lg btn-primary btn-new-article']")
    private WebElement create_article_button;

    @FindBy(xpath = ".//*[@href='/antarcticle/signout']")
    private WebElement sign_out_button;


    //Methods for Main Page when user is logged in

    //methods used in Assert for checkin of username on page in drop-down menu
    public String get_usrename_from_dropmenu() {
        return dropdown_menu_user.getText();
    }

    public MainPage logoutFromSite() {
        dropdown_menu_user.click();
        sign_out_button.click();
        return new MainPage();
    }

    public NewArticlePage clickCreateButtonClick() {
        create_article_button.click();
        return new NewArticlePage();
    }

    public List<WebElement> getTagsListForAssert() {
        return webDriver.findElements(By.xpath(".//*[@class='pull-right tm-tag tm-tag-default']"));
    }

//end of class
}
