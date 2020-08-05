package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.Base;

public class IndexPage extends Base {
	@FindBy(className="//a[@class='login']")
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}

	public void setSignin(WebElement signin) {
		this.signin = signin;
	}
	
public IndexPage() {
PageFactory.initElements(driver, this);
}
}
