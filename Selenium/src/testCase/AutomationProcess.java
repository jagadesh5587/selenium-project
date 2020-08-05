package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationProcess {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//form[@id='searchbox']//input[@class='search_query form-control ac_input']")).sendKeys("tshirts");
	driver.findElement(By.xpath("//button[@class='btn btn-default button-search']")).click();
}
}
