package com.shiftedtech.qa;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import com.shiftedtech.qa.framework.ScriptBase2;
import com.shiftedtech.qa.framework.kwd.KeywordDriver;
import com.shiftedtech.qa.framework.utils.ExcelReader;


@RunWith(Parameterized.class)
public class KeywordDrivenTest3 extends ScriptBase2{
	private static final String SCRIPT_FILE = System.getProperty("user.dir") + "/src/test/resources/KWScript.xlsx";
	private KeywordDriver keywordDriver = null;
	
	
	@Parameter(value = 0)
	public  String name;
	@Parameter(value = 1)
	public  String description;
	@Parameter(value = 2)
	public  String tc;
	@Parameter(value = 3)
	public  String testData;
	@Parameter(value = 4)
	public  String run;
	
	
	@Before
	public void setUp() {
		super.setUp();
		keywordDriver = new KeywordDriver(driver, SCRIPT_FILE);
	}
	
	@Test
	public void KeywordDrivenTestDriver() {
		if(run.contentEquals("Y")) {
			HashMap<String, Object> td = getTestData(); 
			keywordDriver.runScript(tc,td);
		}
		else {
			return;
		}
	}
	
	private HashMap<String, Object> getTestData(){
		HashMap<String, Object> tdMap = new HashMap<>();
		if(testData != null && testData.length() > 0) {
			
			ExcelReader reader = new ExcelReader(SCRIPT_FILE);
			String[] tdIds = reader.getExcelColData("TestData", 0);
			int tdid = Arrays.asList(tdIds).indexOf(testData);
			String[] dataHeader = reader.getExcelRowData("TestData", 0);
			String[] data = reader.getExcelRowData("TestData", tdid);
			for (int i = 0; i < dataHeader.length; i++) {
				String key = dataHeader[i];
				String value = data[i];
				tdMap.put(key, value);
			}
		}
		return tdMap;
	}
	
	@Parameterized.Parameters(name = "{index}: name={0}, description={1}, tc: {2}")
	public static Collection<Object[]> getTestScriptList() {
		ExcelReader reader = new ExcelReader(SCRIPT_FILE);
		
		String[][] data = reader.getExcelSheetData("TestSuite", true);
		
		return Arrays.asList(data);
	}

}
