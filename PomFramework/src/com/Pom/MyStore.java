package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class MyStore extends Base{
@FindBy(xpath="(//a[@class='product-name'])[3]")
private WebElement dress;

public WebElement getDress() {
	return dress;
}

public void setDress(WebElement dress) {
	this.dress = dress;
}

public MyStore() {
	PageFactory.initElements(driver, this);
}

}
