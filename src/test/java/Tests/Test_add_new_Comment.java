package Tests;

import Factories.CommentFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_add_new_Comment extends BaseTest {


    @BeforeMethod
    public void setUp() throws Exception {
        app.common.openWebSite();
    }

    @Test(description = "User is able to add new comment to created article")
    public void testAddNewComment() throws Exception {
    app.mainHelper.openSignInPage();
    app.loginHelper.loginValidUser();
    app.mainHelper.openCreateNewArticlePage();
    app.newArticleHelper.createNewValidArticle();
    app.articleHelper.addNewValidComment();
    Assert.assertEquals(app.articleHelper.getCommentTextForAssert(),CommentFactory.getValidComment().getCommentText());
    }


}
