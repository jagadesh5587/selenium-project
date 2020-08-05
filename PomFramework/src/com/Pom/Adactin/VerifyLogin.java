package com.Pom.Adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class VerifyLogin extends Base{

	
	@FindBy(xpath="//input[@id='username']")
	private WebElement name;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
private WebElement button;
	
	
	
	
	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}
	
	public WebElement getButton() {
		return button;
	}

	public void setButton(WebElement button) {
		this.button = button;
	}
	
	public VerifyLogin() {
PageFactory.initElements(driver, this);
	}

		
}
