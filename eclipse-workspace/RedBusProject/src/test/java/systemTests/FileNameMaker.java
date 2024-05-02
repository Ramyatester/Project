package systemTests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileNameMaker {
	
	public String fileNameForLogging(String U, String P) {
		
		String fileName;
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("BeforeFormatting " +now);
		
		DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH-mm");
		fileName  = "C:\\Users\\Administrator\\Desktop\\Automation\\" +U +"_" + P +"_" + now.format(Format)+" .jpg";
		 
		
		return fileName;
		
		
	}
	

}
