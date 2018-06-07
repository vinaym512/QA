package step.definition;

import action.SignUpActions;
import common.DriverUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;


public class SignUpStepDefinition {

	@Given("^I navigate to QA website \"([^\"]*)\"$")
	public static void openTheWebsite(String url) {
        SignUpActions.openPage(url);
	}

	@When("^I fill all the fields with valid data$")
    public static void fillSignUpForm() throws InterruptedException {
        SignUpActions.fillSignUpForm();
    }

    @And("^I hit Pay Button$")
    public static void hitPayButton() {
        SignUpActions.hitPayButton();
    }

    @Then("^I verify that ff number generated$")
    public void verifyFFNumber() {
        SignUpActions.checkFFNumberGenerated();
    }

    @AfterClass
    public static void close() {
        System.out.println("----------- CLOSE DRIVER sd------{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{}}}}}}}}}}}}}}}}}}}}}}}}}}----");

        DriverUtil.quitBrowser();
    }
}