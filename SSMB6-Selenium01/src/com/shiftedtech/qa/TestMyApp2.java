package com.shiftedtech.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMyApp2 {
	
	public void main() {
		System.out.println("Main");
	}
	
	public static void main2() {
		System.out.println("Main 2");
	}
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\MyDevelopment\\SSMB6EclipseWorkspace\\SSMB6-Selenium01\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//driver = getDriver();
		driver.get("http://heatclinic.shiftedtech.com/");
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		
		//driver.findElement(By.name("j_username")).click();
		//driver.findElement(By.name("j_username")).clear();
		//driver.findElement(By.name("j_username")).sendKeys("shiftqa01@gmail.com");
		
		WebElement userTextbox = driver.findElement(By.name("j_username"));
		userTextbox.click();
		userTextbox.clear();
		userTextbox.sendKeys("shiftqa01@gmail.com");
		
		
		driver.findElement(By.name("j_password")).sendKeys("shiftedtech");
		
		driver.findElement(By.cssSelector("input.login_button")).click();
		
		WebElement myAccount = driver.findElement(By.cssSelector(".my-account"));
		String myText = myAccount.getText();
		
		System.out.println("My Account: " + myText);
	}
	
	public static WebDriver getDriver() {
		return new ChromeDriver();
	}

}
