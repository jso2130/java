package com.office.ex;

/*
 * 과장 직급
 */

public class Gwajang {

	public String name = "Kim Gwajang";
	private int money;    // 월급

	public Gwajang() {
		
		money = 2000000; // 기본 월급 기준
		
	}
	
	public void pay() {
		
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료!");
		
	}
	
}
