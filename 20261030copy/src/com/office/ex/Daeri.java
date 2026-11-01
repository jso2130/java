package com.office.ex;

public class Daeri {

	String name = "Kim Daeri";
	private int money;

	public Daeri() {
		
		money = 1000000;
	
	}
	
	public void pay() {
		
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료!");
		
	}

	public int getMoney() {
		
		return money;
		
	}

	public void setMoney(int money, String ceoPw) {
		
		if (ceoPw.equals("1234"))
			this.money = money;
		
	}
	
}
