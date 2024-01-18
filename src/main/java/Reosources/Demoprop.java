package Reosources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demoprop {
	public static void main(String[] args) throws FileNotFoundException,IOException {
//		FileReader r = new FileReader("db.properties");
		Properties prop = new Properties();

		InputStream is = new FileInputStream("db.properties");
		prop.load(is);

		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("email"));
		
		
		
		prop.setProperty("url", "Shubham");
		System.out.println(prop);
		
		
	}

}
