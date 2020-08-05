package com.Scipt;


import com.FunctionalLibraries.Base;
import com.Pom.Adactin.VerifyCheckIn;
import com.Pom.Adactin.VerifyLogin;

import junit.framework.Assert;

public class AdactinTest extends Base{
	public static void main(String[] args) {
		
	
	launchBrowser("chrome");
	launchUrl("http://adactinhotelapp.com/");
	implicit();
	

	VerifyLogin v = new VerifyLogin();
	sendValues(v.getName(), "sudhakar24");
	sendValues(v.getPassword(), "sidhere24");
click(v.getButton());	

VerifyCheckIn vc = new VerifyCheckIn();
selectMultipleOption(vc.getLocation(), "value", "Sydney");
selectMultipleOption(vc.getHotel(), "value", "Hotel Creek");
selectMultipleOption(vc.getRoom(), "value", "Standard");
selectMultipleOption(vc.getNoOfRooms(), "value", "1");
clearField(vc.getCheckIn());
clearField(vc.getCheckOut());
sendValues(vc.getCheckIn(), "05/07/2020");
sendValues(vc.getCheckOut(), "01/07/2020");
selectMultipleOption(vc.getType(), "value", "2");
selectMultipleOption(vc.getChild(), "value", "2");
click(vc.getSubmit());

}
}
