package com.office.membercopy;

import java.util.Scanner;

public class MemberController implements Config, IFlag {
	
	final private MemberSurvice memberSurvice;
	final private MemberSession memberSession;
	
	public MemberController (MemberSurvice memberSurvice, MemberSession memberSession) {
		
		this.memberSurvice = memberSurvice;
		this.memberSession = memberSession;
		
	}

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		if (IS_DEV)
			new MemberDumy().signUpForDumy(memberSurvice);
		
		String memberId;
		String memberPw;
		String memberMail;
		String memberPhone;
		
		MemberDto memberDto;
		
		boolean systemFlag = true;
		while (systemFlag) {
			
			System.out.println("1.회원가입   2.로그인   3.정보 수정   4.탈퇴   99.시스템 종료");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			
			case SIGN_UP:
				
				System.out.println("아이디를 입력하세요");
				memberId = scanner.next();
				
				System.out.println("비밀번호를 입력하세요");
				memberPw = scanner.next();
				
				System.out.println("이메일를 입력하세요");
				memberMail = scanner.next();
				
				System.out.println("전화번호를 입력하세요");
				memberPhone = scanner.next();
				
				memberDto = new MemberDto(memberId, memberPw, memberMail, memberPhone);
				
				memberSurvice.doSignUp(memberDto);
				
				break;

			case SIGN_IN:
				
				int cnt = 0;
				while (true) {
					
					if (cnt < 3) {
					
						System.out.println("아이디를 입력하세요");
						memberId = scanner.next();
						
						System.out.println("비밀번호를 입력하세요");
						memberPw = scanner.next();
						
						memberDto = new MemberDto();
						memberDto.setMemId(memberId);
						memberDto.setMemPw(memberPw);
						
						memberSession.setCurrentSignInedMemberId(memberId);
						boolean result = memberSurvice.doSignIn(memberDto);
						
						if (!result) {
							cnt++;
						}
				
					} else {
						
						System.out.println("로그인 실패 횟수가 3회를 초과했습니다. 잠시후 다시 시도하세요");
						
						break;
						
					}
					
				} 
				
				break;
			
			case MODIFY:
				
				String currentMemId = memberSession.getCurrentSignInedMemberId();
				
				if (currentMemId != null) {
					
					System.out.println("비밀번호를 입력하세요");
					memberPw = scanner.next();
					
					System.out.println("이메일를 입력하세요");
					memberMail = scanner.next();
					
					System.out.println("전화번호를 입력하세요");
					memberPhone = scanner.next();
					
					memberDto = new MemberDto();
					memberDto.setMemPw(memberPw);
					memberDto.setMemMail(memberMail);
					memberDto.setMemPhone(memberPhone);
					
					memberSurvice.doModify(currentMemId, memberDto);
					
				} else {
					
					System.out.println("로그인이 필요한 서비스입니다. 로그인을 진행해주세요");
					
				}
				
				break;
				
			case DELETE:
				
				System.out.println("아이디를 입력하세요");
				memberId = scanner.next();
				
				System.out.println("비밀번호를 입력하세요");
				memberPw = scanner.next();
				
				memberDto = new MemberDto();
				memberDto.setMemId(memberId);
				memberDto.setMemPw(memberPw);
				
				memberSurvice.doDelete(memberDto);
				
				break;
				
			case SYSTEM_OUT:
				
				systemFlag = false;
				System.out.println("프로그램이 종료됩니다.");
				
				break;
			
			}
			
		}
		
		scanner.close();
		
	}
	
}
