package com.Utility;

import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;

public class ElementUtility extends BaseClass {

	public static void clickOnTheElement(WebElement element) {
		try {

			WaitUtility.waitForTheElementToBeClickable(element);
			JavaScriptUtility.highlightElement(element);

			element.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void inputInTheInputField(WebElement element, String inputText) {
		try {

			WaitUtility.waitForTheVisiblityOfElement(element);
			JavaScriptUtility.highlightElement(element);

			element.sendKeys(inputText);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String getTextFromTheElement(WebElement element) {

		String elementText = null;

		try {
			WaitUtility.waitForTheVisiblityOfElement(element);
			JavaScriptUtility.highlightElement(element);

			elementText = element.getText();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return elementText;

	}

}
