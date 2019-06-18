package com.bombieri.tests;

import org.testng.annotations.Test;

import com.bombieri.configs.DriverConfig;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class BombieriTest {
	
	WebDriver driver;
	DriverConfig dConfig = new DriverConfig();
	String url = dConfig.getUrl();

	@Test
	public void f() {
		driver.get(url);
		  driver.findElement(By.name("q")).sendKeys("bombieri software");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div[1]/a")).click();
		  driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
		  driver.findElement(By.xpath("//a[contains(@href,'https://www.bombieri.com.ar/b/consulting')]")).click();
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
