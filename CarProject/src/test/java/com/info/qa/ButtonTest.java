package com.info.qa;

import static org.junit.Assert.assertEquals;

import javax.xml.transform.Source;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ButtonTest extends FirstMaven  {
			@Override
			@Before
			public void setUp() {
				super.setUp();
				driver.navigate().to("http://shifttest.shiftedtech.com/components/button");
				
			}
			@Test
			
			public void test1() {
				WebElement buttontest= driver.findElement(By.id("basic-button-01"));
				delayFor(1000);
				buttontest.click();
				delayFor(2000);
				
				String expected = "Button is clicked. You have 10 seconds to verify it.";
		
				WebElement findtext=driver.findElement(By.id("alert-btn-clicked"));
				System.out.println("get text : "+findtext.getText());
				delayFor(10000);
				//assertEquals("Button is clicked. You have 10 seconds to verify it", findtext.getText());
				delayFor(10000);
				WebElement disabledbutton=driver.findElement(By.id("deactive-button-01"));
				delayFor(5000);
				String attribute =disabledbutton.getAttribute("disabled");
				//if (attribute==null||attribute.contains("false")) {
				//	System.out.println("false");
				//}
					//else {
				//		System.out.println("true");
						
					//}
				String title= driver.getTitle();
				
				String source=driver.getPageSource();
				String url=driver.getCurrentUrl();
				
				System.out.println(title +""+ source+""+url);
				delayFor(10000);
				boolean buttonstate=test2(disabledbutton);
				if (buttonstate==true) {
					System.out.println("do this action  ");
			}
						else {
						System.out.println("do something else ");
				}
				
			}
			
		
			public boolean test2(WebElement disabledbutton) {
				
				String attribute=disabledbutton.getAttribute("disabled");
				if (attribute==null||attribute.contains("false")) {
					return false;
				}else {
					return true;
				}
				
				
				
				
				
			}
				
				
				
			}
	
			

		
		
