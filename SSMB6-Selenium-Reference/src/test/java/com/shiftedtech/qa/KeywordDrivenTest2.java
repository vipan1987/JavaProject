package com.shiftedtech.qa;

import java.sql.Driver;

import javax.sound.midi.VoiceStatus;

import org.apache.commons.compress.archivers.zip.ScatterStatistics;
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
import com.shiftedtech.qa.framework.kwd.KeywordDriver;
import com.shiftedtech.qa.framework.utils.ExcelReader;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import jxl.read.biff.SetupRecord;

public class KeywordDrivenTest2 extends ScriptBase2{
	private static final String SCRIPT_FILE = System.getProperty("user.dir") + "/src/test/resources/KWScript.xlsx";
	private KeywordDriver keywordDriver = null;
	
	@Before
	public void setUp() {
		super.setUp();
		keywordDriver = new KeywordDriver(driver, SCRIPT_FILE);
	}
	
	@Test
	public void KeywordDrivenTestDriver1() {
		keywordDriver.runScript(1);
	}
	
	@Test
	public void KeywordDrivenTestDriver2() {
		keywordDriver.runScript("TC002");
	}
	

}
