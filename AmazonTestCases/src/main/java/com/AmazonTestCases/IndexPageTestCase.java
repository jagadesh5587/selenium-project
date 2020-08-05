package com.AmazonTestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.functionalLibraries.Base;
import com.functionalLibraries.DataDrivenClass;
import com.pom.IndexPage;

public class IndexPageTestCase extends Base{

	IndexPage ip = new IndexPage();

	@DataProvider(name="getdata")
	public String [][] getExcelData() throws InvalidFormatException, IOException {
DataDrivenClass dd = new DataDrivenClass();

		return dd.data("E:\\Java\\AmazonTestCases\\source\\login.xlsx", "login");
	}
	
@BeforeSuite
public void launchBrowser() {
launchBrowser("chrome");
launchUrl("https://www.flipkart.com/");
implicit();
	}

@Test(priority=-1)
public void selectLogin() {
	mouseOver(ip.getLogin());
	click(ip.getLogin());
	
}

@Test(dataProvider="getdata")
public void loginValues(String username, String password) throws Exception {
explicit(ip.getUsername() );
sendValues(ip.getUsername(), username);
sendValues(ip.getPass(), password);
click(ip.getButton());
//	String InvalidLogin = ip.getLogincheck().getText();
//	if(InvalidLogin.contains("Please enter valid Email ID/Mobile number")) {
//		System.out.println("login failed");
//	}
//	else {
//		explicit(ip.getLoginname());
//		Assert.assertEquals("Sudhakar", ip.getLoginname().getText());
//	System.out.println("login succesful");	
//	}
explicit(ip.getLoginname());
implicit();
String validlogin = ip.getLoginname().getText();
if(validlogin.contains("Sudhakar")) {
	System.out.println("Successful login");
}else {
	System.out.println("Failed");
}
}

@AfterSuite
public void closeBrowser() {
closeTab();
quitBrowser();
}
}
