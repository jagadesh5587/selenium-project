package com.cucumber.AutomationTest;

import com.pom.HomePage;
import com.pom.IndexPage;
import com.pom.LoginPage;
import com.util.Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LoginSteps extends Base {
IndexPage ip = new IndexPage();
LoginPage lp = new LoginPage();
HomePage hp = new HomePage();

@Given("user launch the AutomationPractice Application")
public void user_launch_the_automation_practice_application() {
launchBrowser("chrome");
launchUrl("http://automationpractice.com/index.php");
implicit();
}

@When("user click the sign-in")
public void user_click_the_sign_in() {
	explicit(ip.getSignin());
click(ip.getSignin());
}
	
@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String arg1, String arg2) throws Throwable {
	explicit(lp.getUsername());
	sendValues(lp.getUsername(), arg1);
	sendValues(lp.getPassword(), arg2);
}

@Then("click the sign in button")
public void click_the_sign_in_button() {
click(lp.getSubmit());
}

@And("enter search item")
public void enter_search_item() {
	explicit(hp.getSearch());
sendValues(hp.getSearch(), "t-shirts");
}

@Then("click submit button")
public void click_submit_button() {
click(hp.getSubmit());
}

@Then("close the browser")
public void close_the_browser() {
quitBrowser();
}



}
