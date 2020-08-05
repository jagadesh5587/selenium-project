package com.FunctionalLibraries;

import java.util.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {
public static WebDriver driver; 
	public static void launchBrowser(String browser) {
if(browser.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\Selenium\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
}else if(browser.equalsIgnoreCase("Firefox")){
	System.setProperty("webdriver.gecko.driver", "E:\\Java\\Selenium\\Driver\\geckodriver.exe");
	driver = new ChromeDriver();
}else {
	System.setProperty("webdriver.ie.driver", "E:\\Java\\Selenium\\Driver\\\\IEDriverServer.exe");
	driver = new ChromeDriver();
}
driver.manage().window().maximize();
}

	public static void launchUrl(String url) {
try {
	driver.get(url);	
} catch (Exception e) {
	e.getStackTrace();
}
	}
	
	public static void sendValues(WebElement element, String name) {
try {
	element.sendKeys(name);
} catch (Exception e) {
e.getStackTrace();
}
	}
	
public static void click(WebElement element) {
try {
	element.click();
} catch (Exception e) {
e.getStackTrace();
}
}

public static void implicit() {
	try {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	} catch (Exception e) {
		e.getStackTrace();
	}
}


public static void explicit(WebElement element) {
	try {
		WebDriverWait wb = new WebDriverWait(driver, 60);
		wb.until(ExpectedConditions.visibilityOf(element));
	} catch (Exception e) {
		e.getStackTrace();
	}
}
	public static void screenShot(String name) {
try {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File des = new File("E:\\Java\\PomFramework\\Output"+name+".png");
	FileUtils.copyFile(source, des);
} catch (Exception e) {
e.getStackTrace();
}
	}
	
	public static void selectMultipleOption(WebElement element, String option, String name) {
try {
	explicit(element);
	Select s= new Select(element);
			if(option.equalsIgnoreCase("index")) {
				int x =Integer.parseInt(name);
				s.selectByIndex(x);
			}else if (option.equalsIgnoreCase("value")) {
				s.selectByValue(name);
			}else if (option.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(name);
			}
}catch (Exception e) {
e.getStackTrace();	
}
	}
	
	public static  void selectOptioninList(WebElement element, String option, String name) {
try {
	explicit(element);
	Select s = new Select(element);
	if(option.equalsIgnoreCase("visible text")) {
		s.selectByValue(name);
	}
	
} catch (Exception e) {
	e.getStackTrace();
}
	}
	
	public static void getOption(WebElement element) {
try {
	explicit(element);
	Select s= new Select(element);
	List<WebElement> options = s.getOptions();
	for (WebElement opt : options) {
		System.out.println(opt.getText());
	}
} catch (Exception e) {
	e.getStackTrace();
	}
		
	}
	
	public static  void getAllSelectedOption(WebElement element) {
try {
	Select s= new Select(element);
	List<WebElement> allSelected = s.getAllSelectedOptions();
	for (WebElement g : allSelected) {
		System.out.println(g.getText());
	}
} catch (Exception e) {
e.getStackTrace();
}
	}
	
	public static void mouseOver(WebElement element) {
		try {
			explicit(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
e.getStackTrace();
		}
	}
	
	public static void mouseOverClick(WebElement element) {
		try {
			explicit(element);
			Actions ac = new Actions(driver);
ac.click(element).build().perform();
		} catch (Exception e) {
e.getStackTrace();
		}
	}
	
	public static void mouseOverSendKeys(WebElement element, String value) {
		try {
			Actions ac = new Actions(driver);
ac.sendKeys(element, value).build().perform();
		} catch (Exception e) {
e.getStackTrace();
		}
	}

		public static void mouseOverRightClick(WebElement element) {
		try {
			Actions ac = new Actions(driver);
ac.contextClick(element).perform();

		} catch (Exception e) {
e.getStackTrace();
		}
	}

		public static void mouseOverDoubleClick(WebElement element) {
			try {
				Actions ac = new Actions(driver);
	ac.doubleClick(element).perform();

			} catch (Exception e) {
	e.getStackTrace();
			}
		}
		
		public static void mouseOverDragDrop(WebElement element, WebElement element1) {
			try {
				Actions ac = new Actions(driver);
ac.dragAndDrop(element, element1).build().perform();
			} catch (Exception e) {
	e.getStackTrace();
			}
		}
		
		public static void dropDownList(WebElement element, String value) {
List<WebElement> option =  driver.findElements(By.xpath("//li[@class='Wbt_B2 _1YVU3_']/span[text()='Electronics']/following-sibling::ul/li/ul/li/ul/li/a"))	;
for (WebElement webElement : option) {
if(webElement.getAttribute("title").equalsIgnoreCase(value)) {
	System.out.println(webElement.getAttribute("title"));
	webElement.click();
	break;
}
	
}
		}
		
		public static void clearField(WebElement element) {
			try {
				element.clear();
			} catch (Exception e) {
e.getStackTrace();			}
		}
		
		public static void compareDates() {
implicit();

			String text = driver.findElement(By.id("datepick_in")).getText();
			String text2 = driver.findElement(By.id("datepick_out")).getText();
			System.out.println(text);
			System.out.println(text2);
			String i = text.toString();
String j = text2.toString();
			if(i.contentEquals(j)) {
				System.out.println("Date Error");
			}
	
			
		}
		
	public static void scrollDown(WebElement  element) {
try {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
} catch (Exception e) {
e.getStackTrace();
}		
	}
	
	public static void scrollDownByLocation(int xaxis, int yaxis) {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(xaxis,yaxis)");
		} catch (Exception e) {
		e.getStackTrace();
		}		
			}
	
	public static void javaScriptClick(WebElement element) {
		try {
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("arguments[0].click", element);
		} catch (Exception e) {
e.getStackTrace();
		}
	}
	
	public static void alertPopup(WebElement element, String option) {
		try {
			explicit(element);
			Alert alert = driver.switchTo().alert();
			if(option.equalsIgnoreCase("simple")) {
				alert.accept();
			}else if (option.equalsIgnoreCase("Proceed to checkout")) {
				alert.accept();
			}else {
				alert.dismiss();
			}
			
		
		} catch (Exception e) {
e.getStackTrace();
		}
		
	}
	
	public static void robotClass() {
try {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
} catch (Exception e) {
e.getStackTrace();
}
	}

	public static void parentWindow() {
try {
	String parent = driver.getWindowHandle();	
	System.out.println(parent);
} catch (Exception e) {
	e.getStackTrace();
}
	}

	public static void childWindow() {
		try {
			Set<String> child = driver.getWindowHandles();
			System.out.println(child);
			List<String> l = new ArrayList<String>(child);
			driver.switchTo().window(l.get(1));
System.out.println(l.get(1));
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public static void switchtoframe(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
e.getStackTrace();
		}
	}
	
	
}

