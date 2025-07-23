package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/FeatureFiles/Login.feature", 
				glue = "com/StepDefinition", 
				monochrome = true, 
				plugin = {
							"pretty", "html:Report/cucumber-reports.html" }, 
				dryRun = false

				)

public class TestRunner extends AbstractTestNGCucumberTests {

}
