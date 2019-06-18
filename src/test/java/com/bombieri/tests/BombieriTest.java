package com.bombieri.tests;

import org.testng.annotations.Test;

import com.bombieri.configs.DriverConfig;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class BombieriTest {
	
	WebDriver driver;
	DriverConfig dConfig = new DriverConfig();
	String url = dConfig.getUrl();

	@Test
	public void f() {
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("bombieri software");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div[1]/a")).click();
	}
  
	@BeforeTest
	public void beforeTest() {
		driver = dConfig.getDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
