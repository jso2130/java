package com.office.ex;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 상속(inheritace)
		 * : 상위 클래스가 하위 클래스한테 멤버(필드, 메서드)를 물려주는 것
		 */
		
		ChildClass childClass = new ChildClass();
		System.out.println(childClass.name);
		childClass.printInfo();
		
	}
	
}
