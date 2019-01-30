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

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class SpreeLoginTest4 extends ScriptBase2{
	
	
	@Test
	public void validLogin() {
		verifyPageTitle("Spree Demo Site");
		click("HomePage.LoginLink");
		verifyPageTitle("Login - Spree Demo Site");
		enterText("LoginPage.EmailTextbox","shiftqa01@gmail.com");
		enterText("LoginPage.Passwordtextbox","shiftedtech");
		click("LoginPage.LoginButton");
		delayFor(3000);
		verifyPageTitle("Spree Demo Site");
		verifyText("HomePage.SuccessMessage","Logged in successfully");
	}
	
	@Test
	public void invalidPasswordLogin() {
		
		verifyPageTitle("Spree Demo Site");
		click("HomePage.LoginLink");
		verifyPageTitle("Login - Spree Demo Site");
		enterText("LoginPage.EmailTextbox","shiftqa01@gmail.com");
		enterText("LoginPage.Passwordtextbox","invalid");
		click("LoginPage.LoginButton");
		delayFor(3000);
		verifyPageTitle("Login - Spree Demo Site");
		verifyText("LoginPage.ErrorMessage","Invalid email or password.");	
	}
	
	@Test
	public void invalidEmailLogin() {
		verifyPageTitle("Spree Demo Site");
		click("HomePage.LoginLink");
		verifyPageTitle("Login - Spree Demo Site");
		enterText("LoginPage.EmailTextbox","shiftqa01xxx@gmail.com");
		enterText("LoginPage.Passwordtextbox","shiftedtech");
		click("LoginPage.LoginButton");
		delayFor(3000);
		verifyPageTitle("Login - Spree Demo Site");
		verifyText("LoginPage.ErrorMessage","Invalid email or password.");
	}
	
	

}
