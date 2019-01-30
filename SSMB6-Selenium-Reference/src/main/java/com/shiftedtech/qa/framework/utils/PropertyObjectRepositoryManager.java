package com.shiftedtech.qa.framework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyObjectRepositoryManager {
	
	private static PropertyObjectRepositoryManager instance = null;
	
	private Properties properties = new Properties();
	
	
	private PropertyObjectRepositoryManager() {
		loadRepository();
	}
	
	public static PropertyObjectRepositoryManager getInstance() {
		if(instance == null) {
			instance = new PropertyObjectRepositoryManager();
		}
		return instance;
	}
	
	public String get(String key) {
		String value = properties.getProperty(key);
		if(value == null || value.trim().length() == 0) {
			throw new RuntimeException("Could not read locator with the key: " + key);
		}
		return value;
	}
	
	private void loadRepository() {
		
		String fileName = System.getProperty("user.dir") + "/src/main/resources/SpreeObjectRepo.properties";
		
		InputStream input = null;
		try {
			input = new FileInputStream(fileName);
			properties.load(input);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		
	}
	

}
