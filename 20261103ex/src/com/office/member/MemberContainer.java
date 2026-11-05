package com.office.member;

public class MemberContainer {
	
	private final MemberDao memberDao = new MemberDao();
	private final MemberService memberService = new MemberService(memberDao);
	private final MemberController memberController = new MemberController(memberService);

	private static MemberContainer memberContainer;
	
	
	private MemberContainer() {
		
	}
	
	public static MemberContainer getInstance() {
		
		if (memberContainer == null) {
			
			memberContainer = new MemberContainer();
			
		}
		
		return memberContainer;
		
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberService getMemberService() {
		return memberService;
	}

	public MemberController getMemberController() {
		return memberController;
	}
	
}
