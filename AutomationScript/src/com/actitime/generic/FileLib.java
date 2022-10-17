package com.actitime.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	
	public static String getPropertyValue(String key) throws Throwable {
		FileInputStream fils =new FileInputStream("./Data/Actitime_Login.property");
		Properties pro=new Properties();
		pro.load(fils);
		String value = pro.getProperty(key);
		return value;
	}
}
