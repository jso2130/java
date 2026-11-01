package com.office.ex;

public class PayService {

	Daeri daeri;
	
	public PayService() {
		
		daeri = new Daeri();
		
		daeri.setMoney(1200000, "1234");
		System.out.println("김대리 월급: " + daeri.getMoney());
		
	}
	
	public void pay(int month) {
		
		daeri.pay();
		System.out.println(month + "월 급여 지급 완료");
		
		// 누적 급여 지급 횟수
		PayCount.getPayCountInstance().setCnt();
		
		System.out.println("누적 급여 횟수: " + PayCount.getPayCountInstance().getCnt());
		
	}
	
}
