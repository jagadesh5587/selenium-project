package testCase;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopcluesex {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shopclues.com/wholesale.html");
	Thread.sleep(2000);
	WebElement sport = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[25]"));
	Actions ac = new Actions(driver);
	ac.moveToElement(sport).build().perform();
	
	
	String parent = driver.getWindowHandle();

	WebElement weigh = driver.findElement(By.xpath("//a[(text()='Weight Gainers')]"));
	ac.click(weigh).build().perform();
	
 	Set<String> multi = driver.getWindowHandles();
 	System.out.println(multi.size());
	List<String> l = new ArrayList<String>(  );
	l.addAll(multi);
	driver.switchTo().window(l.get(1));
 driver.findElement(By.xpath("//span[text()='Medisys Double Mass Gainer -Chocolate 1.5kg Free Multiv']")).click();
 driver.switchTo().window(l.get(multi.size()));
 driver.findElement(By.xpath("//button[text()='Add To Cart']")).click();;
 JavascriptExecutor js =(JavascriptExecutor)driver;
	WebElement x = driver.findElement(By.xpath("//button[text()='Add To Cart']"));
//	
//	WebElement x = driver.findElement(By.xpath("//button[@id='add_cart']"));
	js.executeScript("arguments[0].scrollIntoView(true)",x);
	x.click();
	
}	

}
