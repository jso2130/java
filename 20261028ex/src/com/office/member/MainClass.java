package com.office.member;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		boolean dumyFlag = true;
		
		MemberDB memberDB = new MemberDB(); // 전체 장부 객체 딱 한번만 생성
		MemberService memberService = new MemberService(memberDB);  
		MemberDumy memberDumy = new MemberDumy(memberDB);
		if (dumyFlag) {
			memberDumy.initMemberDumyData();
		}
		
		/*
		 * 과제: 더미 데이터 초기화는 개발환경과 실환경으로 구분해야한다.
		 */
		
		final int MENU_SIGN_UP = 1;
		final int MENU_SIGN_IN = 2;
		final int MENU_MODIFY = 3;
		final int MENU_DELETE = 4;
		final int MENU_PRINT_ALL = 5;
		final int MENU_SYSTEM_OUT = 99;
		
		
		while (systemFlag) {
			
			System.out.println("1.SIGN-UP  2.SIGN-IN  3.MODIFY  4.DELETE  5.MEMBERS-INFO  99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			
			case MENU_SIGN_UP:
				// memberService = new MemberService();
				memberService.doSignUp(scanner);  // 스캐너 객체를 넣어준다. MMI(macine to macine interface)
				break;

			case MENU_SIGN_IN:
				// memberService = new MemberService();
				memberService.doSignIn(scanner);
				break;
				
			case MENU_MODIFY:
				
				memberService.doModify(scanner);
				
				break;
				
			case MENU_DELETE:
				
				memberService.doDelete(scanner);
				
				break;
				
			case MENU_PRINT_ALL:
				
				
				
				break;
				
			case MENU_SYSTEM_OUT:
				System.out.println("Say Good bye");
				systemFlag = false;
				break;
			
				/*
				 * 과제: 케이스에 사용되는 리터럴 상수를 상수로 변경
				 * 과제: 메뉴 5번 생성해서 전체 회원 정보 출력하는 기능을 구현
				 */
				
			}
				
		}

		scanner.close();
		
	}
	
}
