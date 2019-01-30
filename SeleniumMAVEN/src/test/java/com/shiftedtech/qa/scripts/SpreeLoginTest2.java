package com.shiftedtech.qa.scripts;

import static org.junit.Assert.assertEquals;

import javax.swing.text.Element;
import javax.xml.xpath.XPath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.How;
import org.xml.sax.Locator;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import junit.framework.Assert;

public class SpreeLoginTest2 {
	private WebDriver driver= null;

	@Before
	
	public void setUp() {
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir"+ "\\drivers\\chromedriver.exe"));
	ChromeDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.navigate().to("http://spree.shiftedtech.com/");
	}
	
	
		
		
		
		
		
			
		
public void click(String  locator) {
By by=	getLocator(locator);
	if(by!=null) {
		WebElement element =driver.findElement(by);
		if (element!=null) {
			element.click();	
		}
		
	}
	

	
	
	

	}
public By getLocator(String locator ) {
	
	By by=null;
	
	
	String[] locatorparts = locator.split(":=");
	if (locatorparts!=null && locatorparts.length==2) {
	String how =locatorparts[0];
	
	String using = locatorparts[1];
	
	
	if (how.equalsIgnoreCase("id")){
		
		by =By.id(using);
	}
		
		else if(how.equalsIgnoreCase("cssSelector")) {
			by=By.cssSelector("using");
			
		}
		else if(how.equalsIgnoreCase("linkText")) {
		by	=By.linkText(using);
		
	}
	else if (how.equalsIgnoreCase("xpath")) {
		by=By.xpath("using");
		}
	else if (how.equalsIgnoreCase("partialLinkText")) {
		by=By.partialLinkText("using");
		
	}
	else if (how.equalsIgnoreCase("name")) {
		by= By.name("using");
		
	}
	else if (how.equalsIgnoreCase("classname")) {
		by= By.className("using");
		
	}
	else if (how.equalsIgnoreCase("tagname")) {
		by= By.tagName("using");
		
	}
	
		
	}
	return by;
	
	
	
	
	
	
	
}






public void enterText(String locator, CharSequence textToType ) {
	
	
                    By by= getLocator(locator);
if(by!=null) {
	WebElement element=driver.findElement(by);
	if (element!=null) {
	element.sendKeys(textToType);
	}
}



}
public void verifyTitle(String expectedtitle) {
  String pagetitle=driver.getTitle();
  Assert.assertEquals(expectedtitle, pagetitle);
}

		
		
		
	
	
	
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
	

}
