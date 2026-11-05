package com.office.membercopy;

public interface IMemberService {

	public void doSignUp(MemberDto memberDto);
	
	public boolean doSignIn(MemberDto memberDto);
	
	public void doModify(String currentMemId, MemberDto memberDto);
	
	public void doDelete(MemberDto memberDto);
	
}
