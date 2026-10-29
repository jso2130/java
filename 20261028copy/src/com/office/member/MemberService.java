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

		Member member = new Member(memberId, memberPw, memberMail, memberPhone);
		
		db.memberDB.put(memberId, member);
		
		db.memberDB.get(memberId).printInfo();
		
		/*
		 * 과제4: ID 중복 체크 기능 추가
		 * 과제5: 비밀번호는 8~12 문자로 표현
		 */
		
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
		
		/*
		 * 과제6: 로그인 실패가 3회 초과이면 시스템 종료
		 */
		
	}
	
	/*
	 * 정보 수정
	 */
	public void doModify() {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();

		System.out.println("Input member PW");
		String memberPw = scanner.next();

		System.out.println("Input member MAIL");
		String memberMail = scanner.next();

		System.out.println("Input member PHONE");
		String memberPhone = scanner.next();
		
		
		// 인증 절차 추가
		Member searchedMember = db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			searchedMember.memberPw = memberPw;
			searchedMember.memberMail = memberMail;
			searchedMember.memberPhone = memberPhone;
			
		} else {
			return;
			
		}
		
		searchedMember = db.memberDB.get(memberId);
		searchedMember.printInfo();
		
		/*
		 * 과제7: ID, PW 인증 -> ok -> 정보 수정
		 */
		
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






