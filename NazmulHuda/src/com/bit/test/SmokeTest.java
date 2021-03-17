package com.bit.test;

import org.junit.Test;

import com.cit.testStep.Core;

public class SmokeTest extends BaseTest {
	
	
	@Test
	public void testing () {
		
		//BaseTest b = new BaseTest();
		//b.openDriver("https://www.google.com/");
		
		
		driver.get("https://www.express.com/");
		
		Core C = new Core (driver);
		//C.GoogleTexting();
		//C.ClicOnGooglSearchBox();
		C.ExpressLogoVerify();
		C.ForLoopTest();
		
	}

}
