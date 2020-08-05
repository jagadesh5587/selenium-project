package testCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
JavascriptExecutor js = (JavascriptExecutor)driver;
WebElement button = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
js.executeScript("arguments[0].click()", button);


Actions ac = new Actions(driver);
WebElement x = driver.findElement(By.xpath("//span[text()='Electronics']"));
ac.moveToElement(x).click().build().perform();
WebElement findElement = driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_']/span[text()='Electronics']/following-sibling::ul/li/ul/li/ul/li"));
Select s = new Select(findElement);
List<WebElement> options = s.getOptions();
for (WebElement op : options) {
	System.out.println(op.getText());
	
}
//driver.findElement(By.xpath("//a[@title='Formal Shoes']")).click();
//Thread.sleep(2000);
//WebElement slection = driver.findElement(By.xpath("(//img[@class='_3togXc'])[20]"));
//js.executeScript("arguments[0].scrollIntoView(true)", slection);
//slection.click();
//Thread.sleep(1000);
//String parent = driver.getWindowHandle();
//Set<String> windowHandles = driver.getWindowHandles();
//List<String> l = new ArrayList<String>();
//l.addAll(windowHandles);
//driver.switchTo().window(l.get(1));
//
//WebElement tab = driver.findElement(By.xpath("(//a[@class='_1TJldG _2I_hq9 _2UBURg'])[3]"));
//js.executeScript("arguments[0].scrollIntoView(true)", tab);
//Thread.sleep(1000);
//js.executeScript("arguments[0].click()", tab);
//tab.click();
Thread.sleep(2000);
//Set<String> windowHandles = driver.getWindowHandles();
//List<String> l = new ArrayList<String>();
//l.addAll(windowHandles);
//driver.switchTo().window(l.get(1));


}
}
