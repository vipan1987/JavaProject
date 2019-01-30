package com.shiftedtech.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMyApp {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\MyDevelopment\\SSMB6EclipseWorkspace\\SSMB6-Selenium01\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = null;
		
		driver = new ChromeDriver();
		
		//driver = getDriver();
		driver.get("http://heatclinic.shiftedtech.com/");
		
		driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.partialLinkText("items")).click();
		
		//driver.findElement(By.name("j_username")).sendKeys("shiftqa01@gmail.com");
		driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("shiftqa01@gmail.com");;
		driver.findElement(By.name("j_password")).sendKeys("shiftedtech");
		
		driver.findElement(By.cssSelector("input.login_button")).click();
		
		
	}
	
	public static WebDriver getDriver() {
		return new ChromeDriver();
	}

}
