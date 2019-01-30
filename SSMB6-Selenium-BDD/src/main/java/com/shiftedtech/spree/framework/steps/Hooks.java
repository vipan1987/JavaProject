package com.shiftedtech.spree.framework.steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hooks extends StepBase {

	//public static String BROWSER = "chrome-grid";

	//protected WebDriver driver;

	//public static final String LOCAL_GRID_URL = "http://10.10.21.201:4444/wd/hub";
	public static final String LOCAL_GRID_URL = "http://10.10.23.21:4445/wd/hub";
/*
	public static final String USERNAME = "shiftvision1";
	public static final String AUTOMATE_KEY = "K2KfJ7TxuYypejwtBAQ7";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
*/

	@Before
	public void setUp() {

	/*	String value =  System.getenv("BROWSER");
		if(value != null && value.length() > 0){
			BROWSER = value;
		}

		if(BROWSER.toLowerCase().contentEquals("chrome")) {
			//*** Local Chrome ***
			ChromeDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(BROWSER.toLowerCase().contentEquals("chrome-grid")){
			//*** Remore Chrome ***
			try {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setPlatform(Platform.ANY);
				caps.setBrowserName("chrome");

				driver = new RemoteWebDriver(new URL(LOCAL_GRID_URL),caps);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		else if(BROWSER.toLowerCase().contentEquals("chrome-cloud")) {
			//*** Remore Cloud Chrome ***
			try {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("browser", "Chrome");
				caps.setCapability("browser_version", "62.0");
				caps.setCapability("os", "Windows");
				caps.setCapability("os_version", "10");
				caps.setCapability("resolution", "1920x1080");
				driver = new RemoteWebDriver(new URL(URL), caps);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}
	*/
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setPlatform(Platform.ANY);
			caps.setBrowserName("chrome");

			driver = new RemoteWebDriver(new URL(LOCAL_GRID_URL),caps);
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
		
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
