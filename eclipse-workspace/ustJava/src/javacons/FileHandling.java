package javacons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
	
	
	public static void main (String args[]) throws FileNotFoundException {
		try {
		
		File myfile = new File("C:\\Users\\Administrator\\Desktop\\filehandling.txt");
		
		System.out.println(myfile.exists());
		
		Scanner myScanner = new Scanner(myfile);
		
		while (myScanner.hasNextLine()) {
			
			String line= myScanner .nextLine();
			

	 System.out.println(line);
     String str = line;
    String[] arr= str.split("@");
   
  for(String a:arr) {
	  
    		//System.out.println("Username :"+line.split("@"));
	  System.out.println("Username :"+a );
	 
	  if (a.matches("@"))
		  break;
	  System.out.println("Password :"+a);
     }

		}
		}
		catch(FileNotFoundException f)
		{
			System.out.println("File not found");
		}		
		
	finally {
		

		}
		
	}

}
