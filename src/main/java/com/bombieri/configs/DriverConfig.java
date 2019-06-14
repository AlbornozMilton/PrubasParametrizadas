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
			System.getProperties().setProperty("webdriver.chrome.driver", "C:\\Users\\Bombieri5\\Downloads\\Instaladores\\chromedriver_win32_75\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (this.browser.equals("firefox")) {
			System.getProperties().setProperty("geckodriver.firefox.driver", "C:\\Users\\Bombieri5\\Downloads\\Instaladores\\firefoxdriver-win32_55\\geckodriver.exe" );
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
