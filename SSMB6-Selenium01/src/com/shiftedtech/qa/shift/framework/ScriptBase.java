package com.shiftedtech.qa.shift.framework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptBase {
	
	public static final String APP_URL = "http://shifttest.shiftedtech.com/components";
	protected WebDriver driver = null;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
		/*
		Point p =  driver.manage().window().getPosition();
		System.out.println("X:" + p.getX() + " Y:" + p.getY());
		Dimension d = driver.manage().window().getSize();
		System.out.println("Height:" + d.getHeight() + " Width:" + d.getWidth());
		*/
		
		//driver.manage().window().maximize();
		
		/*
		driver.manage().window().setSize(d);
		driver.manage().window().setPosition(p);
		
		driver.manage().window().setSize(new Dimension(800, 600));
		driver.manage().window().setPosition(new Point(300,300));
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		*/
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().to(APP_URL);

	}
	
	@After
	public void tearDown() {
		//driver.close();
		//driver.quit();
	}
	
	public void delayFor(int timeinMili) {
		
		try {
			Thread.sleep(timeinMili);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
