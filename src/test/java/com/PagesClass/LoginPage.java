package com.PagesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.WaitUtility;

public class LoginPage {

	public WebDriver driver;

	@FindBy(css = "[class='ico-login']")
	WebElement loginBtnOnHomepage;

	@FindBy(css = "[id='Email']")
	WebElement emailIdInputField;

	@FindBy(css = "[id='Password']")
	WebElement passwordIdInputField;

	@FindBy(xpath = "//button[text()='Log in']")
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

		WaitUtility.waitForTheVisiblityOfElement(emailIdInputField);
		emailIdInputField.clear();
		emailIdInputField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordIdInputField.clear();
		passwordIdInputField.sendKeys(password);
	}

	public void clickLoginButtonOnLoginPage() {
		loginBtnOnLoginPage.click();
	}

}
