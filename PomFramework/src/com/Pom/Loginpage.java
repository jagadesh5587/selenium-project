package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class Loginpage extends Base{
	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name ="passwd")
	private WebElement password;

	@FindBy(name ="SubmitLogin")
	private WebElement signinbutton;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSigninbutton() {
		return signinbutton;
	}

	public void setSigninbutton(WebElement signinbutton) {
		this.signinbutton = signinbutton;
	}

	public Loginpage() {
	PageFactory.initElements(driver, this);

	}

}
