package Testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class TestHonda {
	public static Car honda;
	
	@BeforeClass
	
	public static void doFirst() {
		honda = new Car();
		//honda.getColour();
		System.out.println("Executing first");

	    
		
		
	}//@Test
// public void testStart() {
//	
//		
//		boolean started = honda.start();
//		Assert.assertEquals(true, started);
//		//
//	}
//	@Test
//	
//	public void testColourofhondacar() {
//		
//		boolean result;
//		System.out.println(honda.getColour());
//		result = (honda.getColour()=="Grey")? (result=true):(result=false);
//		Assert.assertEquals(true,result );
//	}
//	
	
	

}
