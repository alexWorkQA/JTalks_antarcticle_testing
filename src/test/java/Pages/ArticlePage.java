package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

/**
 * Created by zhukov on 4/25/2017.
 */
public class ArticlePage extends BasePage {

/*    public ArticlePage(WebDriver webDriver) {
        super(webDriver);
    }*/

    public ArticlePage() {
    }

    //Page WebElements
    @FindBy(xpath = ".//*[@class='article-header']/h2")
    private WebElement article_title;

    @FindBy(xpath = ".//*[@class='footer-element']/a")
    private WebElement article_author;

    @FindBy(xpath = ".//*[@class='pull-right tm-tag tm-tag-default']")
    private WebElement article_tag;

    @FindBy(xpath = ".//*[@class='content clearfix']/p")
    private WebElement article_content;

    @FindBy(xpath = ".//*[@class='day']")
    private WebElement article_date_day;

    @FindBy(xpath = ".//*[@class='month']")
    private WebElement article_date_month;

    @FindBy(xpath = ".//*[@class='year']")
    private WebElement article_date_yaer;

    @FindBy(xpath = ".//*[@class='btn btn-sm btn-danger delete-link article-toolbar']")
    private WebElement delete_button;

    @FindBy(xpath = ".//*[@class='btn btn-primary']")
    private WebElement ok_button;


    //Page Methods
    public String get_ArticleTitle() {
        return article_title.getText();
    }

    public String get_ArticleAuthor() {
        return article_author.getText();
    }

    public String get_ArticleContent() {
        return article_content.getText();
    }

    public String get_ArticleTag() {
        return article_tag.getText();
    }

    public void delete_Article() {
        delete_button.click();
    }

    public void clickOkButton() {
        ok_button.sendKeys(Keys.ENTER);
    }

}
