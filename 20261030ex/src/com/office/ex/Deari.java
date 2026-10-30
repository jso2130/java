package com.office.ex;

/*
 * 대리 직급
 */

public class Deari {
	
	public String name = "Kim Deari";
	private int money;    // 접근 제한자로 접근을 제어해서 데이터를 보호하고

	public Deari() {
		
		money = 1000000;  // 기본 월급 기준
		
	}
	
	public void pay() {
		
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료!");
		
	}

	
	/*자동 완성한 getter, setter*/
//	public int getMoney() {
//		return money;
//	}
//
//	public void setMoney(int money) {
//		this.money = money;
//	}
//	

	public void setMoney(int money, String ceoPW) {  // 월급 수정하기 위한 메서드 (우회해서 수정하는 방법)
		                 // 초기화 권한 확인을 위해 비밀번호를 같이 받는다.
		if (ceoPW.equals("1234")) { 
			this.money = money;
		}
		
	}
	
	public int getMoney() {                          // 월급 조회하기 위한 메서드 (우회해서 수정하는 방법)
		
		return this.money;
		
	}
	
	
	
}
