package bit;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UnitTest {
	@Test(groups = {"Unit"})
	  public void test5() {
		System.out.println("Test5");
		
	  }
	@Test
	public void softAssert(){
		SoftAssert softAssertion= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
	}
	
	@Test
	public void hardAssert(){
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
	}
	
	WebDriver driver;
	 public static void main(String[] args) {
	        //set the location of chrome browser
	        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        
	        // Initialize browser
	        WebDriver driver = new FirefoxDriver();
	        
	        //navigate to url
	        driver.get("https://demoqa.com");
	        
	       //Take the screenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        //Copy the file to a location and use try catch block to handle exception
	        
	        screenshot = new File("C:\\Users\\alami\\Desktop\\BTC 200819E.png");
	       
	        }

}
