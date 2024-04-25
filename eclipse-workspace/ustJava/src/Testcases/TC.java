package Testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import coding.Calculator;
import junit.framework.Assert;

class TC {

	@Test
	public void test() {
	Calculator my  = new Calculator();
	
	my.getData(10,30);
	Assert.assertEquals(10,10);
	}

}
