package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@BeforeTest
	private void beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "Drive:/Users/swethabolloju/Desktop/chromedriver_mac64_m1/chromedriver");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	private void open()
	{
		driver.get("http://www.amazon.com");
	}
	
 @Test
  public void test()
  {
	  driver.findElement(By.id("twoabsearchtextbox")).sendKeys("LG TV");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  
  }
  @AfterMethod
  private void close()
  {
	  System.out.println("Application Tested..");
  }
}
