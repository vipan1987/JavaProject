package com.shiftedtech.qa;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.shiftedtech.qa.framework.ScriptBase5;
import com.shiftedtech.qa.framework.pom.HomePage;
import com.shiftedtech.qa.framework.pom.LoginPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class SpreeLoginTest8 extends ScriptBase5 {
	// this is basically called functional driven framework or controller driven framework
	@Test
	public void validLogin0() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		homePage.verifyPageTitle("Spree Demo Site");
		homePage.goToLoginPage();
	
		loginPage.verifyPageTitle("Login - Spree Demo Site");
		loginPage.login("shiftqa01@gmail.com", "shiftedtech");
		
		homePage.verifySuccessMsg("Logged in successfully");	
	}
	
	@Test
	public void validLogin1() {
		spree().homePage().verifyPageTitle("Spree Demo Site");
		spree().homePage().goToLoginPage();
	
		spree().loginPage().verifyPageTitle("Login - Spree Demo Site");
		spree().loginPage().login("shiftqa01@gmail.com", "shiftedtech");
		
		spree().homePage().verifySuccessMsg("Logged in successfully");	
	}
	@Test
	public void validLogin2() {
		spree().homePage().verifyPageTitle();
		spree().homePage().goToLoginPage();
		spree().loginPage().verifyPageTitle();
		spree().loginPage().login("shiftqa01@gmail.com", "shiftedtech");
		spree().homePage().verifySuccessMsg();	
	}
	
	@Test
	public void invalidPasswordLogin() {	
		spree().homePage().verifyPageTitle("Spree Demo Site");
		spree().homePage().goToLoginPage();
	
		spree().loginPage().verifyPageTitle("Login - Spree Demo Site");
		spree().loginPage().login("shiftqa01@gmail.com", "invalid");
		
		spree().loginPage().verifyErrorMsg("Invalid email or password.");
	}
	
	@Test
	public void invalidEmailLogin() {
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("Spree Demo Site", homePageTitle);
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals("Login - Spree Demo Site", loginPageTitle);
		
		
		WebElement emailTextbox = driver.findElement(By.id("spree_user_email"));
		emailTextbox.sendKeys("shiftqa01xxx@gmail.com");
		
		WebElement passwordTextbox = driver.findElement(By.id("spree_user_password"));
		passwordTextbox.sendKeys("shiftedtech");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		loginPageTitle = driver.getTitle();
		Assert.assertEquals("Login - Spree Demo Site", loginPageTitle);
		
		WebElement successMsg = driver.findElement(By.xpath("//div[@class='alert alert-error']"));
		String successText = successMsg.getText();
		Assert.assertEquals("Invalid email or password.", successText);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
