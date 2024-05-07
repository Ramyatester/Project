package systemTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base.AdvanageHomePageObjects;
import base.BaseClass1;

public class SearchItems extends BaseClass1 {
	
	
	
	

	@Test(priority=1)
	public void clickLens() {
		//driver.findElement(By.xpath("(//*[@id=\"menuSearch\"])[1]")).click();
		driver.findElement(By.xpath(AdvanageHomePageObjects.menuSearch_xpath)).click();
		
		
	}
	
	@Test(priority=2)
	public void checkSearchBoxIsPresent() {
		
		
			try{
			
		    Thread.sleep(5000);
 
			String searchBarText=driver.findElement(By.xpath("//*[@id=\"autoComplete\"]")).getText();
			System.out.println(searchBarText);

 boolean isSearchBarPresent=driver.findElement(By.xpath("//*[@id=\"autoComplete\"]")).isDisplayed();
 boolean isSearchBarPresent1=driver.findElement(By.xpath("//*[@id=\"autoComplete\"]")).isEnabled();
 

	
			} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			

		}
	}

	@Test(priority=3)
	public void enterSearchWord() {
		 driver.findElement(By.xpath("//*[@id=\"autoComplete\"]")).sendKeys("mouse"+ Keys.ENTER);
		
	}
	
	@Test(priority=4)
	public void checkSearchResults() {
		String itemSearch = "6 ITEMS";
		 String search = driver.findElement(By.xpath("//*[@class='titleItemsCount ng-binding']//parent::p")).getText();
			System.out.println(search);
			Assert.assertEquals(search, itemSearch);
	
}
	}
