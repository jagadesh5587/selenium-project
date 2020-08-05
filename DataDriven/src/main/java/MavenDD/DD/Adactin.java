package MavenDD.DD;

import org.openqa.selenium.By;

import com.Base.Base;

public class Adactin extends Base{
public static void main(String[] args) throws Throwable {

	launchBrowser("chrome");
launchUrl("http://adactinhotelapp.com/");
implicit();
	sendValues(driver.findElement(By.id("username")),getData("Login", 1, 0));
	sendValues(driver.findElement(By.id("password")), getData("Login", 1, 1));
}
}
