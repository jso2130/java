package com.office.methodex01;

public class Greet {

	/*메서드*/ 
	
	// 1. 정보가 없는 사용자라면
	public void printGreetWord() {   
		
		System.out.println("안녕하세요");
		
	}
	
	// 2. 정보가 있는 사용자라면
	public void printGreetWord(String name) {    // 파라미터 있음
		
		System.out.println(name + "님, 안녕하세요");
		
	}
	
	
}
