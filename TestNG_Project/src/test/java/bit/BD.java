package bit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class BD {
	
	
	@DataProvider(name = "login")
	public Object [] [] getData(){
		
		Object [] [] o = new Object[4] [2]; // [4] 4 user [2] action id and password
		o[0] [0] = "user1";
		o[0] [1] = "pass1";
		o[1] [0] = "user3";
		o[1] [1] = "pass2";
		return o;
	} 
} 
