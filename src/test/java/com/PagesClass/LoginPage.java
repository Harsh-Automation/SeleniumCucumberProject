package com.PagesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ElementUtility;
import com.Utility.WaitUtility;

public class LoginPage {

	public WebDriver driver;

	@FindBy(css = "[class='ico-login']")
	WebElement loginBtnOnHomepage;

	@FindBy(css = "[data-qa='login-email']")
	WebElement emailIdInputField;

	@FindBy(css = "[data-qa='login-password']")
	WebElement passwordIdInputField;

	@FindBy(css  = "[data-qa='login-button']")
	WebElement loginBtnOnLoginPage;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickLoginButtonOnHomepage() {

		WaitUtility.waitForTheElementToBeClickable(loginBtnOnHomepage);
		loginBtnOnHomepage.click();
	}

	public void enterEmail(String email) {

		ElementUtility.inputInTheInputField(emailIdInputField, email);
	}

	public void enterPassword(String password) {
		ElementUtility.inputInTheInputField(passwordIdInputField, password);
	}

	public void clickLoginButtonOnLoginPage() {
		ElementUtility.clickOnTheElement(loginBtnOnLoginPage);
	}

}
