package com.shiftedtech.qa;

import java.sql.Driver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.StringHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.shiftedtech.qa.framework.ScriptBase;
import com.shiftedtech.qa.framework.ScriptBase2;
import com.shiftedtech.qa.framework.utils.ExcelReader;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class KeywordDrivenTest1 extends ScriptBase2{
	
	@Test
	public void KeywordDrivenTestDriver() {
		String fileName = System.getProperty("user.dir") + "/src/test/resources/KWScript.xlsx";
		ExcelReader reader = new ExcelReader(fileName);
		String[][] sheetData =  reader.getExcelSheetData(1,true);
		
		for(int i = 0; i < sheetData.length; i++) {
			
			String step = sheetData[i][0];
			String keyword = sheetData[i][1];
			String locator = sheetData[i][2];
			String data = sheetData[i][3];
			
			System.out.println(String.format("Step: %s Keyword: %s Locator: %s Data: %s", step,keyword,locator,data));
			
			if(keyword.equalsIgnoreCase("browserToUrl")) {
				browserToUrl(data);
			}
			else if(keyword.equalsIgnoreCase("click")) {
				click(locator);
			}
			else if(keyword.equalsIgnoreCase("inputText")) {
				enterText(locator,data);
			}
			else if(keyword.equalsIgnoreCase("delayFor")) {
				delayFor(Double.valueOf(data).intValue());
			}
			else if(keyword.equalsIgnoreCase("verifyText")) {
				verifyText(locator,data);
			}
			
		}
		
		
	}
	/*
	@Test
	public void validLogin() {
		verifyPageTitle("Spree Demo Site");
		click("linkText:=Login");
		verifyPageTitle("Login - Spree Demo Site");
		enterText("id:=spree_user_email","shiftqa01@gmail.com");
		enterText("id:=spree_user_password","shiftedtech");
		click("xpath:=//input[@value='Login']");
		delayFor(3000);
		verifyPageTitle("Spree Demo Site");
		verifyText("xpath:=//div[@class='alert alert-success']","Logged in successfully");
	}*/
	
	

}
