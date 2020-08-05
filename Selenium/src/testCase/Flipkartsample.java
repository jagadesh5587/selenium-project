package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartsample {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	WebElement home = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[6]"));
	Actions ac = new Actions(driver);
	ac.moveToElement(home).build().perform();
	WebElement chair = driver.findElement(By.xpath("//a[@title='Dining Tables & Chairs']"));
	ac.click(chair).build().perform();
	WebElement ch = driver.findElement(By.xpath("(//a[@class='_2cLu-l'])[5]"));
	ac.click(ch).build().perform();
	
}
}
