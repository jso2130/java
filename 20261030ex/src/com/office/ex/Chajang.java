package com.office.ex;

/*
 * 차장 직급
 */

public class Chajang {

	public String name = "Kim Chajang";
	private int money;    // 월급

	public Chajang() {
		
		money = 3000000; // 기본 월급 기준
		
	}
	
	public void pay() {
		
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료!");
		
	}
	
	
	
}
