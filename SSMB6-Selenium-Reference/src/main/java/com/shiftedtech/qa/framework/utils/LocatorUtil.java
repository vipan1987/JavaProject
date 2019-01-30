package com.shiftedtech.qa.framework.utils;

import org.openqa.selenium.By;

public class LocatorUtil {

public By getLocator(String key) {
		
		By by = null;

		//PropertyObjectRepositoryManager xxx = new PropertyObjectRepositoryManager();
		PropertyObjectRepositoryManager or = PropertyObjectRepositoryManager.getInstance();
		
		String locator = or.get(key);
		
		String[] locatorParts = locator.split(":=");
		if(locatorParts != null && locatorParts.length == 2) {
			String how = locatorParts[0];
			String using = locatorParts[1];
	
			if(how.equalsIgnoreCase("id")) {
				by = By.id(using);
			}
			else if(how.equalsIgnoreCase("linkText")) {
				by = By.linkText(using);
			}
			else if(how.equalsIgnoreCase("xpath")) {
				by = By.xpath(using);
			}
			else if(how.equalsIgnoreCase("cssSelector")) {
				by = By.cssSelector(using);
			}
			else if(how.equalsIgnoreCase("name")) {
				by = By.name(using);
			}
			else if(how.equalsIgnoreCase("partialLinkText")) {
				by = By.partialLinkText(using);
			}
			else if(how.equalsIgnoreCase("className")) {
				by = By.className(using);
			}
			else if(how.equalsIgnoreCase("tagName")) {
				by = By.tagName(using);
			}
		}
		
		return by;
	}
}
