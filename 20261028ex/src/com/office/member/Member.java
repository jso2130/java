package com.office.member;

public class Member {

	/*속성(멤버 필드)*/
	 
	String memberId; 
	String memberPw; 
	String memberMail; 
	String memberPhone; 
	
	/*생성자*/
	
	public Member() {
		
	}
	
	public Member(String memberId, String memberPw, String memberMail, String memberPhone) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberMail = memberMail;
		this.memberPhone = memberPhone;
	}
	
	/*기능(메서드)*/

	//회원 정보 출력 
	public void printInfo() {
		System.out.println("memberId: " + memberId);
		System.out.println("memberPw: " + memberPw);
		System.out.println("memberMail: " + memberMail);
		System.out.println("memberPhone: " + memberPhone);
	}
	
}
