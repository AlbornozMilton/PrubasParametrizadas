package com.bombieri.configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConfig {
	String url = System.getProperty("urlValue");
	String browser = System.getProperty("browserValue");
	
	public DriverConfig() {
		
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public WebDriver getDriver() {
		WebDriver driver = null;
		if (this.browser.equals("chrome")) {
			System.getProperties().setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (this.browser.equals("firefox")) {
			System.getProperties().setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
