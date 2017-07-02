package step.definition;

import action.HorseBettingActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HorseBettingStepDefinition {

	@Given("^I navigate to william hill website \"([^\"]*)\"$")
	public static void openTheWebsite(String url) {
		HorseBettingActions.openPage(url);
	}
	@Then("^User clicks on Racing link at left menu$")
    public static void clickRacingLink() throws Throwable {
	    HorseBettingActions.clickRacing();
    }
    @And("^User clicks on the bet button on the right pane$")
    public static void selectHorseRacingBetButton() throws Throwable {
        HorseBettingActions.selectBetButton();
    }

    @And("^User enters a stake value of \"([^\"]*)\"$")
    public void enterStakeValue(String stake) throws Throwable {
        HorseBettingActions.enterStakevalue(stake);
    }

    @Then("^User clicks on Add to Bet Slip Button$")
    public void clickAddBetSlipBtn() throws Throwable {
        HorseBettingActions.clickAddBetSlipBtn();
    }

    @Then("^User verify that bet is added$")
    public void verifyBetAdded() throws Throwable {
        HorseBettingActions.checkBetAdded();
    }
}