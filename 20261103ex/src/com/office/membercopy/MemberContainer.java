package com.office.membercopy;

// 필요한 객체(부품)를 한번에 생성하는 싱글톤 클래스
public class MemberContainer {

	// 부품이 한번만 생성되게 상수 + private
	final private MemberDao memberDao = new MemberDao();
	final private MemberService memberService = new MemberService(memberDao);
	final private MemberController memberController = new MemberController(memberService);
	
	private static MemberContainer memberContainer;
	
	
	private MemberContainer() {
			
	}
	
	public static MemberContainer getInstance() {
		
		if (memberContainer == null) {
			
			memberContainer = new MemberContainer();
			
		}
		
		return memberContainer;
		
	}

	public MemberController getMemberController() {
		
		return memberController;
		
	}

	public MemberService getMemberService() {
		
		return memberService;
		
	}

	public MemberDao getMemberDao() {
		
		return memberDao;
		
	}
	
}
