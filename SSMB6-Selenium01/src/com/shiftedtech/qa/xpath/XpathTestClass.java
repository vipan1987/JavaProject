package com.shiftedtech.qa.xpath;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTestClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		
//		WebElement name = driver.findElement(By.xpath("//td[contains(text(),'Maria Anders')]"));
//		System.out.println(name.getText());
		
		List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='customers']//td[position()=2]"));
		
		
		for(WebElement element: nameList) {
			System.out.println(element.getText());
			
		}
		
		
		
		
	}
	
	public static WebDriver getDriver() {
		return new ChromeDriver();
	}


}
