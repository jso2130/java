package com.office.ex;

public class SuperClass extends GrandClass{

	// 멤버 필드
	public String name;
	private int money;  // 하위 클래스에서 직접 접근하지 못한다.
	
	// 멤버 메서드
	public void printInfo() {
		
		System.out.println("name: " + name);
		System.out.println("money: " + money);
		
	}
	
}
