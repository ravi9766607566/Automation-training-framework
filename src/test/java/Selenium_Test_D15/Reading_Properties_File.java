package Selenium_Test_D15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Reading_Properties_File {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");

		Properties prop= new Properties();
		prop.load(file);
		
		// Read data from properties
		
		String url= prop.getProperty("Website");
		String email= prop.getProperty("email");
		String username= prop.getProperty("username");
		String city= prop.getProperty("city");
		String country= prop.getProperty("country");
		
		System.out.println(url+" "+email+" "+username+" "+city+" "+country);
		
		// Read all keys
		Set<String> keys= prop.stringPropertyNames();
		System.out.println(keys);
		
		Set<Object> keys_o=prop.keySet();
		System.out.println(keys_o);
		
		// Read all values
		Collection<Object> values= prop.values();
		System.out.println(values);
		
	}

}
