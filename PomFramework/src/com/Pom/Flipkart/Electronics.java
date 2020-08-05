package com.Pom.Flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class Electronics extends Base{
@FindBy(xpath="//span[text()='Electronics']")
private WebElement electronics;

@FindBy(xpath="//li[@class='Wbt_B2 _1YVU3_']/span[text()='Electronics']/following-sibling::ul/li/ul/li/ul/li/a")
private WebElement list;


public WebElement getElectronics() {
	return electronics;
}

public void setElectronics(WebElement electronics) {
	this.electronics = electronics;
}

public WebElement getList() {
	return list;
}

public void setList(WebElement list) {
	this.list = list;
}

public Electronics() {
PageFactory.initElements(driver, this);
}
}
