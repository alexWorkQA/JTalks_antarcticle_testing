package Tests;

import Factories.ArticleFactory;
import Factories.UserFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGroup_second extends BaseTest {

    @BeforeClass
    public void openWebSite() throws Exception {
        app.common.openWebSite();
    }

    @Test(description = "test should check that valid user is able to login to site")
    public void validUserIsAbleToLogin() throws Exception {
        app.mainHelper.openSignInPage();
        app.loginHelper.loginValidUser();
        Assert.assertEquals(app.mainHelper.getUserNameForAssert(), UserFactory.getValidUser().getLogin());
    }

    @Test(description = "user is able to create new valid article", dependsOnMethods = "validUserIsAbleToLogin")
    public void userIsAbleToCreateNewArticle() throws Exception {
        app.mainHelper.openCreateNewArticlePage();
        app.newArticleHelper.createNewValidArticle();
        Assert.assertEquals(app.articleHelper.get_test_map_forAssert(), ArticleFactory.get_example_map_for_Assert());
    }

    @Test(description = "user is able to delete new created article", dependsOnMethods = "userIsAbleToCreateNewArticle")
    public void userIsAbleToDeleteCreatedArticle() throws Exception {
        String urlArticle = app.articleHelper.getUrlOfArticle();
        app.articleHelper.deleteCreatedArticle();
        app.articleHelper.openPageWithArticleByUrl(urlArticle);
        Assert.assertEquals(app.mainHelper.getTitle(),"Page not found");
    }

    @AfterClass
    public void closeWebBrowser() throws Exception {
        app.mainHelper.logOut_FromSite();
    }
}
