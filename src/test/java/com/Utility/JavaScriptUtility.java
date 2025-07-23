package com.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;

public class JavaScriptUtility extends BaseClass {

	static JavascriptExecutor js;

	public static void highlightElement(WebElement element) {
		try {

			String originalStyle = element.getDomAttribute("style");

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='1.8px solid red';", element);
			Thread.sleep(400);

			js.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, originalStyle);

		} catch (Exception e) {
			System.out.println("Error while highlighting element: " + e.getMessage());

		}
	}

}
