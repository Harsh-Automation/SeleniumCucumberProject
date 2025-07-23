package com.PagesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ElementUtility;

public class Homepage {

	public WebDriver driver;

	@FindBy(css = "[alt='Website for automation practice']")
	WebElement homepageHeaderIcon;

	@FindBy(xpath = "//a[@href='/login']")
	WebElement homepageSignupLoginButton;

	@FindBy(xpath = "//i[@class='fa fa-user']/..")
	WebElement userNameOnHomepage;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyHomepageHeaderIcon() {
		homepageHeaderIcon.isDisplayed();

	}

	public boolean signUpLoginButtonIsDisplayed() {

		return homepageSignupLoginButton.isDisplayed();
	}

	public void clickonSignupLoginButton() {
		ElementUtility.clickOnTheElement(homepageSignupLoginButton);
	}

	public boolean userNameOnHomepageIsDisplayed() {
		return userNameOnHomepage.isDisplayed();
	}

	public String getUserNameFromTheHomepageHeader() {
		return ElementUtility.getTextFromTheElement(userNameOnHomepage);
	}
}
