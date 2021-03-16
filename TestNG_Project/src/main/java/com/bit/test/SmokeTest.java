package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SmokeTest {

	
	@Test
	public void test1 () throws MalformedURLException {
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		WebDriver driver = new RemoteWebDriver(new URL(""), cap);
		driver.get("");
	}
	
	
}
