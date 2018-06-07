package step.definition;

import common.DriverUtil;
import cucumber.api.Scenario;

import cucumber.api.java.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After()
    public static void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot) DriverUtil.getWebDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        DriverUtil.closeBrowser();
    }
    @AfterClass
    public static void close() {
        DriverUtil.quitBrowser();
    }
}
