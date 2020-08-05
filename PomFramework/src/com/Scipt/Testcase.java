package com.Scipt;

import org.openqa.selenium.By;

import com.FunctionalLibraries.Base;
import com.Pom.Loginpage;
import com.Pom.MyAccount;
import com.Pom.MyStore;
import com.Pom.SelectedPage;

public class Testcase extends Base {
	public static void main(String[] args) throws Throwable {
		launchBrowser("chrome");
		launchUrl("http://automationpractice.com/index.php?");
		implicit();
		click(driver.findElement(By.className("login")));
		
		Loginpage l = new Loginpage();
		sendValues(l.getEmail(), "sudha.cluster@gmail.com");
		sendValues(l.getPassword(), "Sidhere24$$");
        click(l.getSigninbutton());
        screenShot("login");
        MyAccount m = new MyAccount();
        sendValues(m.getSearchbox(),"t-shirts");
       click(m.getSearchbutton());
       screenShot("myacc");
       MyStore mystore = new MyStore();
       click(mystore.getDress());
screenShot("mystore");
       SelectedPage  s = new SelectedPage();
      selectMultipleOption(s.getSize(), "index", "1");
      screenShot("size");
  click(s.getButton());
alertPopup(s.getCheckout(),"Proceed to checkout");
click(s.getCheckout());
screenShot("output");
	}
}
