package com.cucumber.Cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^user launch the browser and amazon application$")
	public void user_launch_the_browser_and_amazon_application() throws Throwable {
		System.out.println("launch");
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
System.out.println(arg1);
System.out.println(arg2);
	}

	@Then("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		System.out.println("click");
	}

	@Then("^user verify the homepage$")
	public void user_verify_the_homepage() throws Throwable {
		System.out.println("verify");
	}
	
	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
		System.out.println("password");
	}

	@Then("^user clicks forgot password$")
	public void user_clicks_forgot_password() throws Throwable {
		System.out.println("forgot password");
	}

	@Then("^user reset password$")
	public void user_reset_password() throws Throwable {
		System.out.println("reset");
	}


}
