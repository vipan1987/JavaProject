package com.shiftedtech.qa.framework.kwd;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import com.shiftedtech.qa.framework.utils.ExcelReader;
import com.shiftedtech.qa.framework.utils.PropertyObjectRepositoryManager;

public class KeywordDriver {
	private WebDriver driver = null;
	private String scriptFile = null;
	private KeywordLibery keywordLibery = null;
	private PropertyObjectRepositoryManager or = PropertyObjectRepositoryManager.getInstance();
	
	
	public KeywordDriver(WebDriver driver, String scriptFile) {
		super();
		this.driver = driver;
		this.scriptFile = scriptFile;
		keywordLibery = new KeywordLibery(driver);
	}
	
	public void runScript(String  scriptName) {
		ExcelReader reader = new ExcelReader(scriptFile);
		String[][] excelData = reader.getExcelSheetData(scriptName, true);
		readTestStep(excelData);
	}
	public void runScript(String  scriptName, HashMap<String, Object> td) {
		ExcelReader reader = new ExcelReader(scriptFile);
		String[][] excelData = reader.getExcelSheetData(scriptName, true);
		readTestStep(excelData,td);
	}
	
	public void runScript(int scriptIndex) {
		
		ExcelReader reader = new ExcelReader(scriptFile);
		String[][] excelData = reader.getExcelSheetData(scriptIndex, true);
		readTestStep(excelData);
	}
	
	private void readTestStep(String[][] excelData) {
		for(int i = 0 ; i < excelData.length; i++) {
			String step = excelData[i][0];
			String keyword = excelData[i][1];
			String locator = excelData[i][2];
			String data = excelData[i][3];
			System.out.println(String.format("Step: %s Keyword: %s Locator: %s Data: %s", step,keyword,locator,data));

			processKeywordStep(step,keyword,locator,data);
		}
	}
	private void readTestStep(String[][] excelData, HashMap<String, Object> td) {
		for(int i = 0 ; i < excelData.length; i++) {
			String step = excelData[i][0];
			String keyword = excelData[i][1];
			String locator = excelData[i][2];
			String data = excelData[i][3];
			System.out.println(String.format("Step: %s Keyword: %s Locator: %s Data: %s", step,keyword,locator,data));
			
			if(data != null && data.startsWith("{") && data.endsWith("}")) {
				String dataKey = data.substring(1, data.length()-1);
				if(td.containsKey(dataKey)) {
					data = td.get(dataKey).toString();
				}
			}
			
			processKeywordStep(step,keyword,locator,data);
		}
	}
	
	private void processKeywordStep(String step, String keyword, String locator, String data) {
		System.out.println("Processing step " + step + " ...");
		
		if(keyword.equalsIgnoreCase("browserToUrl")) {
			keywordLibery.browserToUrl(data);
		}
		else if(keyword.equalsIgnoreCase("click")) {
			keywordLibery.click(or.get(locator));
		}
		else if(keyword.equalsIgnoreCase("inputText")) {
			keywordLibery.inputText(or.get(locator), data);
		}
		else if(keyword.equalsIgnoreCase("delayFor")) {
			keywordLibery.delayFor(Double.valueOf(data).intValue());
		}
		else if(keyword.equalsIgnoreCase("verifyText")) {
			keywordLibery.verifyText(or.get(locator),data);	
		}
		else {
			System.out.println("***** Unknown keyword *****");
		}
		
	}

}
