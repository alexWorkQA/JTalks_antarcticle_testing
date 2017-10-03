package Helpers;

import Pages.MainPage;

public class MainHelper extends MainPage {

    public MainHelper() {
    }

    public void openSignInPage(){
        clickSignInButton();
    }

    public String getUserNameForAssert(){
        return get_usrename_from_dropmenu();
    }

    public void logOut_FromSite(){
        logoutFromSite();
    }

    public void openCreateNewArticlePage(){
        clickCreateButtonClick();
    }

    public String getTitle(){
        return webDriver.getTitle();
    }

}
