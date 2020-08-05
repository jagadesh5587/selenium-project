package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.functionalLibraries.Base;

public class IndexPage extends Base{

	@FindBy (className="_3Ep39l")
	private WebElement login;
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement username;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
private WebElement pass;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement button;
	
	@FindBy(className="//span[@class='ZAtlA-']//span")
	private WebElement logincheck;
	
	@FindBy(xpath="//body//div[@id='container']//div//div//div//div[3]//div[1]//div[1]//div[1]//div[1]")
	private WebElement loginname;

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	
	public WebElement getButton() {
		return button;
	}

	public void setButton(WebElement button) {
		this.button = button;
	}
	
	public WebElement getLogincheck() {
		return logincheck;
	}

	public void setLogincheck(WebElement logincheck) {
		this.logincheck = logincheck;
	}

	public WebElement getLoginname() {
		return loginname;
	}

	public void setLoginname(WebElement loginname) {
		this.loginname = loginname;
	}

	public IndexPage() {
PageFactory.initElements(driver, this);
	}

}

