package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);    // 스캐너 객체 생성
		
		MemberDB memberDB = new MemberDB(); // 전체 장부 객체 딱 한번만 생성
		Flag systemFlag = new Flag(); 
		Config config = new Config();
		Menu menu = new Menu();
		
		MemberService memberService = new MemberService(memberDB, systemFlag);  
		
		/*
		 * 과제: 더미 데이터 초기화는 개발환경과 실환경으로 구분해야한다.
		 */
		
		if (IS_DEV) {
			MemberDumy memberDumy = new MemberDumy(memberDB);
			memberDumy.initMemberDumyData();
		}
		
		while (Flag.systemFlag) {              // 시스템은 종료하기 전까지 계속 실행되어야하니까 while문
			
			System.out.println("1.SIGN-UP  2.SIGN-IN  3.MODIFY  4.DELETE  5.MEMBERS-INFO  99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			
			case Menu.MENU_SIGN_UP:
				memberService.doSignUp(scanner);  // 스캐너 객체를 넣어준다.
				break;

			case Menu.MENU_SIGN_IN:
				memberService.doSignIn(scanner);
				break;
				
			case Menu.MENU_MODIFY:
				memberService.doModify(scanner);
				break;
				
			case Menu.MENU_DELETE:
				memberService.doDelete(scanner);
				break;
				
			case Menu.MENU_PRINT_ALL:
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
				
			case Menu.MENU_SYSTEM_OUT:
				System.out.println("Say Good bye");
				Flag.systemFlag = false;
				break;
				
			}
				
		}

		scanner.close();  // 스캐너 종료
		
	}
	
}
