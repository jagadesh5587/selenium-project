package testCase;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googletask {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();	

		Actions ac = new Actions(driver);
		WebElement mouseover = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Thread.sleep(2000);
		ac.contextClick(mouseover).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER); 
		r.keyRelease(KeyEvent.VK_ENTER);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String parent = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(windowHandles );
		
		System.out.println(windowHandles.size());
		driver.switchTo().window(l.get(1));
Thread.sleep(2000);
		WebElement signin = driver.findElement(By.xpath("(//a[@class='h-c-header__nav-li-link '])[2]"));
js.executeScript("arguments[0].click()", signin);
Thread.sleep(2000);
driver.switchTo().window(l.get(2));
		WebElement username = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		Thread.sleep(1000);
		
		username.sendKeys("sudha.cluster@gmail.com");
		username.sendKeys(Keys.CONTROL+"a");
		username.sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys(Keys.CONTROL+"v");
				
	}
}


