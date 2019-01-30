package com.shiftedtech.qa;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
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
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@RunWith(Parameterized.class)
public class SpreeLoginTest10 extends ScriptBase5 {
	
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
		String fileToRead = System.getProperty("user.dir") + "/src/test/resources/SpreeLoginData.xls";
		String[][] data = null;
		
		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(new File(fileToRead));
			Sheet sheet = workbook.getSheet(0);
			
			data = new String[sheet.getRows() - 1][sheet.getColumns()];
			
			for(int i = 1; i < sheet.getRows(); i++) {
				Cell cell1 = sheet.getCell(0, i);
				String email = cell1.getContents();
				
				Cell cell2 = sheet.getCell(1, i);
				String password = cell2.getContents();
				
				data[i - 1][0] = email;
				data[i - 1][1] = password;
			}
			
			
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return Arrays.asList(data);
	}
	
}
