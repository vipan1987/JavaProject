package com.shiftedtech.qa.shift.framework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.google.common.base.FinalizablePhantomReference;

public class WebTable {
	private List<Row> headerRows = new ArrayList<>();
	private List<Row> rows = new ArrayList<>();;
	
	public WebTable(WebElement table) {
		WebElement head = table.findElement(By.tagName("thead"));
		List<WebElement> thElements = head.findElements(By.tagName("tr")); 
		for(WebElement element : thElements) {
			headerRows.add(new Row(element,true));
		}
		
		WebElement body = table.findElement(By.tagName("tBody"));
		List<WebElement> trElements = body.findElements(By.tagName("tr")); 
		for(WebElement element : trElements) {
			rows.add(new Row(element));
		}
		
	}
	
	public int rowCount() {
		return rows.size();
	}
	public int headerRowCount() {
		return headerRows.size();
	}

	public Row row(int row) {
		return rows.get(row);
	}
	public Row headerRow(int row) {
		return headerRows.get(row);
	}
	
	public static class Row{
		private List<Column> columns = new ArrayList<>();
		
		public Row(WebElement row) {
			this(row, false);
		}
		public Row(WebElement row,Boolean isHeader) {
			List<WebElement> elements = null;
			if(isHeader) {
				elements = row.findElements(By.tagName("th"));
			}
			else {
				elements = row.findElements(By.tagName("td"));
			}
			for(WebElement element : elements) {
				columns.add(new Column(element));
			}
		}
		
		public int getColumnCount() {
			return columns.size();
		}
		
		
		public Column column(int col) {
			return columns.get(col);
		}
		
		public static class Column{
			private Cell cell = null;
			
			public Column(WebElement column) {
				this.cell = new Cell(column);
			}
			
			public Cell cell() {
				return cell;
			}
			
/*			public List<WebElement> findElements(By tagName){
				List<WebElement> elements = column.findElements(tagName);
				return elements;
			}
			
			public WebElement findElement(By tagName){
				List<WebElement> elements = column.findElements(tagName);
				return elements.get(0);
			}
			public WebElement findElement(By tagName,int index){
				List<WebElement> elements = column.findElements(tagName);
				return elements.get(index);
			}*/
		
		}
		
		public static class Cell implements WebElement{
			
			private final WebElement element;
			
			public Cell(final WebElement element) {
				this.element = element;
			}

			@Override
			public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
				return element.getScreenshotAs(arg0);
			}

			@Override
			public void clear() {
				element.clear();
				
			}

			@Override
			public void click() {
				element.click();
			}

			@Override
			public Cell findElement(By arg0) {
				return new Cell(element.findElement(arg0));
			}

			@Override
			public List<WebElement> findElements(By arg0) {
				
				/*List<WebElement> temp = element.findElements(arg0);
				List<WebElement> cells = new ArrayList<>();
				for(WebElement item : temp) {
					cells.add(new Cell(item));
				}
				return cells;*/
				return element.findElements(arg0);
			}

			@Override
			public String getAttribute(String arg0) {
				return element.getAttribute(arg0);
			}

			@Override
			public String getCssValue(String arg0) {
				return element.getCssValue(arg0);
			}

			@Override
			public Point getLocation() {
				return element.getLocation();
			}

			@Override
			public Rectangle getRect() {
				return element.getRect();
			}

			@Override
			public Dimension getSize() {
				return element.getSize();
			}

			@Override
			public String getTagName() {
				return element.getTagName();
			}

			@Override
			public String getText() {
				return element.getText();
			}

			@Override
			public boolean isDisplayed() {
				return element.isDisplayed();
			}

			@Override
			public boolean isEnabled() {
				return element.isEnabled();
			}

			@Override
			public boolean isSelected() {
				return element.isSelected();
			}

			@Override
			public void sendKeys(CharSequence... arg0) {
				element.sendKeys(arg0);
			}
			
			public void sendKeysDelayed(String text) {
				char[] textArray = text.toCharArray();
				for(char c : textArray) {
					element.sendKeys(String.valueOf(c));
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			public void sendKeysDelayed(String text,int timeToDelay) {
				char[] textArray = text.toCharArray();
				for(char c : textArray) {
					element.sendKeys(String.valueOf(c));
					try {
						Thread.sleep(timeToDelay);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			@Override
			public void submit() {
				element.submit();
			}
		
			public WebElement findElement(By tagName,int index){
				List<WebElement> elements = element.findElements(tagName);
				return elements.get(index);
			}
			
		}
		
	}
	
	
	
}
