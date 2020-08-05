package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Day4ex {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement x = driver.findElement(By.id("email"));
		x.sendKeys("sudha.clustar@gmail.com");
		System.out.println(x.getText());
		WebElement y = driver.findElement(By.id("pass"));
		y.sendKeys("hgy77g");

		System.out.println(y.getText());
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();

		//System.out.println(x.getText());
		//*[@id="article-wrapper"]/div[2]
	}
}
