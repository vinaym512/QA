package action;

import common.CommonFunction;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import page.object.PageObjects;

import java.util.ArrayList;
import java.util.List;

public class HorseBettingActions {

    public static final WebDriver driver;

    static {
        driver = CommonFunction.getWebDriver();
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static void clickRacing() throws Throwable {
        //closing the popup box before anything else
        CommonFunction.waitForElementClicable(PageObjects.btnPopup);
        driver.findElement(PageObjects.btnPopup).click();

        CommonFunction.waitForElementClicable(PageObjects.lnkRacing);
        WebElement element = driver.findElement(PageObjects.lnkRacing);
        ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(250,350)");

        driver.findElement(PageObjects.lnkRacing).click();
        CommonFunction.takeScreenShot("clickRacing");
        System.out.println("***********Racing clicked++++++++++++++++++");
    }

    public static void selectBetButton() throws Throwable {
        CommonFunction.waitForElementClicable(PageObjects.btnHorseRacing);
        driver.findElement(PageObjects.btnHorseRacing).click();
        CommonFunction.takeScreenShot("selectBetButton");
        System.out.println("***********Bet button selected+++++++++++++");
    }

    public static void enterStakevalue(String stake) throws Throwable {
        CommonFunction.waitForElementClicable(PageObjects.boxStake);
        driver.findElement(PageObjects.boxStake).sendKeys(stake);
        CommonFunction.takeScreenShot("enterStakevalue");
        System.out.println("***********Stake entered+++++++++++++++++++");
    }

    public static void clickAddBetSlipBtn() throws Throwable {
        CommonFunction.waitForElementClicable(PageObjects.btnAddBet);
        driver.findElement(PageObjects.btnAddBet).click();
        CommonFunction.takeScreenShot("clickAddBetSlipBtn");
        System.out.println("***********Add bet ++++++++++++++++++++++++");
    }

    public static void checkBetAdded() throws Throwable {
        CommonFunction.waitForElementClicable(PageObjects.sectionBetAdded);
        String numberOfBets = driver.findElement(PageObjects.sectionBetAdded).getText();
        Assert.assertEquals("1",numberOfBets);
        CommonFunction.takeScreenShot("clickAddBetSlipBtn");
        System.out.println("***********Bet added verified +++++++++++++");
    }
}