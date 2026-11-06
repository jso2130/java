package com.office.membercopy;

import java.util.Scanner;

public class MemberController implements Config, IFlag {
	
	final private MemberService memberService;
	final private MemberSession memberSession;
	
	public MemberController (MemberService memberService, MemberSession memberSession) {
		
		this.memberService = memberService;
		this.memberSession = memberSession;
		
	}

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		if (IS_DEV)
			new MemberDumy().signUpForDumy(memberService);
		
		String memberId;
		String memberPw;
		String memberMail;
		String memberPhone;
		
		MemberDto memberDto;
		int selectedMenuNum;
		
		String currentMemId = memberSession.getCurrentSignInedMemberId();
		
		boolean systemFlag = true;
		while (systemFlag) {
			
			// 로그인 전
			if (currentMemId == null) {
			
				System.out.println("1.회원가입   2.로그인   99.시스템 종료");
				selectedMenuNum = scanner.nextInt();
			
				
				switch (selectedMenuNum) {
			
				/*1. 회원가입*/
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
					
					memberService.doSignUp(memberDto);
					
					break;

				/*2. 로그인*/
				case SIGN_IN:
						
					System.out.println("아이디를 입력하세요");
					memberId = scanner.next();
					
					System.out.println("비밀번호를 입력하세요");
					memberPw = scanner.next();
					
					memberDto = new MemberDto();
					memberDto.setMemId(memberId);
					memberDto.setMemPw(memberPw);
					
					boolean result = memberService.doSignIn(memberDto);
					
					if (result)
						memberSession.setCurrentSignInedMemberId(memberId);
							
					break;
					
				/*99. 시스템 종료*/
				case SYSTEM_OUT:
					
					systemFlag = false;
					System.out.println("프로그램이 종료됩니다.");
					
					break;
				
				}
			
			// 로그인 후 
			} else {
				
				System.out.println("1.로그아웃   2.정보수정   3.다이어리 작성   4.다이어리 목록 조회   5.탈퇴   99.시스템 종료");
				selectedMenuNum = scanner.nextInt();
				
				
				switch (selectedMenuNum) {
				
				/*1. 로그아웃*/
				case SIGN_OUT:
					
					System.out.println("로그아웃을 진행하시겠습니까?");
					System.out.println("1.로그아웃   2.취소");
					selectedMenuNum = scanner.nextInt();
					
					if(selectedMenuNum == 1) {
						
						memberSession.setCurrentSignInedMemberId(null);
						System.out.println("로그아웃이 완료되었습니다");
						
					} else {
						
						System.out.println("로그아웃이 취소되었습니다");
						
					}
						
					break;
				
				/*2. 정보수정*/
				case MODIFY:
					
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
					
					memberService.doModify(memberDto);
					
					break;
					
				/*3. 다이어리 작성*/
				case DIATY_WRITE:
					
					System.out.println("새로운 다이어리 제목을 작성해주세요.");
					String title = scanner.nextLine();
					
					System.out.println("새로운 다이어리 내용을 작성해주세요.");
					String content = scanner.nextLine();
					
					DiaryDto diaryDto = new DiaryDto(title, content);
					String sessionId = memberSession.getCurrentSignInedMemberId();
					
					memberService.doDiaryWrite(sessionId, diaryDto);
					
					break;
				
				/*4. 다이어리 목록 조회*/
				case DIATY_READ:
					
					memberService.doDiaryRead(memberDto);
					
					break;
					
				/*5. 탈퇴*/		
				case DELETE:
					
					System.out.println("아이디를 입력하세요");
					memberId = scanner.next();
					
					System.out.println("비밀번호를 입력하세요");
					memberPw = scanner.next();
					
					if (currentMemId == memberId) {
						
						memberDto = new MemberDto();
						memberDto.setMemId(memberId);
						memberDto.setMemPw(memberPw);
						
						memberService.doDelete(memberDto);
						
					} else {
						
						System.out.println("현재 로그인된 정보가 아닙니다. 다시 입력해주세요");
						
					}
					
					break;
					
				/*99. 시스템 종료*/	
				case SYSTEM_OUT:
					
					systemFlag = false;
					System.out.println("프로그램이 종료됩니다.");
					
					break;
					
				}
			
			}
			
		}
		
		scanner.close();
		
	}
	
}
