package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableex4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	WebDriver  driver = new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/table.html");
	Thread.sleep(2000);
	driver.manage().window().maximize();	

	WebElement table = driver.findElement(By.xpath("/table//tbody[@id='1']"));
	List<WebElement> tr = table.findElements(By.tagName("tr"));
	for (int i = 1; i < tr.size(); i++) {
		
		List<WebElement> td = tr.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < td.size(); j++) {
			if(td.get(j).getText().equals("sid")){
				System.out.println(driver.findElement(By.xpath("/table//tr["+(i+1)+"]//td[3]")).getText());
				break;
		}
			}
		}
		
}
} 


