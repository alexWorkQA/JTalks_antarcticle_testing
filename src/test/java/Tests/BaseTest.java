package Tests;

import Application.App;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Administrator on 4/18/2017.
 */
public class BaseTest {
    public WebDriver webDriver;
    App app;

    @BeforeSuite
    public void webDriverInitialization() throws Exception {
        app = new App();
    }


    @AfterSuite
    public void closeWebBrowser() throws Exception {
        app.common.closeWebBrowser();
    }
}
