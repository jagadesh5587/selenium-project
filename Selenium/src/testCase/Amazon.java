package testCase;

import java.io.File;
import java.security.Key;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
findElement.sendKeys("mobile", Keys.ENTER);

JavascriptExecutor js = (JavascriptExecutor)driver;
WebElement search = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[7]"));
js.executeScript("arguments[0].scrollIntoView(true)", search);


		
}
}
