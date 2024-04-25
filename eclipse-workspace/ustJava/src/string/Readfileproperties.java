package string;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readfileproperties {
	
	public static void main(String args[]) throws IOException   {
		
		Properties p = new Properties();
	 FileInputStream fis= new   FileInputStream("C://Users//Administrator//eclipse-workspace//ustJava//sample.properties");
	 p.load(fis);
	 String st = p.getProperty("bgcolor");
	 System.out.println(st);
	 
	}
}
