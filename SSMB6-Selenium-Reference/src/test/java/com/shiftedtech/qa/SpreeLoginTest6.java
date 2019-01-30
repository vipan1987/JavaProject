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

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class SpreeLoginTest6 extends ScriptBase3{
	
	
	@Test
	public void validLogin() {
		verifyPageTitle("Spree Demo Site");
		click(HomePage_LoginLink);
		verifyPageTitle("Login - Spree Demo Site");
		enterText(LoginPage_EmailTextbox,"shiftqa01@gmail.com");
		enterText(LoginPage_Passwordtextbox,"shiftedtech");
		click(LoginPage_LoginButton);
		delayFor(3000);
		verifyPageTitle("Spree Demo Site");
		verifyText(HomePage_SuccessMessage,"Logged in successfully");
	}
	
	@Test
	public void invalidPasswordLogin() {
		
		verifyPageTitle("Spree Demo Site");
		click(HomePage_LoginLink);
		verifyPageTitle("Login - Spree Demo Site");
		enterText(LoginPage_EmailTextbox,"shiftqa01@gmail.com");
		enterText(LoginPage_Passwordtextbox,"invalid");
		click(LoginPage_LoginButton);
		delayFor(3000);
		verifyPageTitle("Login - Spree Demo Site");
		verifyText(LoginPage_ErrorMessage,"Invalid email or password.");	
	}
	
	@Test
	public void invalidEmailLogin() {
		verifyPageTitle("Spree Demo Site");
		click(HomePage_LoginLink);
		verifyPageTitle("Login - Spree Demo Site");
		enterText(LoginPage_EmailTextbox,"shiftqa01xxx@gmail.com");
		enterText(LoginPage_Passwordtextbox,"shiftedtech");
		click(LoginPage_LoginButton);
		delayFor(3000);
		verifyPageTitle("Login - Spree Demo Site");
		verifyText(LoginPage_ErrorMessage,"Invalid email or password.");
	}
	
	

}
