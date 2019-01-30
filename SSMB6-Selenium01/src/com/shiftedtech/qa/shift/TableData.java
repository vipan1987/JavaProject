package com.shiftedtech.qa.shift;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.google.common.collect.Table;
import com.shiftedtech.qa.shift.framework.ScriptBase;
	
	public class TableData extends ScriptBase{
	@Override
	@Before
	
	public void setUp() {
		super.setUp();
		driver.navigate().to("http://shifttest.shiftedtech.com/components/table");
	}
	/*@Test
	public void test1() {
		
		int row= 2;
		int col =3;
		
		//String xpath ="//div[@id='html-table']/table/tbody/tr[3]/td[3]";
		
	//String xpath ="//div[@id='html-table']/table/tbody/tr["+row+"]/td["+col+"]";
		//delayFor(3000);
		String xpath = String.format("//div[@id='html-table']/table/tbody/tr[%d]/td[%d]",row,col);
		delayFor(10000);
		System.out.println(xpath);
		WebElement findtext= driver.findElement(By.xpath(xpath));
		String text=findtext.getText();
		delayFor(10000);
		System.out.println(text);
		}*/
	/*@Test
	public void test2(){
	String celltext= getcelltext(3,3 );	
		System.out.println(celltext);
		delayFor(10000);
	}*/
@Test
	public void test3() {
	WebElement table =driver.findElement(By.xpath("//div[@id='html-table']/table"));
	String print =getcelltextex(table, 3, 3);
	System.out.println(print);
	delayFor(10000);
	
	
	}
	public String getcelltextex(WebElement table,int row,int col) {
		String xpath = String.format("tbody/tr[%d]/td[%d]",row,col);
		WebElement findtext= table.findElement(By.xpath(xpath));
		String celltext= findtext.getText();
		return celltext;
		
	}
	
	/*public String getcelltext(int row,int col) {
		String xpath = String.format("//div[@id='html-table']/table/tbody/tr[%d]/td[%d]",row,col);
		WebElement findtext= driver.findElement(By.xpath(xpath));	
		String celltext= findtext.getText();
		return celltext;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
