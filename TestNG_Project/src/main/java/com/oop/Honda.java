package com.oop;

public class Honda extends Car {

	
	Honda() {
		super();
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
		System.out.println("300");
	}
	
	public void test2() {
		Day d = Day.MONDAY;
		Day [] days = Day.values();
		for (Day day:days) {
			System.out.println(day);
		}
	}

}
