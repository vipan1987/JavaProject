package com.shiftedtech.qa.framework.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelObjectRepositoryManager {
	private static ExcelObjectRepositoryManager instance = null;
	
	private static final String EXCEL_FILE_LOCATION = System.getProperty("user.dir") + "/src/main/resources/SpreeOR.xls";

	private HashMap<String, String> repository = null;
	
	private ExcelObjectRepositoryManager() {
		repository = new HashMap<>();
		//load();
		loadEx();
	}
	
	public static ExcelObjectRepositoryManager getInstance() {
		if(instance == null) {
			instance = new ExcelObjectRepositoryManager();
		}
		return instance;
	}
	
	public String get(String key) {
		String value = repository.get(key);
		if(value == null || value.trim().length() == 0) {
			throw new RuntimeException("Could not read locator with the key: " + key);
		}
		return value;
	}
	public String getLocatorBy(String key) {
		String locator = null;
		String value = repository.get(key);
		locator = value.split(":")[0];
		return locator;
	}
	public String getLocator(String key) {
		String locator = null;
		String value = repository.get(key);
		locator = value.split(":")[1];
		return locator;
	}
	
	private void load() {
		Workbook workbook = null;
		
		try {
			workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));
			Sheet sheet = workbook.getSheet(0);
			
			int rows = sheet.getRows();
			System.out.println("Total row: " + rows);
			for(int i = 1; i < rows; i++) {
				System.out.println("Reading row number: " + i);
				Cell cell1 = sheet.getCell(i, 0);
				String key = cell1.getContents();
				System.out.print("Key: " + key);
				
				Cell cell2 = sheet.getCell(i, 1);
				String how = cell2.getContents();
				System.out.print(", How: " + how);
				
				Cell cell3 = sheet.getCell(i, 2);
				String by = cell3.getContents();
				repository.put(key, how + ":" + by);
				System.out.println(", By: " + by);
			}

			
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
            if (workbook != null) {
                workbook.close();
            }
        }
	}
	
	private void loadEx() {
		
		ExcelReader excelReader = new ExcelReader(EXCEL_FILE_LOCATION);
		
		String[][] data = excelReader.getExcelSheetData(0);
			
			int rows = data.length;
			System.out.println("Total row: " + rows);
			for(int i = 1; i < rows; i++) {
				System.out.println("Reading row number: " + i);
				String key = data[i][0];
				System.out.print("Key: " + key);
				
				String how = data[i][1];
				System.out.print(", How: " + how);

				String by = data[i][2];
				repository.put(key, how + ":" + by);
				System.out.println(", By: " + by);
			}

	}

}
