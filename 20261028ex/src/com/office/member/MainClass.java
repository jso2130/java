package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Flag flag = new Flag();
		
		MemberDB memberDB = new MemberDB();
		
		MemberService memberService = new MemberService(memberDB, scanner, flag);
		
		Config config = new Config();
		if (config.IS_DEV) {
			
			MemberDumy memberDumy = new MemberDumy(memberDB);
			memberDumy.initDumyData();
		
		}
		
		
		// 메뉴 선택
		while (flag.systemFlag) {
			
			System.out.println("1.회원가입   2.로그인   3.정보 수정   4.탈퇴   99.시스템 종료");
			int SelectedMenuNum = scanner.nextInt();
			
			switch (SelectedMenuNum) {
			
			// 1. 회원가입
			case Menu.MENU_SIGN_UP: 
				
				memberService.doSignUp();
				
				break;
				
			// 2. 로그인	
			case Menu.MENU_SIGN_IN: 
				
				memberService.doSignIn();
				
				break;
			
			// 3. 정보 수정	
			case Menu.MENU_MODIFY: 
				
				memberService.doModify();
				
				break;
				
			// 4. 탈퇴	
			case Menu.MENU_DELETE: 
				
				memberService.doDelete();
				
				break;
				
			// 99. 시스템 종료	
			case Menu.MENU_SYSTEM_OUT: 
				
				flag.systemFlag = false;
				System.out.println("시스템이 종료됩니다");
				
				break;
				
			}
		
		}
		
		scanner.close();
	
	}
	
}
