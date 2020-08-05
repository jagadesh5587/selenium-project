package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class VerifySelectPage extends Base{
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public void setRadiobutton(WebElement radiobutton) {
		this.radiobutton = radiobutton;
	}
	
	public VerifySelectPage() {
		PageFactory.initElements(driver, this);	
		}
}
