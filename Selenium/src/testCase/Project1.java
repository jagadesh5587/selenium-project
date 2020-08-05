package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]")).click();
	Actions ac = new Actions(driver);
	Thread.sleep(2000);
	ac.moveToElement(driver.findElement(By.xpath("(//span[@class='nav-a-content'])[9]"))).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Guitars']")).click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	WebElement selectGuitar = driver.findElement(By.xpath("(//a[@class='a-link-normal s-access-detail-page s-color-twister-title-link a-text-normal'])[13]"));
	js.executeScript("arguments[0].scrollIntoView(true)", selectGuitar);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//h2[contains(text(),'INT-38C Blue')]")).click();
//driver.findElement(By.xpath("(//span[@class='unified-price a-color-secondary'])[3]")).click();
driver.findElement(By.xpath("//a[@id='wishListMainButton-announce']")).click();

}
}
