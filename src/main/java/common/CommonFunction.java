package common;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.System.getProperty;

public class CommonFunction {

	private static WebDriver driver;

	static {
		driver = DriverUtil.getWebDriver();
	}

	public static void openWebPage(String url) {
		driver.get(url);
	}

	public static void waitForElementClicable(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public static void waitForElementVisible(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public static WebElement findElement(By by){
		return driver.findElement(by);		
	}

	public static void selectFromDropdownByName(By by, String name){
		Select sel = new Select(driver.findElement(by));
		sel.selectByVisibleText(name);
	}
}
