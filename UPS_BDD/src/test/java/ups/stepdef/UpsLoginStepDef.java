package ups.stepdef;

import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ups.actions.UpsLoginActions;

public class UpsLoginStepDef {

	UpsLoginActions loginActions = new UpsLoginActions();

	@Given("I navigated to ups login page")
	public void i_navigated_to_ups_login_page() {
		String actualTitle = loginActions.upsLoginPage();
		// Assert.assertEquals(acttualTitle, expected);
		System.out.println(actualTitle);
	}

	@When("I entered wrong \"(.*)\" and \"(.*)\"")
	public void i_entered_wrong_and(String userId, String password) {
		loginActions.setUserID(userId);
		loginActions.setPassword(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		loginActions.loginClick();
	}

	@Then("I should receive an error message")
	public void i_should_receive_an_error_message() {
		Assert.assertEquals(loginActions.errorReadMsg(), true);
	}

	@When("I entered correct \"(.*)\" and \"(.*)\"")
	public void i_entered_correct_and(String userId, String password) {
		loginActions.setUserID(userId);
		loginActions.setPassword(password);
	}

	@Then("I should be able to login")
	public void i_should_be_able_to_login() {
		Assert.assertEquals(loginActions.errorReadMsg(), false);
	}

}
