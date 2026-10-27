package com.office.classex04;

public class MainClass {

	public void printHello() {
		System.out.println("Hello");
	}
	
	/*메인메서드*/
	// 메인메서드는 어느 클래스에도 속해 있지 않다.
	public static void main(String[] args) {
		
		
		// 객체 생성 - 디폴트 생성자
		Car car1 = new Car();
		
		// 메서드 호출
		car1.goForward(30);
		car1.goBack();
		car1.doTest();
		
		MainClass mainClass = new MainClass();
		mainClass.printHello();
		
	}
	
}
