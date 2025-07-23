package com.Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.BaseClass;

public class WaitUtility extends BaseClass {

	static WebDriverWait wait;

	public static void waitForTheVisiblityOfElement(WebElement element)

	{
		try {

			wait = new WebDriverWait(driver, Duration.ofSeconds(ConstantClass.waitForElement));

			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println("Exception occur while waiting for an element" + element + " " + e.getMessage());
		}

	}

	public static void waitForTheVisiblityOfElementLocated(WebElement element)

	{
		try {

			wait = new WebDriverWait(driver, Duration.ofSeconds(ConstantClass.waitForElement));

			wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
		} catch (Exception e) {
			System.out.println("Exception occur while waiting for an element" + element + " " + e.getMessage());
		}

	}

	public static void waitForTheElementToBeClickable(WebElement element)

	{
		try {

			wait = new WebDriverWait(driver, Duration.ofSeconds(ConstantClass.waitForElement));

			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			System.out.println("Exception occur while waiting for an element" + element + " " + e.getMessage());
		}

	}

}
