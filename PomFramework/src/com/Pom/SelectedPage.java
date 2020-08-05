package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class SelectedPage extends Base {
@FindBy(id="group_1")
private WebElement  size;	

@FindBy(id="add_to_cart")
private WebElement button;

@FindBy(xpath="//div[@class='button-container']//span[contains(text(),'Proceed to checkout')]")
private WebElement checkout;

public WebElement getSize() {
	return size;
}

public void setSize(WebElement size) {
	this.size = size;
}

public SelectedPage() {
	PageFactory.initElements(driver, this);
	
	
}

public WebElement getButton() {
	return button;
}

public void setButton(WebElement button) {	
	this.button = button;
}

public WebElement getCheckout() {
	return checkout;
}

public void setCheckout(WebElement checkout) {
	this.checkout = checkout;
}

}
