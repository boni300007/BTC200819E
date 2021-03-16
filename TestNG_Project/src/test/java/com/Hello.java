package com;

import org.testng.annotations.Test;

public class Hello extends BeseTest {
	@Test (groups= {"Unit"})
	  public void login() {
		System.out.println("login");
		
	  }
}
