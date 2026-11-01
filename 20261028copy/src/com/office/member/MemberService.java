package com.office.member;

import java.util.Scanner;

public class MemberService {

	// 멤버 필드
	MemberDB db;    
	Scanner scanner;
	
	// 생성자
	public MemberService(MemberDB memberDB, Scanner scanner) {
		
		this.db = memberDB;
		this.scanner = scanner;
		
	}
	
	// 멤버 메서드
	
	/*
	 * 회원 가입
	 */
	public void doSignUp() {
		
		/*과제 - 아이디 중복 체크*/
		System.out.println("Input new member ID");
		String memberId = scanner.next();

		while (true) {
			
			Member member = db.memberDB.get(memberId);  // db의 value값의 타입이 Member
			if (member != null) {
				
				System.out.println("Input new member ID");
				memberId = scanner.next();
				
			} else {
				
				break;
				
			}
			
		}
		
		/*과제 - 비밀번호는 8~12 문자로 표현*/
		System.out.println("Input new member PW");
		String memberPw = scanner.next();
		
		while (true) {
			if (memberPw.length() < 8 || memberPw.length() > 12) {
				System.out.println("Input new member PW");
				memberPw = scanner.next();
				
			} else {
				break;
				
			}
			
		}
		
		System.out.println("Input new member MAIL");
		String memberMail = scanner.next();

		System.out.println("Input new member PHONE");
		String memberPhone = scanner.next();

		// 새 멤버 객체 생성
		Member member = new Member(memberId, memberPw, memberMail, memberPhone);
		
		// db에 저장
		db.memberDB.put(memberId, member);
		
		// 저장된 정보 출력
		db.memberDB.get(memberId).printInfo();
		
	}
	
	/*
	 * 로그인
	 */
	public void doSignIn(Flag flag) {
		
		System.out.println("systemFlag: " + flag.systemFlag);
		
		int count = 1;   // 1 -> 2 -> 3
		while (true) {
			
			if (count > 3) {
				flag.systemFlag = false;
				break;
			}
			
			System.out.println("Input member ID");
			String memberId = scanner.next();

			System.out.println("Input member PW");
			String memberPw = scanner.next();
			
			Member searchedMember = db.memberDB.get(memberId);
			
			if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
				System.out.println("1.SIGN-IN SUCCESS!!");
				break;
				
			} else {
				System.out.println("3.SIGN-IN FAIL!!");
				count++;
				
			}
			
		}
		
	}
	
	/*
	 * 정보 수정
	 */
	public void doModify() {
		
		while (true) {
			
			System.out.println("Input member ID");
			String memberId = scanner.next();
			
			Member searchMember  = db.memberDB.get(memberId);
			if (searchMember != null) {
				
				System.out.println("Input member PW");
				String memberPw = scanner.next();
				
				if (searchMember.memberPw.equals(memberPw)) {
					
					System.out.println("Input member PW");
					String newMemberPw = scanner.next();
					
					System.out.println("Input member MAIL");
					String newMemberMail = scanner.next();
					
					System.out.println("Input member PHONE");
					String newMemberPhone = scanner.next();
					
					searchMember.memberPw = newMemberPw;
					searchMember.memberMail = newMemberMail;
					searchMember.memberPhone = newMemberPhone;
					
					searchMember.printInfo();
					
					break;
					
				}
				
			} else {
				
				System.out.println("존재하지 않는 아이디입니다.");
				
			}
			
		}
		
	}
	
	/*
	 * 회원 탈퇴
	 */
	public void doDelete() {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();

		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			db.memberDB.remove(memberId);
		}
		
	}
	
}






