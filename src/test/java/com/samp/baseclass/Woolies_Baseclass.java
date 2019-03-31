package com.samp.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class Woolies_Baseclass {
	
	public static WebDriver driver;
	
	
	public WebDriver launchBrowser(String browsername) throws Exception {
		
		try {
			if (browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			else if (browsername.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
			else if (browsername.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
				driver = new ChromeDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Is not a valid browser");
					
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void launchURL() throws Exception {
				try {
					driver.get("www.woolworths.com.au");
					driver.manage().window().maximize();
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception("Unable to launch the URL");
				}

	}
	
	public static boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	
	public static boolean elementIsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	public static void elementClick(WebElement element) {
		element.click();
	}
	
	
	
}
