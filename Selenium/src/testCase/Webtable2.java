package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://geographyfieldwork.com/WorldCapitalCities.htm");
	driver.manage().window().maximize();
	WebElement table = driver.findElement(By.tagName("table"));
	WebElement tbody = table.findElement(By.tagName("tbody"));
	WebElement trow = table.findElement(By.tagName("tr"));
	List<WebElement> tr = trow.findElements(By.tagName("th"));
	for (int i = 0; i < tr.size(); i++) {
		List<WebElement> td = tbody.findElement(By.tagName("tr")).findElements(By.tagName("td"));
		
		for (int j = 0; j < td.size(); j++) {
			System.out.println(td.get(j).getText());
			break;
		}
	}
}
}
		

