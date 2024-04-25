package coding;

import org.junit.Test;

public class ElectricCar extends car{
	
	@Test
 public boolean autoSteer() {
	 
	 return true;
 }
	@Test
	public boolean start() {
		
		System.out.println("Started by pushing a button");
		
		return true;
	}
}
