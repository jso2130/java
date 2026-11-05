package com.office.membercopy;

public class MemberSession {
	
	private String signinedMemberId;
	
	public void setCurrentSignInedMemberId(String memberDto) {
	
		signinedMemberId = memberDto;
		
	}
	
	public String getCurrentSignInedMemberId() {

		return signinedMemberId;
	
	}
	
}
