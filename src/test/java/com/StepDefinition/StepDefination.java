package com.StepDefinition;

import org.testng.Assert;

import com.BaseClass.BaseClass;
import com.PagesClass.Homepage;
import com.PagesClass.SignupPage;
import com.Utility.DataUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends BaseClass {

	Homepage homepage;
	SignupPage signup;

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {

		homepage = new Homepage(driver);
		homepage.verifyHomepageHeaderIcon();
	}

	@Given("Signup button is present on the homepage")
	public void signup_button_is_present_on_the_homepage() {

		Assert.assertTrue(homepage.signUpLoginButtonIsDisplayed(), "Signup/Login button is not displayed");
	}

	@When("User clicks on the Signup\\/Login button")
	public void user_clicks_on_the_signup_login_button() {

		homepage.clickonSignupLoginButton();
	}

	@Then("User is redirected to the Signup screen")
	public void user_is_redirected_to_the_signup_screen() {

		signup = new SignupPage(driver);
		Assert.assertEquals(signup.getSignupFormHeaderText(), "New User Signup!");

	}

	@When("User enters a valid username")
	public void user_enters_a_valid_username() {

		signup.enterSignupName(DataUtility.randomFirstName());
	}

	@When("User enters a valid email ID")
	public void user_enters_a_valid_email_id() {

		signup.enterSignupEmail(DataUtility.randomEmailID());
	}

	@When("User clicks on the Signup button on the signup page")
	public void user_clicks_on_the_signup_button_on_the_signup_page() {

		signup.clickSignupButton();
	}

	@Then("User is redirected to the Add Account Details screen")
	public void user_is_redirected_to_the_add_account_details_screen() {

		Assert.assertEquals(signup.getSignUpEnterAccountHeaderText(), "ENTER ACCOUNT INFORMATION");
	}

	@When("User enters a valid password")
	public void user_enters_a_valid_password() {

		signup.enterPassword(DataUtility.passwordGenerator(8));
	}

	@When("User enters their first name")
	public void user_enters_their_first_name() {

		signup.enterFirstName(DataUtility.randomFirstName());
	}

	@When("User enters their last name")
	public void user_enters_their_last_name() {

		signup.enterLastName(DataUtility.randomLastName());

	}

	@When("User enters their home address")
	public void user_enters_their_home_address() {

		signup.enterAddress(DataUtility.randomStreetAddress());
	}

	@When("User enters their state")
	public void user_enters_their_state() {

		signup.enterState(DataUtility.randomState());
	}

	@When("User enters their city")
	public void user_enters_their_city() {

		signup.enterCity(DataUtility.randomCity());

	}

	@When("User enters their zipcode")
	public void user_enters_their_zipcode() {

		signup.enterZipCode(DataUtility.randomZipCode());

	}

	@When("User enters their phone number")
	public void user_enters_their_phone_number() {

		signup.enterMobileNumber(DataUtility.randomPhoneNumber());
	}

	@When("User clicks on the Create Account button")
	public void user_clicks_on_the_create_account_button() {

		signup.clickCreateAccountButton();
	}

	@Then("User account should be successfully created")
	public void user_account_should_be_successfully_created() {

		Assert.assertEquals(signup.getAccountCreatedText(), "ACCOUNT CREATED!");
		Assert.assertEquals(signup.getSuccessfulAccountCrreatedMessage(),
				"Congratulations! Your new account has been successfully created!");

	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {

		signup.clickContinueButton();
	}

	@Then("Logout button is displayed on the homepage")
	public void logout_button_is_displayed_on_the_homepage() {

		Assert.assertTrue(homepage.userNameOnHomepageIsDisplayed(), "Username is not displayed on the Homepage");
	}

}
