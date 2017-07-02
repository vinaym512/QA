package TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import common.CommonFunction;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src\\main\\resources"
		,glue = { "step.definition" }
		,tags = {"@BetUsingForm"}
		)


public class TestRunner_Hill {

	@BeforeClass
	public static void initialise() {
		System.setProperty("browser", "chrome");
	}
	
	@AfterClass
	public static void close() {
		CommonFunction.closeBrowser();
	}
} 