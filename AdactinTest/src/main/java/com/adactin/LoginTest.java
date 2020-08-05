package com.adactin;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.FunctionalLibraries.Base;
import com.pom.VerifyLogin;

public class LoginTest extends Base {
	
	@BeforeSuite
	public void launchbrowser() {
		launchBrowser("chrome");
		launchUrl("http://adactinhotelapp.com/index.php");
		implicit();
	}

	@Test( groups= {"regression"})
	@Parameters({"username","password"})
	public void loginTest(String user, String pass) {
		VerifyLogin l = new VerifyLogin();
		sendValues(l.getUsername(),user );
		sendValues(l.getPassword(), pass);
		click(l.getLogin());
	}
	
	@AfterSuite
	private void closeBrowser() {
driver.close();
	}
}
