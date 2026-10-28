package com.office.member;

import java.util.Scanner;

public class MemberService {

	/*속성*/
	MemberDB db;
	
	/*생성자*/
	public MemberService(MemberDB memberDB) {
		this.db = memberDB;
	}
	
	/*-- 메서드--*/
	
	/*회원가입*/
	                    // 스케너를 메인클래스에서 가져옴
	public void doSignUp(Scanner scanner) {
		
		// 데이터 받기
		boolean signUpidFlag = true;
		while (signUpidFlag) {
			
			System.out.println("Input new member ID");
			String memberId = scanner.next();
			
			if (db.memberDB.containsKey(memberId)) {
				System.out.println("이미 존재하는 아이디입니다.");
			} else {
				signUpidFlag = false;
			}
				
		}
		
		boolean signUpPwFlag = true;
		while (signUpPwFlag) {
			
			System.out.println("Input new member PW");
			String memberPw = scanner.next();
			
			if (7 < memberPw.length() && memberPw.length() < 12) {
				signUpPwFlag = false;
			} else {
				System.out.println("비밀번호는 8~12자 사이로 입력해주세요");
			}
				
		}
		
	
		System.out.println("Input new member MAIL");
		String memberMail = scanner.next();
		
		System.out.println("Input new member PHONE");
		String memberPhone = scanner.next();
		
		
		Member member = new Member(memberId, memberPw, memberMail, memberPhone);
		//MemberDB db = new MemberDB();
		
		// 데이터 저장
		db.memberDB.put(memberId, member);
		
		// 데이터 조회
		db.memberDB.get(memberId).printInfo();
		
		/*
		 * 과제: 아이디 중복체크 기능
		 * 과제: 비밀번호는 8~12자 문자로 표현
		 */
		
	}
	
	/*로그인*/
	public void doSignIn(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		//MemberDB db = new MemberDB();
		
		int signInFailCount = 0;
		Member searchMember = db.memberDB.get(memberId);
		if (searchMember != null) {
			if (searchMember.memberPw.equals(memberPw)) {
				System.out.println("SIGN-IN SUCCESS!");
			} else if (!searchMember.memberPw.equals(memberPw) || searchMember = null ){
				System.out.println("SIGN-IN FAIL!");
				signInFailCount += 1;
			}
		} else {
			System.out.println("SIGN-IN FAIL!");
		}
		
		/*
		 * 과제: 로그인 실패가 3회 초과되면 시스템 종료
		 */
		
	}
	
	/*정보 수정*/
	public void doModify(Scanner scanner) {
			
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		Member searchMember = db.memberDB.get(memberId);
		if (searchMember != null) {
			
			System.out.println("Input member PW");
			String memberPw = scanner.next();
			
			if (searchMember.memberPw.equals(memberPw)) {
				
				System.out.println("Input member PW");
				String memberPw = scanner.next();
				
				System.out.println("Input new member MAIL");
				String memberMail = scanner.next();
				
				System.out.println("Input new member PHONE");
				String memberPhone = scanner.next();
				
				searchMember.memberPw = memberPw;
				searchMember.memberMail = memberMail;
				searchMember.memberPhone = memberPhone;
				
			} 
			
		} else {
			
			System.out.println("존재하지 않는 아이디입니다.");
		
		}
			
		//로깅
		searchMember = db.memberDB.get(memberId);
		searchMember.printInfo();
		
		/*
		 * 과제: id, pw 인증 -> 정보 수정
		 */
		
	}
	
	/*탈퇴*/
	public void doDelete(Scanner scanner) {
		
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
