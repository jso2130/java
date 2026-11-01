package com.office.member;

public class Member {

	String memberID;
	String memberPW;
	String memberMAIL;
	String memberPHONE;
	
	public Member(String memberID, String memberPW, String memberMAIL, String memberPHONE) {
		
		this.memberID = memberID;
		this.memberPW = memberPW;
		this.memberMAIL = memberMAIL;
		this.memberPHONE = memberPHONE;
	
	}
	
	public void printInfo() {
		
		System.out.println("memberID: " + memberID);
		System.out.println("memberPW: " + memberPW);
		System.out.println("memberMAIL: " + memberMAIL);
		System.out.println("memberPHONE: " + memberPHONE);
		
	}
	
}
