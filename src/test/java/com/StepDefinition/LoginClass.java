package com.StepDefinition;


import com.BaseClass.BaseClass;
import com.PagesClass.Homepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginClass extends BaseClass{
	
	Homepage homePage;

	@Given("User is on the Nop Commerce Homepage")
	public void user_is_on_the_nop_commerce_homepage() {
		homePage = new Homepage(driver);
		homePage.verifyHomepageHeaderIcon();
		System.out.println("Homepage header is Displayed");
		
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		
	}

	@When("User enters emailId {string}")
	public void user_enters_email_id(String string) {
		
	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
		
	}

	@When("User Clicks on Login button to login to the Application")
	public void user_clicks_on_login_button_for_login_to_the_application() {
		
	}

	@Then("User logged in successful")
	public void user_logged_in_successful() {
		
	}

	@Then("My Account is menu is shown on the Homepage")
	public void my_account_is_menu_is_shwon_on_the_homepage() {
		
	}

}
