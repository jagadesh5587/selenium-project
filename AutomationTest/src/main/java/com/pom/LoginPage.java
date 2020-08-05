package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.Base;

public class LoginPage extends Base {

	@FindBy(id="//input[@id='email']")
	private WebElement username;
	
	@FindBy(id="//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(id="//button[@id='SubmitLogin']")
	private WebElement submit;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	
	public LoginPage() {
PageFactory.initElements(driver, this);
	}
}
