package base;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\RedBus\\Driver\\chromedriver.exe");
		
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			
	}

//	
//       @AfterAll
//
//       
//       public void closeAllWindow() {
//    	   
//    	 driver.quit();  
//       }

}
