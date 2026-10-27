package com.office.classex04;

public class Car {

	/*멤버 필드*/
	String color;
	int length;
	int price;
	int displacement;
	
	
	/*생성자*/
	// 디폴트 생성자
	public Car() {
		System.out.println("--CONSTRUCTOR--");
	}
	// 오버로딩 생성자
	public Car(String color, int length, int price, int displacement) {
		this.color = color;
		this.length = length;
		this.price = price;
		this.displacement = displacement;
	}
	
	
	/*메서드*/
	// 접근제한자 , 반환형, 메서드 이름, 괄호, 실행부
	public void goForward(int speed) {
		System.out.println("goForward");
		System.out.println(speed + "km/h");
	}
	
	public void goBack() {
		System.out.println("goBack");
	}
	
	public void doTest() {
		goForward(30);  // this는 붙여도 안붙여도 상관없다.
		goBack();
	}
	
}
