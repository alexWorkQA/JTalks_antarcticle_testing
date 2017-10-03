package Helpers;

import Factories.ArticleFactory;
import Pages.NewArticlePage;

public class NewArticleHelper extends NewArticlePage {
    public NewArticleHelper() {
    }

    public void createNewValidArticle(){
        enter_article_title(ArticleFactory.getValidArticleAllFields().getTitle());
        enter_article_content(ArticleFactory.getValidArticleAllFields().getContent());
        enter_article_tag(ArticleFactory.getValidArticleAllFields().getTag());
        click_create_article_button();
    }
}
