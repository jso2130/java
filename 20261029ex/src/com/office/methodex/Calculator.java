package com.office.methodex;

public class Calculator { 

	public int addOperator(int n1, int n2) {   // 메서드 선언부
		
		int result = n1 + n2;
		//System.out.println("result: " + result);
		return result; // 선언부에서 실행한 결과값을 호출부로 반환해준다.
	}
	
	/*
	public void productCar() {   // 메서드 선언부
		
		Car car = new Car();
		return car;
		
	}
	*/
	
	      // 
	public Object productCar() {   // 메서드 선언부
		
		Car car = new Car();
		return car;
		
	}
}
