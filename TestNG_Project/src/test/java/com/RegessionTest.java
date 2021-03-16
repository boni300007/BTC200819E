package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import bit.BD;

public class RegessionTest extends BeseTest {

	@Test(groups = {"Smoke"})
	  public void test2() {
		System.out.println("Test2");
		
	  }
	@Test
	  public void test3() {
		System.out.println("Test3");
		
	  }
	WebDriver dr;
	@Test(dataProviderClass = BD.class,dataProvider =  "login")
	public void test2(Object user, Object pass) {
		System.out.println(user);
		System.out.println(pass);
//	dr.findElement(By.xpath("")).sendKeys(user);
//	dr.findElement(By.xpath("")).sendKeys(pass);
	}
	
	
}
