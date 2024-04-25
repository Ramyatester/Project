package coding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElectricCar1 extends car {
	
	
	public boolean autoSteer() {
		 
		 return true;
	 }
		
		public boolean start() {
			
			System.out.println("Started by pushing a button");
			
			return true;
		}
}