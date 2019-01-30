package com.shiftedtech.qa;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.shiftedtech.qa.framework.ScriptBase5;
import com.shiftedtech.qa.framework.pom.HomePage;
import com.shiftedtech.qa.framework.pom.LoginPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

@RunWith(Parameterized.class)
public class SpreeLoginTest9 extends ScriptBase5 {
	
	@Parameter(value = 0)
	public String emailAddress;
	@Parameter(value = 1)
	public String password;
	
	
	@Test
	public void validLogin1() {
		spree().homePage().verifyPageTitle("Spree Demo Site");
		spree().homePage().goToLoginPage();
	
		spree().loginPage().verifyPageTitle("Login - Spree Demo Site");
		
		spree().loginPage().login(emailAddress, password);
		
		spree().homePage().verifySuccessMsg("Logged in successfully");	
	}
	
	@Parameterized.Parameters(name = "{index}: Email={0}, Password={1}")
	public static Collection<Object[]> getTestData(){
		String[][] data = {
							{"shiftqa01@gmail.com","shiftedtech"},
							{"shiftqa01@gmail.com","shiftedtech"},
							{"shiftqa01@gmail.com","shiftedtech"}
						};
		
		
		return Arrays.asList(data);
	}
	
}
