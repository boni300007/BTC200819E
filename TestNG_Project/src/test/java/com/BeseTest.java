package com;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeseTest {
	
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("bm");
  }

  @AfterMethod
  public void afterMethod(ITestResult r) {
	  System.out.println("am");
	  switch(r.getStatus()) {
	  case ITestResult.FAILURE:{
		  System.out.println(r.getName() + " Is FAILURE");
		  System.out.println("Take a sereenshot");
	  }case ITestResult.SUCCESS:{
		  System.out.println(r.getName() + " Is SUCCESS");
	  }case ITestResult.SKIP:{
		  System.out.println(r.getName() + " Is SKIP");
		  System.out.println("Take a sereenshot");
	  }
	  }
  }

  @BeforeClass 
  public void beforeClass() {
	  System.out.println("bc");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ac");
  }

  @BeforeTest(groups= {"Smoke"})
  public void beforeTest() {
	  System.out.println("bt");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("at");
  }

  @BeforeSuite(alwaysRun = true, description = "This will run always")
  public void beforeSuite() {
	  System.out.println("bs");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("as");
  }

}
