package testCase;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextex {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\Java\\Selenium\\Screenshot\\sample.png");
		FileUtils.copyFile(source, des);
		
		
		Actions ac = new Actions(driver);
		WebElement mail = driver.findElement(By.xpath("//span[text()='right click me']"));
		ac.contextClick(mail);
		Thread.sleep(2000);
		WebElement dblebtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		ac.doubleClick(dblebtn).build().perform();
		
		
	}
	

}
