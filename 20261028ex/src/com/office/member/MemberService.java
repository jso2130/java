package com.office.member;

import java.util.Scanner;

public class MemberService {

	MemberDB db;
	Scanner scanner;
	Flag flag;
	String id;
	
	public MemberService(MemberDB memberDB, Scanner scanner, Flag systemFlag) {
		
		this.db = memberDB;
		this.scanner = scanner;
		this.flag = systemFlag;
		
	}
	
	/*회원가입*/
	public void doSignUp() {
		
		// 아이디 중복 체크
		System.out.println("Input new member ID");
		String memberId = scanner.next();
		
		Member SearchedMember = db.memberDB.get(memberId);
		while (true) {
			
			if (SearchedMember == null) {
				
				break;
				
			}
			
			System.out.println("이미 존재하는 아이디입니다.");
			System.out.println("Input new member ID");
			memberId = scanner.next();
		}
		
		// 비밀번호 8~12자 조건
		System.out.println("Input new member PW");
		String memberPw = scanner.next();
		
		while (true) {
			
			if (memberPw.length() >= 8 && memberPw.length() <= 12) {
				
				break;
				
			}
			
			System.out.println("8 ~ 12자로 입력해주세요.");
			System.out.println("Input new member PW");
			memberPw = scanner.next();
			
		}
		
		// 메일과 전화번호 입력
		System.out.println("Input new member MAIL");
		String memberMail = scanner.next();
		
		System.out.println("Input new member PHONE");
		String memberPhone = scanner.next();
		
		// 새 멤버 객체에 저장
		Member member = new Member(memberId, memberPw, memberMail, memberPhone);
		
		// DB에 저장
		db.memberDB.put(memberId, member);
		
		// 회원가입 완료된 정보 출력
		db.memberDB.get(memberId).printInfo();
		
	}
	
	/*로그인*/
	public void doSignIn() {
		
		int loginCnt = 0;
		
		while (loginCnt < 3) {
			
			System.out.println("Input new member ID");
			String memberId = scanner.next();
			
			Member SearchedMember = db.memberDB.get(memberId);
			
			// 로그인 성공
			if (SearchedMember != null) {
				
				System.out.println("Input new member PW");
				String memberPw = scanner.next();
				
				if (SearchedMember.memberPW.equals(memberPw)) {
					
					System.out.println("로그인 되었습니다");
					flag.login = true;
					id = memberId;
					return; 
					
				}
			
			}
			
			// 로그인 실패
			loginCnt++;
			
			if (SearchedMember == null) {
				
				System.out.printf("\n존재하지 않는 아이디입니다. (로그인 실패 %d/3)\n", loginCnt);
				
			} else {
				
				System.out.printf("\n잘못된 비밀번호입니다. (로그인 실패 %d/3)\n", loginCnt);
				
			}

		}
		
		System.out.println("로그인 실패 횟수가 3회를 초과했습니다. 시스템이 종료됩니다.");
		flag.systemFlag = false;
		
	}

	// 정보 수정
	public void doModify() {
		
		/*버전 2*/
		
		if (!flag.login) {
		
			System.out.println("로그인이 필요한 서비스입니다. 로그인 먼저 진행해주세요");
			doSignIn();
			
			if (!flag.login)  // 그래도 로그인 시도가 실패했을 때 메서드가 종료될 수 있게 하는 장치
				return;
			
		}
		
		Member loginedMember = db.memberDB.get(id);
		
		if (loginedMember == null) {  // 혹시 모를 예외 방지
			
			System.out.println("회원 정보를 찾을 수 없습니다");
			return;
			
		}
		
		// 수정 정보 받기
		while (true) {
			
			System.out.println("수정할 비밀번호 8~12자로 입력하세요");
			String memberPw = scanner.next();
			
			if (memberPw.length() >= 8 && memberPw.length() <= 12) {
				
				System.out.println("수정할 메일주소를 입력하세요");
				String memberMail = scanner.next();
				
				System.out.println("수정할 전화번호를 입력하세요");
				String memberPhone = scanner.next();
				
				loginedMember.memberPW = memberPw;
				loginedMember.memberMAIL = memberMail;
				loginedMember.memberPHONE = memberPhone;
				
				loginedMember.printInfo();
				
			    break;
			    
			} else {
				
				System.out.println("비밀번호 제한수가 틀렸습니다");
				
			}

		}
		
		
		/*버전 1*/
//		while (true) {
//			
//			if (flag.login) {
//				
//				Member loginedMember = db.memberDB.get(id);
//				
//				System.out.println("수정할 정보를 입력하세요");
//				
//				System.out.println("Input new member PW");
//				String memberPw = scanner.next();
//				
//				System.out.println("Input new member MAIL");
//				String memberMail = scanner.next();
//				
//				System.out.println("Input new member PHONE");
//				String memberPhone = scanner.next();
//				
//				loginedMember.memberPW = memberPw;
//				loginedMember.memberMAIL = memberMail;
//				loginedMember.memberPHONE = memberPhone;
//				
//				loginedMember.printInfo();
//				System.out.println("수정이 완료되었습니다");
//				
//				return;
//				
//				
//			} else {
//				
//				System.out.println("Input member ID");
//				String memberId = scanner.next();
//				
//				Member SearchedMember = db.memberDB.get(memberId);
//				
//				if (SearchedMember != null) {
//					
//					System.out.println("Input member PW");
//					String memberPw = scanner.next();
//					
//					if (SearchedMember.memberPW.equals(memberPw)) {
//						
//						flag.login = true;
//						this.id = memberId;
//						
//					} else {
//						
//						System.out.println("잘못된 비밀번호입니다.");
//						
//					}
//				
//				} else {
//					
//					System.out.println("존재하지 않는 아이디입니다.");
//					
//				}
//			
//			}
//			
//		}
		
	}
	
	public void doDelete() {
		
	}
	
}
