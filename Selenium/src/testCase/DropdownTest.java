package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest extends Base {
	public static void main(String[] args) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		WebElement dropdown = driver.findElement(By.xpath("//select[@id='multi-select']"));
//		Select s= new Select(dropdown);
//		s.selectByIndex(2);
//		s.selectByVisibleText("New York");
//		s.selectByValue("Ohio");
//		List<WebElement> options = s.getAllSelectedOptions();
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getText());
//		}
//		Thread.sleep(2000);
//		s.deselectAll();
//		System.out.println(s +"deselected all");
		
		
		launchBrowser("chrome");
		launchUrl("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		selectMultipleOption(driver.findElement(By.xpath("//select[@id='multi-select']")), "index", "1");
		selectMultipleOption(driver.findElement(By.xpath("//select[@id='multi-select']")), "value", "New York");
		getAllSelectedOption(driver.findElement(By.xpath("//select[@id='multi-select']")));
}
}
