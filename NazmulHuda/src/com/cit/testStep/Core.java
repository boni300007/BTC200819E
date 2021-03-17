package com.cit.testStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import repository.objectRepository;
import utility.Helper;

public class Core {
	
	WebDriver driver;
	public Core (WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void GoogleTexting() {
		
		Helper.sendKey(driver.findElement(objectRepository.googlBox), objectRepository.Yahoo);
		
	}
	
	public void ClicOnGooglSearchBox () {
		
		Helper.click(driver.findElement(objectRepository.googleSearchBox));
	}
	public void ExpressLogoVerify() {
		
		boolean result = driver.findElement(objectRepository.ExpressLogo).isDisplayed();
		System.out.println("Express Logo Is Displayed = "+result);
	}
	
	
	public void ForLoopTest() {
		
		int iSize = driver.findElements(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li")).size();
		for (int i = 0; i < iSize; i++) {
			
			driver.findElement(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li[+i+]")).click();
			driver.navigate().back();
			
		}
	}
	
	

}
