package com.shiftedtech.qa.shift;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.shiftedtech.qa.shift.framework.ScriptBase;
import com.shiftedtech.qa.shift.framework.WebTable;

//https://demos.telerik.com/aspnet-mvc/grid/editing-inline
	
	
public class WebTableTest extends ScriptBase{

	@Override
	@Before
	public void setUp() {
		super.setUp();
		driver.navigate().to(APP_URL + "/table");
	}
	@Test
	public void test1() {
		int row = 2;
		int col = 3;
		//String xPath = "//div[@id='html-table']/table/tbody/tr[2]/td[3]";
		String xPath = "//div[@id='html-table']/table/tbody/tr[row]/td[col]";
		//String xPath = "//div[@id='html-table']/table/tbody/tr[" + row + "]/td[" + col + "]";
		//String xPath = String.format("//div[@id='html-table']/table/tbody/tr[%d]/td[%d]", 3,2);
		//String xPath = String.format("//div[@id='html-table']/table/tbody/tr[%d]/td[%d]", row,col);
		
		//https://dzone.com/articles/java-string-format-examples
			
		System.out.println("XPath: " + xPath);
		WebElement cell = driver.findElement(By.xpath(xPath));
		String cellText = cell.getText();
		System.out.println(cellText);
	}
	
	@Test
	public void test2() {
		String cellText = getCellText(3,3);
		System.out.println(cellText);
	}
	
	@Test
	public void test3() {
		WebElement table = driver.findElement(By.xpath("//div[@id='html-table']/table"));
		String cellText = getCellTextEx(table,3,3);
		System.out.println(cellText);
	}
	@Test
	public void test4() {
		String cellText = getCellTextEx("//div[@id='html-table']/table",3,3);
		System.out.println(cellText);
	}

	@Test
	public void test5() {
		
		String cellText = getCellTextEx(By.cssSelector("#html-table table"),3,3);
		System.out.println(cellText);
		
		cellText = getCellTextEx(By.xpath("//div[@id='html-table']/table"),3,3);
		System.out.println(cellText);
	}
	
	@Test
	public void test6() {
		
		String cellText = getCellTextEx2(By.cssSelector("#html-table table"),3,3);
		System.out.println(cellText);
		
	}
	@Test
	public void test7() {
		
		String cellText = getCellTextEx3(By.cssSelector("#html-table table"),3,3);
		System.out.println(cellText);
		
	}
	@Test
	public void test8() {
		
		String cellText = getCellTextEx3(By.cssSelector("#html-table table"),1,1);
		System.out.println(cellText);
		cellText = getCellTextEx3(By.cssSelector("#html-table table"),1,2);
		System.out.println(cellText);
		cellText = getCellTextEx3(By.cssSelector("#html-table table"),1,3);
		System.out.println(cellText);
		cellText = getCellTextEx3(By.cssSelector("#html-table table"),2,1);
		System.out.println(cellText);
		
	}
	
	@Test
	public void test9() {
		
		String[][] tableData = getTableData(By.cssSelector("#html-table table"));
		System.out.println(tableData[0][0]);
		System.out.println(tableData[0][1]);
		System.out.println(tableData[0][2]);
		System.out.println(tableData[1][0]);
		System.out.println(tableData[1][1]);
		System.out.println(tableData[1][2]);
		System.out.println(tableData[2][0]);
		System.out.println(tableData[2][1]);
		System.out.println(tableData[2][2]);
		
		
	}
	
	@Test
	public void test10() {
		WebElement element = driver.findElement(By.xpath("//div[@id='html-table']/table"));
		
		WebTable table = new WebTable(element);
		
		System.out.println(table.row(0).column(0).cell().getText());
		System.out.println(table.row(0).column(1).cell().getText());
		System.out.println(table.row(0).column(2).cell().getText());
		
		
	}

	public String getCellText(int row, int col) {
		String xPath = String.format("//div[@id='html-table']/table/tbody/tr[%d]/td[%d]", row,col);
		WebElement cell = driver.findElement(By.xpath(xPath));
		String cellText = cell.getText();
		return cellText;
	}
	
	public String getCellTextEx(WebElement table , int row, int col) {
		String xPath = String.format("tbody/tr[%d]/td[%d]", row,col);
		WebElement cell = table.findElement(By.xpath(xPath));
		String cellText = cell.getText();
		return cellText;
	}
	public String getCellTextEx(By by , int row, int col) {
		WebElement table = driver.findElement(by);
		String xPath = String.format("tbody/tr[%d]/td[%d]", row,col);
		WebElement cell = table.findElement(By.xpath(xPath));
		String cellText = cell.getText();
		return cellText;
	}
	public String getCellTextEx(String tableXPath , int row, int col) {
		WebElement table = driver.findElement(By.xpath(tableXPath));
		String xPath = String.format("tbody/tr[%d]/td[%d]", row,col);
		WebElement cell = table.findElement(By.xpath(xPath));
		String cellText = cell.getText();
		return cellText;
	}
	
	public String getCellTextEx2(By by , int row, int col) {
		WebElement table = driver.findElement(by);
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
		WebElement cell = cols.get(col-1);
		String cellText = cell.getText();
		return cellText;
	}
	public String getCellTextEx3(By by , int row, int col) {
		WebElement table = driver.findElement(by);
		WebElement body = table.findElement(By.tagName("tBody"));
		List<WebElement> rows = body.findElements(By.tagName("tr"));
		List<WebElement> cols = rows.get(row - 1).findElements(By.tagName("td"));
		WebElement cell = cols.get(col-1);
		String cellText = cell.getText();
		return cellText;
	}
	
	public String[][] getTableData(By by) {
		String[][] tableData = null;
		
		WebElement table = driver.findElement(by);
		WebElement body = table.findElement(By.tagName("tBody"));
		List<WebElement> rows = body.findElements(By.tagName("tr"));
		tableData = new String[rows.size()][];
		for(int i = 0; i < rows.size() ; i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			tableData[i] = new String[cols.size()];
			for(int j = 0; j < cols.size(); j++) {
				WebElement cell = cols.get(j);
				String text = cell.getText();
				tableData[i][j] = text;
			}
		}
		return tableData;	
	}
	public String[][] getTableData2(By by) {
		String[][] tableData = null;
		
		WebElement table = driver.findElement(by);
	
		WebElement body = table.findElement(By.tagName("tBody"));
		List<WebElement> rows = body.findElements(By.tagName("tr"));
		List<WebElement> cols = rows.get(0).findElements(By.tagName("td"));
		
		tableData = new String[rows.size()][];
		for(int i = 0; i < rows.size() ; i++) {
			tableData[i] = new String[cols.size()];
			for(int j = 0; j < cols.size(); j++) {
				String xPath = String.format("tbody/tr[%d]/td[%d]", i,j);
				WebElement cell = table.findElement(By.xpath(xPath));
				String text = cell.getText();
				tableData[i][j] = text;
			}
		}
		return tableData;	
	}
}
