package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SmokeTest extends BeseTest {
	
	@Test (groups= {"Smoke"})
	  public void buyShirt() {
		System.out.println("buyShirt");
		
	}
	
	@Test (groups= {"Unit"})
	  public void buyJeans() {
		System.out.println("buyJeans");
		
	  }
	@Test
	  public void logIn() {
		System.out.println("logIn");
		
	  }
	@Test
	  public void logOut() {
		System.out.println("logOut");
		
	  }
	
	WebDriver dr;
	@Parameters({"browser", "url"})
	@Test
	  public void openBrowser(String b, String u) {
		if (b.equals("fireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\alami\\Desktop\\BTC 200819E\\geckodriver.exe");
			dr = new FirefoxDriver();
			System.out.println("Ask Vai");
		}
		if (u.equals("google")) {
			dr.get("https://www.google.com/");
		}
		
	}
	
	



}
