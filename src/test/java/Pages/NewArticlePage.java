package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zhukov on 4/21/2017.
 */
public class NewArticlePage extends BasePage {

/*    NewArticlePage(WebDriver webDriver) {
        super(webDriver);
    }*/

    public NewArticlePage() {
    }

    @FindBy(xpath = ".//*[@type='text' and @name='title']")
    private WebElement article_title_field;

    @FindBy(xpath = ".//*[@name='content' and @id='content']")
    private WebElement article_content_field;

    @FindBy(xpath = ".//*[@id='tag_input' and @type='text']")
    private WebElement tag_field;

    @FindBy(xpath = ".//*[@type='submit' and @value='Create article']")
    private WebElement create_article_button;



    public NewArticlePage enter_article_title(String article_title) {
        article_title_field.sendKeys(article_title);
        return this;
    }

    public NewArticlePage enter_article_content(String article_content) {
        article_content_field.sendKeys(article_content);
        return this;
    }

    public NewArticlePage enter_article_tag(String article_tag) {
        tag_field.sendKeys(article_tag);
        return this;
    }

    public ArticlePage click_create_article_button(){
        create_article_button.click();
        return new ArticlePage();
    }

}
