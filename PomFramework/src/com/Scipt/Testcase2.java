package com.Scipt;

import com.FunctionalLibraries.Base;
import com.Pom.Flipkart.Electronics;
import com.Pom.Flipkart.LoginPage;

public class Testcase2 extends Base{
	public static void main(String[] args) {
		launchBrowser("chrome");
		launchUrl("https://www.flipkart.com/");
		implicit();
		
		LoginPage l = new LoginPage();
		sendValues(l.getLogin(), "sudha.cluster@gmail.com");
		sendValues(l.getPass(), "catchmesid");
		click(l.getButton());
		Electronics e = new Electronics();
		mouseOver(e.getElectronics());
		dropDownList(e.getList(), "Realme");
	}

}
