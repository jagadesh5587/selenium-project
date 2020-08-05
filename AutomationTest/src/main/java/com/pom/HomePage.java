package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.Base;

public class HomePage extends Base {

	@FindBy(id="//input[@id='search_query_top']")
	private  WebElement search;
	
	@FindBy(id="//button[@class='btn btn-default button-search']")
	private WebElement submit;

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	
	public HomePage() {
PageFactory.initElements(driver,this);
	}
}
