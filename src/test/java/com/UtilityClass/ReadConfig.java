package com.UtilityClass;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	
	String path = System.getProperty("user.dir")+"\\Properties\\Configurations.properties";
	Properties prop;
	
	public ReadConfig() {
		prop = new Properties(); 
		try {
			FileInputStream file = new FileInputStream(path);
			prop.load(file);
			}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String browsername() {
		String browser = prop.getProperty("browser");
		return browser;
	}
	
	public String URL() {
		String url = prop.getProperty("url");
		return url;
	}
	
	public String username() {
		String name = prop.getProperty("username");
		return name;
	}
	
	public String password() {
		String pass = prop.getProperty("password");
		return pass;
	}
	
	public String proname() {
		String name = prop.getProperty("productName");
		return name;
	}
	
	public String category() {
		String cat = prop.getProperty("category");
		return cat;
	}
	
}
