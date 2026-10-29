package com.office.methodex01;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 메서드 오버로딩
		 * : 메서드가 여러개 선언된 것을 말한다.
		 */

//		Greet greet = new Greet();
//		greet.printGreetWord("홍길동");
		
		
//		AddOperator addOperator = new AddOperator();
//		
//		addOperator.add(10, 20);
//		addOperator.add(1.5f, 2.5f);
//		addOperator.add(3.14, 9.5);
//		addOperator.add("Hello", "World");
		
		
		Score score = new Score();
		score.printStudentScore(90, 80, 70);            // 요구사항 1
		score.printStudentScore(90, 80, 70, 100, 90);   // 요구사항 2
		score.printStudentScore(90, 80, 70, 100);       // 요구사항 3
		
	}

}
