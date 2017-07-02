package common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static java.lang.System.getProperty;

public class CommonFunction {
	
	private static WebDriver driver;
	private static String BROWSER = getProperty("browser");

	public static WebDriver getWebDriver(){
        if (BROWSER == "chrome") {
            return getChromeDriver();
        }else {
            return getGeckoDriver();
        }
    }

	public static WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver", "Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver getGeckoDriver(){
		System.setProperty("webdriver.gecko.driver", "Tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    return driver;
	}

	public static void waitForElementClicable(By by) throws Throwable{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public static WebElement findElement(By by){
		return driver.findElement(by);		
	}

	public static void takeScreenShot(String dest){
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("target\\screenshot\\"+dest+".png"));
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());

		}
	}

    public static void closeBrowser(){
		driver.quit();
	}	
}
