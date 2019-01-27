package com.bank.junit.test;

import static org.junit.Assert.*;

import java.sql.Driver;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTest {
	
	public WebDriver driver=null;
	@Before 
	public void setUp() {
		
		WebDriverManager.chromedriver().arch32().setup();
		driver = new ChromeDriver();
		driver.get("http://shifttest.shiftedtech.com/components/text_box");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		WebElement element=driver.findElement(By.id("url"));
		element.click();
		element.clear();
		element.sendKeys("https://www.yahoo.com/");
		
		
		
		
		
	System.out.println("first set up method");
	}
	
    @Test
	
	public void test1() {
    	
    	ChromeDriverManager.chromedriver().arch32().setup();
        driver = new ChromeDriver();
        
       // driver.get("http://shifttest.shiftedtech.com/components/button");
        
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.id("u_0_c"));
        
        
        
        element.click();
        
        element.clear();
        
        
        element.sendKeys("vipan@hotmail.com");
       
    
    
		
		System.out.println("this is my first test");
	}
    @Test
	
	public void test2() {
		
		
		System.out.println("this is my second test");
	}
    @After 
    public void tearDown() {
    	
    	System.out.println("close the test ");
    }

}
