package com.office.inheri.restraurant;

public class ChildRestaurant extends ParentRestaurant  
							 implements CheckList, CheckList2 {    // 다형성

	public final static int PARENT_MENU = 1;
	public final static int CHILD_MENU = 2;
	
	public void makeBokkeumbap() {          // 아들 클래스의 신메뉴
		
		System.out.println("아들 볶음밥 만듦");
		
	}
	
	public void makeJajang(int menu) {      
		
		if (menu == PARENT_MENU) {
			
			super.makeJajang();      // super : 바로 위에 있는 상위 클래스의 메서드를 실행한다. 
			
		} else {
			
			System.out.println("아들 자장면 만듦");

		}
		                		
	}
	
	@Override
	public void makeTangsuyuk() {
		
	}

	@Override
	public void checkFloor() {
		
	}

	@Override
	public void checkToilet() {
		
	}

	@Override
	public void checkHwagu() {
		
	}
	
}
