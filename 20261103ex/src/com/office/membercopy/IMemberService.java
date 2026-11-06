package com.office.membercopy;

public interface IMemberService {

	public void doSignUp(MemberDto memberDto);
	
	public boolean doSignIn(MemberDto memberDto);
	
	public void doModify(MemberDto memberDto);
	
	public void doDelete(MemberDto memberDto);
	
	public void doDiaryWrite(String sessionId, DiaryDto diaryDto);
	
	public void doDiaryRead(MemberDto memberDto);
	
}
