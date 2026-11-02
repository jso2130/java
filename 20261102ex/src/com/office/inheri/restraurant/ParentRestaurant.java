package com.office.inheri.restraurant;

       // abstract : 추상
public abstract class ParentRestaurant {

	public void makeJajang() {
		
		System.out.println("아빠 자장면 만듦");
		
	}
	
	public void makeJjamppong() {
		
		System.out.println("아빠 짬뽕 만듦");
		
	}
	
	// 추상화
	public abstract void makeTangsuyuk();  // 실체(실행부)가 없는 메서드
	
}
