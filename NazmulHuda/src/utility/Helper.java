package utility;

import org.openqa.selenium.WebElement;

public class Helper {
	
	
	public static void click (WebElement element) {
		
		element.click();
		
	}
	
	public static void sendKey (WebElement element, String Text) {
		
		element.sendKeys(Text);
	}

}
