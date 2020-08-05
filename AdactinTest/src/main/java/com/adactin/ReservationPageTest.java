package com.adactin;

import static org.testng.Assert.assertFalse;

import java.text.ParseException;

import org.testng.annotations.Test;

import com.FunctionalLibraries.Base;
import com.pom.VerifyReservationPage;

public class ReservationPageTest extends Base {
	
	
	@Test(dependsOnGroups= {"regression"}, groups= {"test4"})
	public void reservationtest2() throws ParseException {
		VerifyReservationPage r = new  VerifyReservationPage();

		selectMultipleOption(r.getLocation(), "value", "New York"); 
		selectMultipleOption(r.getHotel(), "value", "Hotel Hervey");
		selectMultipleOption(r.getRoomtype(), "value", "Super Deluxe");
		selectMultipleOption(r.getRooms(), "value", "2");
		clearField(r.getCheckin());
		clearField(r.getCheckout());
		sendValues(r.getCheckin(), "20/07/2020");		
		sendValues(r.getCheckout(), "15/07/2020");

		assertFalse(false, "date not valid");
		selectMultipleOption(r.getAdult(),"value", "2");
		selectMultipleOption(r.getChild(), "value", "0");
			click(r.getSubmit());
	}


}
