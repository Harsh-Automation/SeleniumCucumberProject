package com.PagesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ElementUtility;

public class SignupPage {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='signup-form']/h2")
	WebElement signupFormHeader;

	@FindBy(css = "[data-qa='signup-name']")
	WebElement signupNameInput;

	@FindBy(css = "[data-qa='signup-email']")
	WebElement signupEmailInput;

	@FindBy(css = "[data-qa='signup-button']")
	WebElement signupButton;

	@FindBy(xpath = "//*[contains(text(),'Enter Account Information')]")
	WebElement signupPageEnterAccountHeader;

	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordInput;

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstNameInput;

	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastNameInput;

	@FindBy(xpath = "//input[@id='address1']")
	WebElement addressInput;

	@FindBy(xpath = "//input[@id='state']")
	WebElement stateInput;

	@FindBy(xpath = "//input[@id='city']")
	WebElement cityInput;

	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipCodeInput;

	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement mobileNumberInput;

	@FindBy(css = "[data-qa='create-account']")
	WebElement createAccountButton;

	@FindBy(css = "[data-qa='account-created']")
	WebElement accountCreatedBanner;

	@FindBy(xpath = "//*[contains(text(),'Congratulations')]")
	WebElement accountCreatedSuccessMessage;
	
	@FindBy(css = "[data-qa='continue-button']")
    WebElement continueButton;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String getSignupFormHeaderText() {
		return ElementUtility.getTextFromTheElement(signupFormHeader);
	}

	public void enterSignupName(String name) {
		ElementUtility.inputInTheInputField(signupNameInput, name);
	}

	public void enterSignupEmail(String email) {
		ElementUtility.inputInTheInputField(signupEmailInput, email);
	}

	public void clickSignupButton() {
		ElementUtility.clickOnTheElement(signupButton);
	}

	public String getSignUpEnterAccountHeaderText() {
		return ElementUtility.getTextFromTheElement(signupPageEnterAccountHeader);
	}

	public void enterPassword(String password) {
		ElementUtility.inputInTheInputField(passwordInput, password);
	}

	public void enterFirstName(String firstName) {
		ElementUtility.inputInTheInputField(firstNameInput, firstName);
	}

	public void enterLastName(String lastName) {
		ElementUtility.inputInTheInputField(lastNameInput, lastName);
	}

	public void enterAddress(String address) {
		ElementUtility.inputInTheInputField(addressInput, address);
	}

	public void enterState(String state) {
		ElementUtility.inputInTheInputField(stateInput, state);
	}

	public void enterCity(String city) {
		ElementUtility.inputInTheInputField(cityInput, city);
	}

	public void enterZipCode(String zip) {
		ElementUtility.inputInTheInputField(zipCodeInput, zip);
	}

	public void enterMobileNumber(String mobile) {
		ElementUtility.inputInTheInputField(mobileNumberInput, mobile);
	}

	public void clickCreateAccountButton() {
		ElementUtility.clickOnTheElement(createAccountButton);
	}

	public String getAccountCreatedText() {
		return ElementUtility.getTextFromTheElement(accountCreatedBanner);
	}

	public String getSuccessfulAccountCrreatedMessage() {

		return ElementUtility.getTextFromTheElement(accountCreatedSuccessMessage);
	}
	
	public void clickContinueButton() {
	    ElementUtility.clickOnTheElement(continueButton);
	}

}
