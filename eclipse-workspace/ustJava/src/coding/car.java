package coding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class car {
	private String colour;
	 private int height;
	 
	 public boolean start() {
			
			System.out.println("Started");
			
			return true;
		}

		public boolean stop() {
			System.out.println("Stopped");
			
			return true;
			
			
		}

		public String getColour() {
			
			return colour;
		}

		public String setColour() {
			
			return colour;
		}
	
}
