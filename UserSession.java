package systemTests;
import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BaseClass;

public class UserSession extends BaseClass {
  @Test
  public void testusersession() {
	  
	  String cururl = null;
		String actualurl = "https://automationteststore.com/index.php?rt=account/login";
		driver.findElement(By.xpath("//a[normalize-space()='Login or register']")).click();
		driver.findElement(By.xpath("//input[@id='loginFrm_loginname']")).sendKeys("Testerauto");

		driver.findElement(By.xpath("//input[@id='loginFrm_password']")).sendKeys("Google@123");

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().back();
		driver.navigate().forward();
		cururl=driver.getCurrentUrl();
			 
		assertEquals(cururl,actualurl ); 
  }
}
