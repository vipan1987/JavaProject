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
import com.shiftedtech.qa.framework.ScriptBase3;
import com.shiftedtech.qa.framework.ScriptBase4;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class SpreeLoginTest7 extends ScriptBase4{
	
	
	@Test
	public void validLogin() {
		driverUtil.verifyPageTitle("Spree Demo Site");
		webElement.click(HomePage_LoginLink);
		driverUtil.verifyPageTitle("Login - Spree Demo Site");
		webElement.enterText(LoginPage_EmailTextbox,"shiftqa01@gmail.com");
		webElement.enterText(LoginPage_Passwordtextbox,"shiftedtech");
		webElement.click(LoginPage_LoginButton);
		webElement.delayFor(3000);
		driverUtil.verifyPageTitle("Spree Demo Site");
		webElement.verifyText(HomePage_SuccessMessage,"Logged in successfully");
	}
	
	
}
