package com.shiftedtech.qa.shift;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.shiftedtech.qa.shift.framework.ScriptBase;
import com.shiftedtech.qa.shift.framework.WebTable;

public class WebTableTest2 extends ScriptBase{

	@Override
	@Before
	public void setUp() {
		super.setUp();
		driver.navigate().to("https://datatables.net/extensions/fixedheader/examples/options/columnFiltering.html");
	}
	@Test
	public void test1() {
		WebElement table = driver.findElement(By.id("example"));
		WebElement searchByNameTextbox = table.findElement(By.xpath("thead/tr[2]/th[1]/input"));
		String textToType = "Airi";
		char[] textArray = textToType.toCharArray();
		for(char c : textArray) {
			searchByNameTextbox.sendKeys(String.valueOf(c));
			delayFor(500);
		}
	}
	
	@Test
	public void test2() {
		WebElement table = driver.findElement(By.id("example"));
		WebElement tr = table.findElement(By.xpath("thead/tr[2]"));
		WebElement th = tr.findElement(By.xpath("th[1]"));
		WebElement imput = th.findElement(By.tagName("input"));
		String textToType = "Airi";
		char[] textArray = textToType.toCharArray();
		for(char c : textArray) {
			imput.sendKeys(String.valueOf(c));
			delayFor(500);
		}
	}
	
	@Test
	public void test3() {
		WebElement table = driver.findElement(By.id("example/thead/tr[2]/td[1]"));
		getColumnFilterTextbox(table,2).sendKeys("Airi");
	}
	
	@Test
	public void test4() {
		
		WebElement table = driver.findElement(By.id("example"));
		
		WebTable webTable = new WebTable(table);
		webTable.headerRow(1)
				.column(0)
				.cell()
				.findElements(By.tagName("input"))
				.get(0).sendKeys("Air");
		
	}
	
	@Test
	public void test5() {
		
		WebElement table = driver.findElement(By.id("example"));
		
		WebTable webTable = new WebTable(table);
		
		webTable.headerRow(1)
		        .column(0)
		        .cell()
		        .findElement(By.tagName("input"),0)
		        .sendKeys("Air");
		
	}
	
	@Test
	public void test6() {
		
		WebElement table = driver.findElement(By.id("example"));
		
		WebTable webTable = new WebTable(table);
		
		webTable.headerRow(1)
		        .column(0)
		        .cell()
		        .findElement(By.tagName("input"))
		        .sendKeysDelayed("Airi",1000);	
		
		String text = webTable.row(0)
							.column(0)
							.cell()
							.getText();
		
		System.out.println(text);
	}
	
	public WebElement getColumnFilterTextbox(WebElement table, int colNumber) {
	
		WebElement tr = table.findElement(By.xpath("thead/tr[" + colNumber + "]"));
		WebElement th = tr.findElement(By.xpath("th[1]"));
		//WebElement imput = tr.findElement(By.xpath("input"));
		WebElement imput = th.findElement(By.tagName("input"));
		
		return imput;
	}

	public List<WebElement> tableCellWebElements(WebElement cell,String tagName){
		List<WebElement> elements = cell.findElements(By.tagName(tagName));
		return elements;
	}
	
}
