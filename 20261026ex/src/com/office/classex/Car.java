package com.office.classex;

/*'차'라는 객체를 생성하는 틀*/
public class Car {
	
	/*속성*/
	String color = "Black";
	double size = 5.2;
	int displacement = 2000;
	
	
	/*생성자*/
	public Car() {
		System.out.println("CAR CONSTRUCTOR CALLED");
	}
	
	
	/*기능*/
	public void drive() {
		System.out.println("drive() CALLED");
	}
	
	public void stop() {
		System.out.println("stop() CALLED");
	}
	
	public void parking() {
		System.out.println("parking() CALLED");
	}
	
}
