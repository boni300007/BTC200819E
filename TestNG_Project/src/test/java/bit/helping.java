package bit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class helping {
	@Test(groups = {"Unit"})
	  public void test5() {
		System.out.println("Test5");
		
	}
	WebDriver dr;
	@Test
	 public void openBrowser() {
			System.out.println("Test5");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\alami\\Desktop\\BTC 200819E\\geckodriver.exe");
			dr = new FirefoxDriver();
		}

}
