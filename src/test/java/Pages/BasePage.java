package Pages;

import Factories.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhukov on 4/18/2017.
 */
public abstract class BasePage {

    protected static WebDriver webDriver;

    static {
        webDriver = DriverFactory.getDriver();
        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }

    public BasePage() {
        PageFactory.initElements(webDriver, this);
    }



}
