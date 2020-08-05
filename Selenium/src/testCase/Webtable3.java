package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement thead = table.findElement(By.tagName("thead"));
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> trow = thead.findElement(By.tagName("tr")).findElements(By.tagName("th"));
		for (int i=0; i<trow.size(); i++) {
			
			List<WebElement> tdd = tbody.findElements(By.tagName("tr"));
			for (int j =0 ; j < tdd.size(); j++) {
				System.out.println(tdd.get(j).getText());
				
//				List<WebElement> tdata = tbody.findElements(By.tagName("th"));
//				for (int k = 0; k < tdata.size(); k++) {
//					System.out.println(tdata.get(k).getText());		
//					
//					List<WebElement> x = tbody.findElements(By.tagName("td"));
//					for (int l = 0; l < x.size(); l++) {
//						System.out.println(x.get(l).getText());
//						break;
//					}
//					
//				}
			}
			break;
		}
	}

}
