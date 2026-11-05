package com.office.member;

import java.util.Scanner;

// 요청 분석하고 데이터를 입력받아 전달
public class MemberController implements MemberConfig {

	private final MemberService memberService;
	
	public MemberController(MemberService memberService) {
		
		this.memberService = memberService;
		
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		if (IS_DEV) 
			new MemberDumy().signUpForDumy(memberService);
		
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		
		MemberDto memberDto;
		
		boolean systemFlag = true;
		while(systemFlag) {
			
			// 메뉴 입력 받음
			System.out.println("1. SIGN-UP   2. SIGN-IN   3.MODIFY   4.DELETE   99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			
			switch (selectedMenuNum) {
			
			/*1. 회원가입*/
			case SIGN_UP:
				
				// 정보 입력받기
				System.out.println("Input new member ID");
				memId = scanner.next();
				
				System.out.println("Input new member PW");
				memPw = scanner.next();
				
				System.out.println("Input new member MAIL");
				memMail = scanner.next();
				
				System.out.println("Input new member PHONE");
				memPhone = scanner.next();
				
				// 입력받은 데이터 하나로 묶음
				memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				// 묶은 객체로 회원가입 비즈니스 로직에 전달
				memberService.signUp(memberDto);
				
				break;
				
			/*2. 로그인*/
			case SIGN_IN:
				
				// 정보 입력받기
				System.out.println("Input member ID");
				memId = scanner.next();
				
				System.out.println("Input member PW");
				memPw = scanner.next();
				
				// 입력받은 데이터 하나로 묶음
				memberDto = new MemberDto();
				memberDto.setMemId(memId);
				memberDto.setMemPw(memPw);
				
				// 묶은 객체로 로그인 비즈니스 로직에 전달
				memberService.signIn(memberDto);
				
				break;
			
			/*3. 정보 수정*/
			case MODIFY:
				
				System.out.println("Input member ID");
				memId = scanner.next();
				
				System.out.println("Input member PW");
				memPw = scanner.next();
				
				memberDto = new MemberDto();
				memberDto.setMemId(memId);
				memberDto.setMemPw(memPw);
				
				boolean isAuthentication = memberService.doAuthenticationByMemIdAndMemPw(memberDto);
				
				if(isAuthentication) {
					
					System.out.println("Input member PW");
					memPw = scanner.next();
					
					System.out.println("Input new member MAIL");
					memMail = scanner.next();
					
					System.out.println("Input new member PHONE");
					memPhone = scanner.next();
					
					memberDto.setMemPw(memPw);
					memberDto.setMemMail(memMail);
					memberDto.setMemPhone(memPhone);
					
				}
				
				memberService.modify(memberDto);
				
				break;
			
			
			case DELETE:
				
				// 정보 입력받기
				System.out.println("Input member ID");
				memId = scanner.next();
				
				System.out.println("Input member PW");
				memPw = scanner.next();
				
				memberDto = new MemberDto();
				memberDto.setMemId(memId);
				memberDto.setMemPw(memPw);
				
				memberService.delete(memberDto);

				break;
			
			/*99. 시스템 종료*/
			case SYSTEM_OUT:
				
				systemFlag = false;
				System.out.println("GOOD BYE");
				
				break;
			
			}
			
		}
		
		scanner.close();
		
	}
	
}
