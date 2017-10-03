package Factories;

import Models.Article;
import Pages.ArticlePage;

import java.util.HashMap;
import java.util.ResourceBundle;

public class ArticleFactory {

    static ResourceBundle resourceArticle;

    static {
        resourceArticle = ResourceBundle.getBundle("articles");
    }

    public static Article getValidArticleAllFields() {
        Article article = new Article();
        article.setTitle(resourceArticle.getString("article.validTitle"));
        article.setContent(resourceArticle.getString("article.validContent"));
        article.setAuthor(resourceArticle.getString("article.validAuthor"));
        article.setTag(resourceArticle.getString("article.validTag"));
        return article;
    }

    public static Article getArticleTitle() {
        Article article = new Article();
        article.setTitle(resourceArticle.getString("article.validTitle"));
        return article;
    }

    public static HashMap<String, String> get_example_map_for_Assert() {
        HashMap<String, String> example = new HashMap<>();
        example.put("article_title", resourceArticle.getString("article.validTitle"));
        example.put("article_content", resourceArticle.getString("article.validContent"));
        example.put("article_tag", resourceArticle.getString("article.validTag"));
        example.put("article_author", resourceArticle.getString("article.validAuthor"));
        return example;
    }

}
