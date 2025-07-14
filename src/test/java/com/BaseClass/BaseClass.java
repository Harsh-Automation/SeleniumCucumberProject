package com.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Utility.ConstantClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = null;

	public static void setupBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();

		co.addArguments("--force-device-scale-factor=1.15");

		driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();

		driver.navigate().to(ConstantClass.appUrl);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeBrowser() {
		driver.quit();
	}

}
