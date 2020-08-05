package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).build().perform();
	;
	WebElement findElement = driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_']/span[text()='Electronics']/following-sibling::ul/li/ul/li/ul/li"));
	Select s = new Select(findElement);
	s.selectByValue("Mi");
	
	
	}
}
