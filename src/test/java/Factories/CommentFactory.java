package Factories;

import Models.Comment;

import java.util.ResourceBundle;

public class CommentFactory {

    static ResourceBundle resourceBundle;

    static {
        resourceBundle = ResourceBundle.getBundle("commentText");
    }

    public static Comment getValidComment(){
        Comment commentText = new Comment();
        commentText.setCommentText(resourceBundle.getString("comment.text"));
        return commentText;
    }

}
