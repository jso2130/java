package com.office.member;
import java.util.Scanner;

import com.office.IConfig;
import com.office.session.Session;

public class MemberController implements IConfig {
	
	final private MemberService service;
	final private Session session;
	
	public MemberController(MemberService service, Session session) {
		
		this.service = service;
		this.session = session;
		
	}

	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		if (IS_DEV)
			new MemberDumy().signUpForDumy(service);
		
		int selectedMenuNum;
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		
		MemberDto memberDto;
		
		
		
		boolean systemFlag = true;
		while (systemFlag) {
		
			// 로그인 상태가 아닐 때
			if (session == null) {
				
				System.out.println("1.회원가입   2.로그인   99.시스템 종료");
				selectedMenuNum = scanner.nextInt();
				
				switch (selectedMenuNum) {
				
				/*1. 회원가입*/
				case MEMBER_SIGN_UP:
					
					System.out.println("아이디를 입력하세요.");
					memId = scanner.next();
					
					System.out.println("비밀번호를 입력하세요. (최소 4자리 이상)");
					memPw = scanner.next();
					
					System.out.println("메일을 입력하세요.");
					memMail = scanner.next();
					
					System.out.println("전화번호를 입력하세요.");
					memPhone = scanner.next();
					
					memberDto = new MemberDto(memId, memPw, memMail, memPhone);
					service.signUp(memberDto);
					
					break;
				
				/*2. 로그인*/
				case MEMBER_SIGN_IN:
					
					System.out.println("아이디를 입력하세요.");
					memId = scanner.next();
					
					System.out.println("비밀번호를 입력하세요.");
					memPw = scanner.next();
					
					memberDto = new MemberDto();
					memberDto.setMemId(memId);
					memberDto.setMemPw(memPw);
					
					boolean result = service.signIn(memberDto);
					
					if (result)
						session.setSessionId(memId);
					
					break;
				
				/*99. 시스템 종료*/
				case SYSTEM_OUT:
					
					systemFlag = false;
					System.out.println("시스템이 종료됩니다.");
					
					break;
	
				}
			
			} else {
				
				String sessionId = session.getSessionId();
				
				System.out.println("1.다이어리 작성   2.다이어리 조회   3.정보 수정   4.로그아웃   5.탈퇴   99.시스템 종료");
				selectedMenuNum = scanner.nextInt();
				
				switch (selectedMenuNum) {
				
				/*1. 다이어리 작성*/
				case DIARY_WRITE:
					
					break;
				
				/*2. 다이어리 조회*/
				case DIARY_READ:
					
					break;
				
				/*3. 정보 수정*/
				case MEMBER_MODIFY:
					
					System.out.println("새로운 비밀번호를 입력하세요 (최소 4자리이상)");
					memPw = scanner.next();	
					
					while (memPw.length() <= 4) {
					
						System.out.println("비밀번호가 4자리미만입니다.");
						System.out.println("새로운 비밀번호를 다시 입력하세요 (최소 4자리이상)");
						memPw = scanner.next();				
						
					}
					
					System.out.println("새로운 메일을 입력하세요.");
					memMail = scanner.next();
					
					System.out.println("새로운 전화번호를 입력하세요.");
					memPhone = scanner.next();
					
					memberDto = new MemberDto();
					memberDto.setMemPw(memPw);
					memberDto.setMemMail(memMail);
					memberDto.setMemPhone(memPhone);
					
					service.modify(sessionId, memberDto);
						
					break;
				
				/*4. 로그아웃*/
				case MEMBER_SIGN_OUT:
					
					System.out.println("로그아웃 하시겠습니까?");
					System.out.println("1.네   2.아니오");
					selectedMenuNum = scanner.nextInt();
					
					if (selectedMenuNum == 1) {
						
						sessionId = null;
						System.out.println("로그아웃 되었습니다.");
						
					} else {
						
						break;
						
					}
					
					break;
					
				/*5. 탈퇴*/
				case MEMBER_DELETE:
					
					System.out.println("탈퇴 하시겠습니까?");
					System.out.println("1.네   2.아니오");
					selectedMenuNum = scanner.nextInt();
					
					if (selectedMenuNum == 1) {
						
						service.delete(sessionId);
						
					} else {
						
						break;
						
					}
					
					break;
					
				/*99. 시스템 종료*/
				case SYSTEM_OUT:
					
					systemFlag = false;
					System.out.println("시스템이 종료됩니다");
					
					break;
				
				}
				
			}
			
		}
		
		scanner.close();
		
	}
	
}
