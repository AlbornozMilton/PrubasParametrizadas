package com.bombieri.tests;

import org.testng.annotations.Test;

import com.bombieri.configs.DriverConfig;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FacebookPageAccessTest {
	
	private DriverConfig dConfig = new DriverConfig();
	private WebDriver driver = dConfig.getDriver();
	
	/*@Test	
	public void f() throws InterruptedException {
		driver.get(dConfig.getUrl());
		//driver.findElement(By.name("q")).sendKeys("facebook");
		//driver.findElement(By.name("btnK")).click();
	}
  
	@BeforeTest
	public void beforeTest() {
		driver = dConfig.getDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
*/
}
