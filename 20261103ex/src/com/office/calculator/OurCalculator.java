package com.office.calculator;

// 전달받은 재료로 연산 실행하고 출력하는 역할
public class OurCalculator {
	                                      // DI (Dependency Injection, 의존성 주입) 
	public void calculate(int n1, int n2, ICalculator iCalculator) {
		
		int result = iCalculator.doOperator(n1, n2);
		
		System.out.println("result: " + result); 
		
	}
	
	/*
	public void calAdd(int n1, int n2) {
		
		ICalculator iCalculator = new CalAdd();
		int result = iCalculator.doOperator(n1, n2);
		
		System.out.println("result: " + result);
		
	}
	
	public void calSub(int n1, int n2) {
			
		ICalculator iCalculator = new CalSub();
		int result = iCalculator.doOperator(n1, n2);
		
		System.out.println("result: " + result);
		
	}
	
	public void calMul(int n1, int n2) {
		
		ICalculator iCalculator = new CalMul();
		int result = iCalculator.doOperator(n1, n2);
		
		System.out.println("result: " + result);
		
	}
	
	public void calDiv(int n1, int n2) {
		
		ICalculator iCalculator = new CalDiv();
		int result = iCalculator.doOperator(n1, n2);
		
		System.out.println("result: " + result);
		
	}
	*/
	
}
