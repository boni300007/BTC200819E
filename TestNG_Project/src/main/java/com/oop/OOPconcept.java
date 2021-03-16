package com.oop;

public class OOPconcept {

	private int b = 20; // this call data hidden 
	
	private void test1() {
		int a = 9;
		System.out.println("hi");
		//  when we rape some of data or code inside a private method those code or 
		// data others class can not get access this method this process call enclasplasion. 
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
