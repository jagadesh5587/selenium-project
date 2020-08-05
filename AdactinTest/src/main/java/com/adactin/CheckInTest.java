package com.adactin;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.FunctionalLibraries.Base;
import com.pom.VerifyReservationPage;

public class CheckInTest extends Base{
	VerifyReservationPage r = new  VerifyReservationPage();

	@Test(priority=2, groups= {"smoke"}, dependsOnGroups= {"regression"})
	public void reservationPage() {
selectMultipleOption(r.getLocation(), "value", "New York");
selectMultipleOption(r.getHotel(), "value", "Hotel Hervey");
selectMultipleOption(r.getRoomtype(), "value", "Super Deluxe");
selectMultipleOption(r.getRooms(), "value", "2");
clearField(r.getCheckin());
clearField(r.getCheckout());
sendValues(r.getCheckin(), "19/07/2020");		
sendValues(r.getCheckout(), "07/07/2020");
assertFalse(true, "date not valid");
selectMultipleOption(r.getAdult(),"value", "2");
selectMultipleOption(r.getChild(), "value", "0");
	click(r.getSubmit());
	}

}
