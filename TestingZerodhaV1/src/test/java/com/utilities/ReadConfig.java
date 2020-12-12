package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream input = new FileInputStream(src);
			pro = new Properties();
			pro.load(input);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
	}
	public String getUserName() {
		String userName = pro.getProperty("UserName");
		return userName;
	}
	public String getPassword() {
		String password = pro.getProperty("Password");
		return password;
	}
	public String getPin() {
		String pin = pro.getProperty("Pin");
		return pin;
	}
	public String gettitle() {
		String Title = pro.getProperty("title");
		return Title;
	}
	public String getfireFoxPath() {
		String fireFoxPath = pro.getProperty("fireFoxPath");
		return fireFoxPath;
	}
	public String getchromePath() {
		String ChromePath = pro.getProperty("chromePath");
		return ChromePath;
	}
	
	
}
