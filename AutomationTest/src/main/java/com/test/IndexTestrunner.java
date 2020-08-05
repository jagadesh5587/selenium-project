package com.test;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Java\\AutomationTest\\Features", glue="com.cucumber.AutomationTest", monochrome = true)
public class IndexTestrunner {

}
		 