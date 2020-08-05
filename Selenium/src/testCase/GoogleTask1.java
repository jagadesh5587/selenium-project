package testCase;

import org.openqa.selenium.By;

public class GoogleTask1 extends Base{
	public static void main(String[] args) throws Throwable {
		
		 launchBrowser ("Chrome");
		 launchUrl("https://www.google.com/");
		 mouseOver(driver.findElement(By.xpath("(//a[@class='gb_g'])[1]")));
		 mouseOverRightClick(driver.findElement(By.xpath("(//a[@class='gb_g'])[1]")));
		 Thread.sleep(2000); 
		 
robotClass();
		 parentWindow();
		 Thread.sleep(2000);
		 childWindow();
		 Thread.sleep(1000);
click(driver.findElement(By.xpath("(//a[@class='h-c-header__nav-li-link '])[2]")));
	}

}
