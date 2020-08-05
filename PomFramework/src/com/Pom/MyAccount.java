package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class MyAccount extends Base {
@FindBy(xpath="//form[@id='searchbox']//input[@class='search_query form-control ac_input']")
private WebElement searchbox;

@FindBy(xpath="//button[@class='btn btn-default button-search']")
private WebElement searchbutton;


public WebElement getSearchbox() {
	return searchbox;
}

public void setSearchbox(WebElement searchbox) {
	this.searchbox = searchbox;
}

public WebElement getSearchbutton() {
	return searchbutton;
}

public void setSearchbutton(WebElement searchbutton) {
	this.searchbutton = searchbutton;
	
}

public MyAccount() {
	PageFactory.initElements(driver, this);
}
}
