package com.bit.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;

import com.google.common.io.Files;

public class SeleniumMethod {
	
	// how to reveres a String 
			// COnvart as a charArray
			// Set up a loop to iterate through from last index
			// store into a strtingBuffer reference
			// Then print the stringBuffer
			
			// how to find a duplicated number 
					// COnvart as a charArray
					// Set up a loop to iterate for which character i want to compare
					// Set up a loop to iterate for with which character i want to compare
					// set up a condiation with both to check whether duplicate or not
			
					// When we set a condition if is duplicate then i will keep counting how many char ocher then i will compare current 
			
			
			WebDriver dr;
			Actions a;

	public void multipleWindowHandle() {
		
		String pwin = dr.getWindowHandle();
		a = new Actions(dr);
		a.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Set<String> cwin = dr.getWindowHandles();
		for(String win:cwin) {
			if(!win.equals(pwin))
			dr.switchTo().window(win);
		}
		
	}
	public void multipleFrame(String value) {
		dr.switchTo().frame(0);
		a.dragAndDropBy(null, 100, 200).build().perform();
		
		List<WebElement> elements =  dr.findElements(By.tagName("ifram"));
		for(WebElement ele:elements) {
			if(ele.getAttribute("class").equals(value)){
				dr.switchTo().frame(value);
			}
			
		}
	}
	
	
	public void screenshot() throws IOException {
		
		int r =(int) Math.random();
//		Date d = new Date(date);
//		SimpleDateFormat s = new SimpleDateFormat("mm/dd");
		File f =((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\Result/shot"+r+".jpg"));
		
	}
	
	
	public void scrolldown(WebElement ele) {
		Coordinates c = ((Locatable)ele).getCoordinates();
		c.inViewPort();
		
		JavascriptExecutor j = (JavascriptExecutor)dr;
		j.executeScript("windo.scrollBy(0,1000)");
		j.executeScript("arguments[0].click()", ele);
		j.executeScript("doccument.getElementById('value')");
		
	
	}
	
	public void cookiehandle(String value) {
		
		Set <Cookie> cookies = dr.manage().getCookies();
		for(Cookie cookie:cookies) {
			
			if (cookie.getValue().equals(value)) {
				System.out.println("matched");
		} else {
			System.out.println("Not Matched");
		}
			
		
	}
	
		String arr[] = null;
		int i = 0;
		for (Cookie cookie:cookies) {
			String name = cookie.getName();
			arr[i] = name;
		}
	
	}
	
	
	public void alartHandle() {
		
		Alert a = dr.switchTo().alert();
		a.accept();
		a.dismiss();
		a.getText();
		a.sendKeys("Text");
		
	}
	
	
	
	
}

