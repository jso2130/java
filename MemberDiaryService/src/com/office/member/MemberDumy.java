package com.office.member;

public class MemberDumy {
	
	private String[] ids = {"gildong", "chanho"};
	private String[] pws = {"0000", "1234"};
	private String[] mails = {"gildong@gmail.com", "chanho@naver.com"};
	private String[] phones = {"010-0000-0000", "010-1111-2222"};

	public void signUpForDumy(MemberService service) {
		
		for (int i =0; i < ids.length; i++) {
			
			MemberDto memberDto = new MemberDto(ids[i], pws[i], mails[i], phones[i]);
			service.signUp(memberDto);
			
		}
		
	}
	
}
