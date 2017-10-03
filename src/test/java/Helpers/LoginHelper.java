package Helpers;

import Pages.LoginPage;
import Factories.UserFactory;

public class LoginHelper extends LoginPage {

    public LoginHelper() {
    }

    public void loginValidUser(){
        login_to_site(UserFactory.getValidUser().getLogin(),UserFactory.getValidUser().getPassword());
    }


}
