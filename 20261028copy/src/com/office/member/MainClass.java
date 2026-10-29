package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Config config = new Config();   // 개발자 모드 설정
		
		Flag flag = new Flag();         // 프로그램 실행 플래그
		
		MemberDB memberDB = new MemberDB();  // 회원 정보를 담은 객체 한 번만 생성
		
		MemberService memberService = new MemberService(memberDB, scanner);  // 회원 정보 객체 공유
		
		/*
		 * 과제1: 더미 데이터 초기화는 개발환경과 실환경으로 구분해야 한다.
		 */
		if (config.IS_DEV) {
			MemberDumy memberDumy = new MemberDumy(memberDB);
			memberDumy.initMemberDumyData();
		}
		
		
		
		while (flag.systemFlag) {

			/*메뉴 선택*/
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    5.PRINT_ALL_MEMBER    99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			/*메뉴별 비즈니스 로직*/
			switch (selectedMenu) {  
			
			case Menu.MENU_SIGN_UP:			
				memberService.doSignUp();
				break;

			case Menu.MENU_SIGN_IN:			
				memberService.doSignIn(flag);
				break;

			case Menu.MENU_MODIFY:			
				memberService.doModify();
				break;

			case Menu.MENU_DELETE:			
				memberService.doDelete();
				break;

			case Menu.MENU_SYSTEM_OUT:		
				flag.systemFlag = false;
				System.out.println("Say Good bye~");
				break;
				
			case Menu.MENU_PRINT_ALL_MEMBER:
				
				HashMap<String, Member> db = memberDB.memberDB;

				for (String key : db.keySet()) {
					Member member = db.get(key);
					System.out.println(member.memberId);
					System.out.println(member.memberPw);
					System.out.println(member.memberMail);
					System.out.println(member.memberPhone);
				}
				
				for (Member member : db.values()) {
					System.out.println(member.memberId);
					System.out.println(member.memberPw);
					System.out.println(member.memberMail);
					System.out.println(member.memberPhone);
				}
				
				break;
				
			}

		}

		scanner.close();

	}

}
