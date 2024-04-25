package string;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Greet {

	@Test
	void  checkGreeting() throws IOException {
		
		try {
			
			Properties p = new Properties();
		 FileInputStream fis= new   FileInputStream("C://Users//Administrator//eclipse-workspace//ustJava//sample.properties");
		 p.load(fis);
		 String st = p.getProperty("expectedGreeting");
		 System.out.println(st);
		 LocalDateTime now = LocalDateTime.now();
		  
		  System.out.println("Beforeformat" + now);
		  DateTimeFormatter format = DateTimeFormatter.ofPattern("dd:MM:yyyy" );
		  String formatdatentime= now.format(format);
		  
		  System.out.println("Afterformat "+ formatdatentime);
		  String expectedGreeting = st;
		  int curtime = LocalTime.now().getHour();
		  String Greet = null;
		  
		 if (curtime<12)
			   Greet =" Goodmorning";
		  else if (curtime >12 && curtime <16)
		Greet = "Goodafternoon";  
		  else if (curtime >16 && curtime <20)
		 Greet = "Good eve";
		  else if (curtime >20 && curtime <22)
			  
			  Greet = "Good night";
		  
		  System.out.println( LocalTime.now().getHour() + "\t"+ Greet);
		 Assert.assertEquals(expectedGreeting, Greet);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
