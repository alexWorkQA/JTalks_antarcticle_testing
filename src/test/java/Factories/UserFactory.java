package Factories;

import Models.User;

import java.util.ResourceBundle;

public class UserFactory {
    static ResourceBundle resourceUser;

    static {
        resourceUser = ResourceBundle.getBundle("user");
    }

    public static User getValidUser(){
        return new User(resourceUser.getString("valid.userName"),resourceUser.getString("valid.userPassword"));
    }
}
