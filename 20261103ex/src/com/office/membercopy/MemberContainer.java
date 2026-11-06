package com.office.membercopy;

public class MemberContainer {
	
	final private MemberDao memberDao = new MemberDao();
	final private MemberSession memberSession = new MemberSession();
	final private MemberService memberService = new MemberService(memberDao);
	final private MemberController memberController = new MemberController(memberService, memberSession);

	private static MemberContainer memberContainer;
	
	private MemberContainer() {}
	
	public static MemberContainer getInstance() {
		
		if (memberContainer == null) {
			
			memberContainer = new MemberContainer();
			
		}
		
		return memberContainer;
		
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberService getMemberSurvice() {
		return memberService;
	}

	public MemberController getMemberController() {
		return memberController;
	}

	public MemberSession getMemberSession() {
		return memberSession;
	}
	
}
