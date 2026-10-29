package com.office.methodex;

public class MainClass {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		int rst = calculator.addOperator(10, 20);  // 메서드 호출부
		System.out.println("rst: " + rst);
		
		Object myCar = calculator.productCar();
		
		
	}
	
}
