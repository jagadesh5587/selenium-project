package com.adactin;

import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FunctionalLibraries.Base;
import com.pom.VerifySelectPage;

public class SelectHotel extends Base{
	
	
	VerifySelectPage search = new VerifySelectPage();
	
	@Test(dependsOnGroups= {"test4"})
	public void searchHotel() throws ParseException {
		click(search.getRadiobutton());
		Assert.assertEquals("New York", "New York", "Matches");
			Assert.assertEquals("Hotel Hervey", "Hotel Hervey", "Matches");
			Assert.assertEquals("Super Deluxe", "Super Deluxe", "Matches");
		click(search.getRadiobutton());
		
	}


}
