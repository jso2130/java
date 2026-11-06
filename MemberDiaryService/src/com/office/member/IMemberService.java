package com.office.member;

public interface IMemberService {

	public void signUp(MemberDto memberDto); 
	
	public boolean signIn(MemberDto memberDto); 
	
	public void modify(String sessionId, MemberDto memberDto); 
	
	public void delete(String sessionId); 
	
	
}
