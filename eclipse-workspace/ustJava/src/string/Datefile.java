package string;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datefile {
	
	public static void main(String args[]) {
	
  LocalDateTime now = LocalDateTime.now();
  
  System.out.println("Beforeformat" + now);
  DateTimeFormatter format = DateTimeFormatter.ofPattern("dd:MM:yyyy" );
  String formatdatentime= now.format(format);
  
  System.out.println("Afterformat "+ formatdatentime);
  
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
   }
	 
	  
	
}
