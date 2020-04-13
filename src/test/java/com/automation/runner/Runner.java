package com.automation.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.auto.BaseClass;
import com.configuration.properties.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\auto\\feature", glue = "com\\automation\\stepdefinition", 
                 plugin = {"pretty", "html:Report","com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html" }, 
                 monochrome = true, 
                 dryRun = false, 
                 strict = true)

public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void browserExecute() throws IOException {
		      String browser = FileReaderManager.getFrInstance().getCrInstance().getBrowser();
		      driver=BaseClass.browserLaunch(browser);
		      String url = FileReaderManager.getFrInstance().getCrInstance().getUrl();
		      BaseClass.getUrl(url);
		

	}
	@AfterClass
	public static void term() {
		
		BaseClass.close();

	}
}
