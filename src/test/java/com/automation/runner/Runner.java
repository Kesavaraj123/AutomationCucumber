package com.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\auto\\feature",glue = "com\\automation\\stepdefinition")

public class Runner {

}
