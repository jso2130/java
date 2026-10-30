package com.office.ex;

/*
 * [싱글턴 클래스]
 * 누적 급여 지급 횟수
 */

public class PayCount {

	private int cnt = 0;
	private static PayCount paycount = null; 
	
	private PayCount() {           // 생성자 접근 제한함 (객체 생성 제한함)
		
	}
	
	// 객체 생성하지 않고도 접근할 수 있게 static
	public static PayCount getPayCountInstance() {
		if (paycount == null) {    // 객체가 한 번 만들어지면 더이상 만들 수 없다.
			
			paycount = new PayCount();
			
		}
		
		return paycount;   // 객체를 반환
	}

	
	// 조회
	public int getCnt() {
		return cnt;
	}

	// 초기화
	public void setCnt() {
		this.cnt++;
	}
	
}
