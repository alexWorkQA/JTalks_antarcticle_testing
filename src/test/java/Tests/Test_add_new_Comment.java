package Tests;

import Factories.CommentFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_add_new_Comment extends BaseTest {


    @Test(description = "User is able to add new comment to created article")
    public void testAddNewComment() throws Exception {
    app.common.openWebSite();
    app.mainHelper.openSignInPage();
    app.loginHelper.loginValidUser();
    app.mainHelper.openCreateNewArticlePage();
    app.newArticleHelper.createNewValidArticle();
    app.articleHelper.addNewValidComment();
    Assert.assertEquals(app.articleHelper.getCommentTextForAssert(),CommentFactory.getValidComment().getCommentText());
    }


}
