package com.bit.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class SeleniumMethodPractice {

	WebDriver dr;
	Actions a;
//	@Test
	public void openBrowser() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\alami\\Desktop\\BTC 200819E\\geckodriver.exe");
		dr = new FirefoxDriver();
	
		
		dr.manage().window().maximize();
		
	
		//multipleWindowHandle();
		//frameHandle();
		//DragAndDrop();
		screenshot();
		
		dr.close();
	}
	
	public void multipleWindowHandle() {
		dr.get("https://www.ae.com/us/en");
		dr.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/p[2]/button[2]")).click();
		String pwin = dr.getWindowHandle(); 		// this will handle first window
		a = new Actions(dr);						// Action class need for click on muse
		a.contextClick(dr.findElement(By.xpath("//*[@id=\"top-navigation\"]/div/div/div[3]/div[1]/a"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
													// using action class we can open new window
		Set<String> cwin = dr.getWindowHandles();   // after open a new window the getWindowHandle can not handles multiple window so getWindowHandles need
		for (String win : cwin) { 					// using getWindowHandles we can handle new or others window
			if(!win.equals(pwin)) {
				dr.switchTo().window(win);
			}
		}
	}

	public void frameHandle() {
		dr.get("https://www.dyn-web.com/tutorials/iframes/basics/demo.php");
		dr.switchTo().frame("ifrm");
		String text = dr.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println(text);	
	}
	
	public void DragAndDrop() {
		dr.get("https://jqueryui.com/droppable/#content");
		dr.switchTo().frame(dr.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/iframe")));
		//System.out.println(dr.findElement(By.xpath("//*[@id=\"draggable\"]/p")).getText());
		WebElement x = dr.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement y = dr.findElement(By.xpath("//*[@id=\"droppable\"]"));
		a.dragAndDrop(x, y).perform();
		
		}
	@Test
	public void screenshot() throws IOException {
		
		dr.get("https://jqueryui.com/droppable/#content");
		int r =(int) Math.random();
		File f =((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\Result/shot"+r+".jpg"));
	}







}
	

	
	
	
	
	

