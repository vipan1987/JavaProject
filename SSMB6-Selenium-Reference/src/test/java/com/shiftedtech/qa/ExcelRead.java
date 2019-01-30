package com.shiftedtech.qa;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelRead {

	public static void main(String[] args) {
	
		String EXCEL_FILE_LOCATION = System.getProperty("user.dir") + "/src/main/resources/SpreeOR.xls";
		try {
			Workbook workbook = null;
			workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));
			
			Sheet sheet = workbook.getSheet(0);
			
			Cell cell1 = sheet.getCell(0, 1);
			
			String content = cell1.getContents();
			
			System.out.println("Cell 1,1: " + content);
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
