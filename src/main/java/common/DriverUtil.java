package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

    private static WebDriver driver;
    private static String BROWSER = System.getProperty("browser");

    public static WebDriver getWebDriver(){
        if (BROWSER.equalsIgnoreCase("chrome")) {
            return getChromeDriver();
        }else {
            return getGeckoDriver();
        }
    }

    public static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "Tools/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getGeckoDriver(){
        System.setProperty("webdriver.gecko.driver", "Tools/geckodriver");
        driver = new FirefoxDriver();
        return driver;
    }
    public static void closeBrowser(){
        driver.close();
    }
    public static void quitBrowser(){
        driver.quit();
    }
}
