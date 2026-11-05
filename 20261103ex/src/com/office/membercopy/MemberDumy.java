package com.office.membercopy;

public class MemberDumy {

	private String[] memIds = {"gildong", "chanho"};
	private String[] memPws = {"1234", "0000"};
	private String[] memMails = {"gildong@gmail.com", "chanho@naver.com"};
	private String[] memPhones = {"010-0000-0000", "010-1234-5678"};
	
	private String[][] memDiaries = {{"첫번째 일기","두번째 일기"}, {"출석합니다"}};
	
	
	public void signUpForDumy(MemberSurvice memberSurvice) {
		
		for (int i = 0; i < memIds.length; i++) {
			
			MemberDto memberDto = new MemberDto(memIds[i], memPws[i], memMails[i], memPhones[i])
			
		}
		
	}

}
