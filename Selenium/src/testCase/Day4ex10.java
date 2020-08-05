package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4ex10 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" http://www.adactin.com/HotelApp/");
	WebElement x = driver.findElement(By.id("username"));
	x.sendKeys("sudha.cluster@gmail.com");
	WebElement y = driver.findElement(By.id("password"));
	y.sendKeys("dfdsg");
	WebElement z = driver.findElement(By.id("login"));
	
	z.click();
	
}
}
