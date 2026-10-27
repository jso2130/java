package com.office.classex;

public class MainClass {

	public static void main(String[] args) {
		
		/*객체 생성*/
		//생성자 선언부(new) + 생성자 호출부
		Car car1 = new Car();
		
		//속성 접근
		System.out.println(car1.color);
		
		//기능 접근
		car1.drive();
		
		Car car2 = new Car();
		System.out.println(car2.color); //black
		car2.color = "White";  
		System.out.println(car2.color); // white
		
		Car car3 = new Car();
		System.out.println(car3.color);
		
	}

}
