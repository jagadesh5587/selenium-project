package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ddown {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
//	Thread.sleep(2000);	
	Actions ac = new Actions(driver);
	
WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
ac.dragAndDrop(drag, drop).build().perform();
WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
ac.dragAndDrop(drag1, drop1).build().perform();

WebElement drag2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
ac.dragAndDrop(drag2, drop2).build().perform();
WebElement drag3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
WebElement drop3 = driver.findElement(By.xpath("//li[@class='placeholder']"));
ac.dragAndDrop(drag3, drop3).build().perform();

	
	
}
}
