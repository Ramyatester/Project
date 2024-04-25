package javacons;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	
	
	public static void main (String args[])throws IOException {
		
		
		try {
			FileWriter myFile = new FileWriter("C:\\Users\\Administrator\\Desktop\\createfile.txt");
			myFile.write("Ramya"+"\n\r");
			myFile.append("Adding a new line ");
			
		myFile.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
