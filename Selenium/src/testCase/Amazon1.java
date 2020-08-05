package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);	
	
	WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
	Actions ac = new Actions(driver);
	ac.moveToElement(mobile).build().perform();
ac.click().build().perform();
Thread.sleep(2000);	

	WebElement mob = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
	ac.moveToElement(mob).build().perform();
	Thread.sleep(2000);	
	
	WebElement pb = driver.findElement(By.xpath("//a[contains(text(),'Pow')]"));
	ac.moveToElement(pb).build().perform();
	ac.click(pb).build().perform();;
	
	
	
	
}
}
