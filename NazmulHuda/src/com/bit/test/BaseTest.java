package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	static WebDriver driver;

	@Before
	public void openDriver() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\alami\\Desktop\\BTC 200819E\\geckodriver.exe");
		
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();								
		
		
	}
	
	//@After
	//public void closeWindo() {
		
		//driver.quit();
	//}
}
