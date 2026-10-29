package com.office.methodex01;

public class AddOperator {

	/*메서드 오버로딩*/
	
	//1. 정수 입력
	public void add(int n1, int n2) {
		
		int result = n1 + n2;
		System.out.println("result: " + result);
		
	}
	
	//2. 실수 입력
	public void add(float n1, float n2) {
		
		float result = n1 + n2;
		System.out.println("result: " + result);
		
	}
	
	//3. 더블 입력
	public void add(double n1, double n2) {
		
		double result = n1 + n2;
		System.out.println("result: " + result);
		
	}
	
	//4. 문자열 연결
	public void add(String n1, String n2) {
		
		String result = n1 + n2;
		System.out.println("result: " + result);
		
	}
	
}
