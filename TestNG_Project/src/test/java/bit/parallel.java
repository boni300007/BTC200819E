package bit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallel {
	@Test 
	  public void buyShirt() {
		System.out.println("buyShirt");
		
	}
	
	@Test 
	  public void buyJeans() {
		System.out.println("buyJeans");
		
	  }
	WebDriver dr;
	@Test
	  public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\alami\\Desktop\\BTC 200819E\\geckodriver.exe");
		dr = new FirefoxDriver();
		
	  }
}
