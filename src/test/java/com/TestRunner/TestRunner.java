package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/FeatureFiles/LoginTest.feature",
		glue = "com/StepDefinition",
		monochrome = true,
	    plugin = {"pretty", "html:target/cucumber-reports"},
		dryRun=false
		
		)


public class TestRunner extends AbstractTestNGCucumberTests  {
	
	
	

}
	