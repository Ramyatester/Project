package smokeTests;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class HomePageCheckTitleAndFooter extends BaseClass{
 WebDriver driver;
	@Test 
	public void checkTitle() {
		
     	driver.findElement(By.xpath("(//span[@class='name_rb_vertical'])[1]")).click();
		
	}

}
