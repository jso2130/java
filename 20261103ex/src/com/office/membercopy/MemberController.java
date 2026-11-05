package com.office.membercopy;

import java.util.Scanner;

public class MemberController implements Config {
	
	final private MemberSurvice memberSurvice;
	
	public MemberController (MemberSurvice memberSurvice) {
		
		this.memberSurvice = memberSurvice;
		
	}

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		if (IS_DEV)
			new MemberDumy().signUpForDumy(memberSurvice);
		
		boolean systemFlag = true;
		while (systemFlag) {
			
			System.out.println("1.회원가입   2.로그인   3.정보 수정   4.탈퇴   99.시스템 종료");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case value:
				
				break;

			default:
				break;
			}
			
		}
		
	}
	
}
