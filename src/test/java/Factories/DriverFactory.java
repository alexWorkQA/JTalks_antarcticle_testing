package Factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

/**
 * Created by zhukov on 4/18/2017.
 */
public class DriverFactory {

    public static WebDriver getDriver() {
        WebDriver driver = null;
        String driverName = System.getProperty("driver");
        switch (driverName) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            case "IE":
                System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;

            case "Edge":
                System.setProperty("chrome.driver", "driver\\MicrosoftWebDriver.exe");
                driver = new EdgeDriver();
                break;

            case "Opera":
                System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
                driver = new OperaDriver();
                break;
        }
        return driver;
    }
}
