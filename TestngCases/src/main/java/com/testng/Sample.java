package com.testng;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void test1() {
System.out.println("test1");
	}
	@Test()
	public void test2() {	
		System.out.println("test2");
Assert.assertTrue(false);
	}	
	@Test()
	public void test3() {	
		System.out.println("test3");
	}@Test()
	public void test4() {	
		System.out.println("test4s");
Assert.assertTrue(false);
	}
	}
