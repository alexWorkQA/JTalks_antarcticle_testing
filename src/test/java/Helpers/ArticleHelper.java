package Helpers;

import Pages.ArticlePage;

import java.util.HashMap;

public class ArticleHelper extends ArticlePage {
    public ArticleHelper() {
    }

    public HashMap<String, String> get_test_map_forAssert() {
        HashMap<String, String> test = new HashMap<>();
        test.put("article_title", get_ArticleTitle());
        test.put("article_content", get_ArticleContent());
        test.put("article_tag", get_ArticleTag());
        test.put("article_author", get_ArticleAuthor());
        return test;
    }

    public void deleteCreatedArticle() {
        delete_Article();
        clickOkButton();
    }

    public void openPageWithArticleByUrl(String url) throws InterruptedException {
        Thread.sleep(500);
        webDriver.navigate().to(url);
    }

    public String getUrlOfArticle() {
        return webDriver.getCurrentUrl();
    }
}
