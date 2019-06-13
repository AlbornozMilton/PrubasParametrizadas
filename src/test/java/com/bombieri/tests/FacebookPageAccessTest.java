package com.bombieri.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FacebookPageAccessTest {
	
	private WebDriver driver;
	
	@Test	
	public void f() {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("facebook");
	}
  
	@BeforeTest
	public void beforeTest() {
		System.getProperties().setProperty("webdriver.chrome.driver", "C:\\Users\\Bombieri5\\Downloads\\Instaladores\\chromedriver_win32_75\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
