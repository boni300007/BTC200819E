package com.oop;

import org.testng.annotations.Test;

public class testing {
	@Test
	public void test() {
		// polemafiziom is a process to give the object a different face.
		// for example webDriver driver = new fireFod driver
		Car [] c = new Car[2];
		c[0] = new Honda();
		
		//c[0].test2();
		c[1] = new Tesla();
		for(int i = 0; i<c.length; i++) {
			c[i].move();
		}
	}

}
