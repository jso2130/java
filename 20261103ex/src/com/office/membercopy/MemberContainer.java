package com.office.membercopy;

public class MemberContainer {
	
	final private MemberDao memberDao = new MemberDao();
	final private MemberSurvice memberSurvice = new MemberSurvice(memberDao);
	final private MemberController memberController = new MemberController(memberSurvice);

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

	public MemberSurvice getMemberSurvice() {
		return memberSurvice;
	}

	public MemberController getMemberController() {
		return memberController;
	}
	
}
