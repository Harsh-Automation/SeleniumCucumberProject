package com.PagesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public WebDriver driver;
	
	@FindBy(css = "[alt='nopCommerce demo store']")
	WebElement homepageHeaderIcon;
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void verifyHomepageHeaderIcon()
	{
		homepageHeaderIcon.isDisplayed();
		
	}
}
