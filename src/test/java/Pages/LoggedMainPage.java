package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhukov on 4/19/2017.
 */
public class LoggedMainPage extends BasePage {


    public LoggedMainPage() {
    }

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
