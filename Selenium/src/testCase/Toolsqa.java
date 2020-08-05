package testCase;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Toolsqa {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","E:\\Java\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://toolsqa.com/automation-practice-form/");
Thread.sleep(2000);
WebElement x = driver.findElement(By.id("firstName"));
x.sendKeys("sid");
WebElement y = driver.findElement(By.id("lastName"));
y.sendKeys("mahes");
WebElement z = driver.findElement(By.id("userEmail") );
z.sendKeys("aaa@gmail.com");
WebElement clk = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
clk.click();
}
	
}
	