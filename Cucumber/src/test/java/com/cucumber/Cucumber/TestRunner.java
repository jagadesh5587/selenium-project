package com.cucumber.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue="com.cucumber.Cucumber", plugin= {"html:target/Cucumber.html"})
public class TestRunner {
	
}
