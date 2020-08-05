package com.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1 {
	@Test(groups= {"unit"})
	public void test5() {
System.out.println("test5");
System.out.println(Thread.currentThread().getId());
}
	@Test(dependsOnGroups= "unit")
	public void test6() {
System.out.println("test6");
System.out.println(Thread.currentThread().getId());
	}
	
	@Test 
	@Parameters({"pass"})
	public void test7(String user) {
System.out.println("test7");
System.out.println(user);
System.out.println(Thread.currentThread().getId());
	}

}
