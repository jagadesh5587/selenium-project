package com.Scipt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.FunctionalLibraries.Base;
import com.Pom.Adactin.VerifyCheckIn;
import com.Pom.Adactin.VerifyLogin;

class JunitTest extends Base{

	@Before
	public  void verify() {

		launchBrowser("chrome");
		launchUrl("http://adactinhotelapp.com/");
		implicit();
	}
	
	@Test
	public void login() {
		VerifyLogin v = new VerifyLogin();
		sendValues(v.getName(), "sudhakar24");
		sendValues(v.getPassword(), "sidhere24");
	click(v.getButton());
	}

	@Test
	public void checkinVerify() {
		VerifyCheckIn vc = new VerifyCheckIn();
		selectMultipleOption(vc.getLocation(), "value", "Sydney");
		selectMultipleOption(vc.getHotel(), "value", "Hotel Creek");
		selectMultipleOption(vc.getRoom(), "value", "Standard");
		selectMultipleOption(vc.getNoOfRooms(), "value", "1");
clearField(vc.getCheckIn());
sendValues(vc.getCheckIn(), "05/07/2020");
clearField(vc.getCheckOut());
sendValues(vc.getCheckOut(), "01/07/2020");
		selectMultipleOption(vc.getType(), "value", "2");
		selectMultipleOption(vc.getChild(), "value", "2");
		click(vc.getSubmit());
		System.out.println("check-in-date should not be later than check-out-date");
	}
}
