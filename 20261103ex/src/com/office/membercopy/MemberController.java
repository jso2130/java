package com.office.membercopy;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		
		this.memberService = memberService;
	
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		
		MemberDto memberDto;
		
		
		while (SYSTEM_FLAG) {
			
			System.out.println("1.SIGN_UP   2.SIGN_IN   3.MODIFY   4.DELETE   99.SYSTEM_OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			
			/*1. 회원가입*/
			case SIGN_UP:
				
				System.out.println("아이디를 입력하세요");
				memId = scanner.next();
				
				System.out.println("비밀번호를 입력하세요");
				memPw = scanner.next();
				
				System.out.println("이메일를 입력하세요");
				memMail = scanner.next();
				
				System.out.println("전화번호를 입력하세요");
				memPhone = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				memberService.signUp(memberDto);
				
				break;
			
			/*2. 로그인*/
			case SIGN_IN:
				
				System.out.println("아이디를 입력하세요");
				memId = scanner.next();
				
				System.out.println("비밀번호를 입력하세요");
				memPw = scanner.next();
				
				memberDto = new MemberDto();
				memberDto.setMemId(memId);
				memberDto.setMemPw(memPw);
				
				memberService.signIn(memberDto);
				
				break;
			/*3. 정보 수정*/
			case MODIFY:
				
				memberService.modify();
				
				break;
			
			/*4. 탈퇴*/
			case DELETE:
				
				System.out.println("아이디를 입력하세요");
				memId = scanner.next();
				
				System.out.println("비밀번호를 입력하세요");
				memPw = scanner.next();
				
				memberDto = new MemberDto();
				memberDto.setMemId(memId);
				memberDto.setMemPw(memPw);
				
				memberService.delete(memberDto);
				
				break;
			
			/*99. 시스템 종료*/	
			case SYSTEM_OUT:
				
				SYSTEM_FLAG = false;
				System.out.println("시스템이 종료됩니다");
				
				break;

			}
			
		}
		
		scanner.close();
		
	}
	
}
