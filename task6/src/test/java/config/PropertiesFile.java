package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static Properties property = new Properties();

	public static void getProperties() {
		try {
	
			InputStream input = new FileInputStream("C:\\Users\\aasiya.riaz\\eclipse-workspace\\task6\\src\\test\\java\\config\\config.properties");
			property.load(input);
			String url = property.getProperty("email");
			System.out.println(url);
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}}
	
	

	public static void main(String[] args)
	{
		
			getProperties();
	
	}
	
}
