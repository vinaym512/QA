package action;

import common.CommonFunction;
import common.DriverUtil;
import org.openqa.selenium.*;
import page.object.PageObjects;
import step.definition.Hooks;

public class SignUpActions extends CommonFunction {

    public static final WebDriver driver;

    public static CommonFunction cf= new CommonFunction();;
    static {
        driver = DriverUtil.getWebDriver();
    }
    //CommonFunction cf = new CommonFunction();

    public static void openPage(String url) {
        CommonFunction.openWebPage(url);
    }

    public static void fillSignUpForm() throws InterruptedException {

        CommonFunction.selectFromDropdownByName(PageObjects.countrName,"Australia");
        CommonFunction.findElement(PageObjects.firstName).sendKeys("vinay");

        CommonFunction.findElement(PageObjects.lastName).sendKeys("vinay");

    }

    public static void hitPayButton() {

    }

    public static void checkFFNumberGenerated() {

    }
}