package com.oop;

public abstract class Car {

	public abstract void move();
	
	Car() {
		System.out.println("300");
	}
	Car(int a) {
		this();
		System.out.println("300");
	}
}
