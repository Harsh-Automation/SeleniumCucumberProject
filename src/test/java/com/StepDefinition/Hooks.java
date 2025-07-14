package com.StepDefinition;

import com.BaseClass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before

	public void launchBrowser() {
		BaseClass.setupBrowser();
	}

	@After
	public void tearDown() {
		BaseClass.closeBrowser();
	}
}
