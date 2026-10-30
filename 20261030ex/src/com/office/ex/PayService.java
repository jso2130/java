package com.office.ex;

/*
 * 월급 지급 업무 처리 
 * 누적 급여 지급 횟수 관리
 */

public class PayService {
	
	Deari deari;
	
	Gwajang gwajang;
	
	Chajang chajang;
	
	
	public PayService() {

		deari = new Deari();
		gwajang = new Gwajang();
		chajang = new Chajang();
		
		/*대리 객체 접근*/
		// 월급 수정
		deari.setMoney(1200000, "1234");
		                         //바꿀 수 있는 권한 확인을 위해 비번 입력 받음
		// 월급 조회
		System.out.println("김대리 월급: " + deari.getMoney());
		
	}
	
	
	                // 지급되는 월
	public void pay(int month) {   // 월급 지급 업무 실행 메서드
		
		// 월급 지급
		deari.pay();
		gwajang.pay();
		chajang.pay();
		
		System.out.println(month + "월 급여 지급 완료");
		
		// 급여 횟수 누적해주기
		PayCount.getPayCountInstance().setCnt();
		
		// 누적 급여 횟수 출력
		int cnt = PayCount.getPayCountInstance().getCnt();
		System.out.println("누적 급여 횟수: " + cnt);
		
	}

}
