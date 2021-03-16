package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestGrid {

	static WebDriver driver;
	static String noteUrl;
	@Test
	public void test() {
		try {
			noteUrl = "http://192.168.1.229:21071/wd/hub";


DesiredCapabilities dis = DesiredCapabilities.firefox();
dis.setBrowserName("firefox");
dis.setPlatform(Platform.WIN10);
driver = new RemoteWebDriver(new URL(noteUrl), dis);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.get("https://www.amazon.com/");
driver.findElement(By.linkText("Today's Deals")).click();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	
	}
}
