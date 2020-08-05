package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
	driver.manage().window().maximize();
	WebElement table = driver.findElement(By.tagName("table"));
	WebElement thead = table.findElement(By.tagName("thead"));
	WebElement trow = table.findElement(By.tagName("tr"));
	List<WebElement> th = trow.findElements(By.tagName("th"));
for (WebElement x : th) {
	System.out.println(x.getText());
}

System.out.println("------------");
List<WebElement> tbody=table.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
for (int i = 0; i < tbody.size(); i++) {
List<WebElement> td = tbody.get(i).findElements(By.tagName("td"));
for (int j = 0; j < td.size(); j++) {
	System.out.println(tbody.get(j).getText());
	
}
	
}
}
}
