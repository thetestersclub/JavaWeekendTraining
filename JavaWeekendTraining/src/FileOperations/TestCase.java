package FileOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestCase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("rollNo"));
		//System.out.println(System.getProperty("user.dir"));
		
		
		

	}

}
