package com.configuration.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws IOException {

		File filepath = new File(
				"C:\\Users\\kesavaraj\\eclipse-workspace\\AutomationCucumber\\src\\test\\java\\com\\configuration\\properties\\Configuration.properties");
		FileInputStream fileInputStream = new FileInputStream(filepath);
		p = new Properties();
		p.load(fileInputStream);

	}

	public String getBrowser() {
		String bfp = p.getProperty("browserOpen");
		return bfp;
          
	}

	public String getUrl() {
		String afp = p.getProperty("applicationOpen");
        return afp;
	}

}
