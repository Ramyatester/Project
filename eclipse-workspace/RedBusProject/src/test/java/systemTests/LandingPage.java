package systemTests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LandingPage {
	
	static WebDriver driver;
	
	boolean res;
	
	public LandingPage (WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	By flashsuccess = By.xpath("//*[@class=\"flash success\"]");
	
 @Test
public boolean isLoginSuccess() {
	  
	  try {
		driver.findElement(flashsuccess);
		res =true;
	} catch (NoSuchElementException n) {
		// TODO Auto-generated catch block
		res =false;
	
	}
	return res;
	
	  }
  }
  
