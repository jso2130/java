package com.office.member;

public class MemberDumy {

	MemberDB db;
	
	public MemberDumy(MemberDB memberDB) {

		this.db = memberDB;
		
	}
	
	public void initDumyData() {
		
		String[] memberIDs  = {"gildong", "chanho", "seari"};
		String[] memberPWs  = {"12345678", "00001111", "22223333"};
		String[] memberMAILs  = {"gildong@naver.com", "chanho@gmail.com", "seari@daum.net"};
		String[] memberPHONEs  = {"01000000000", "01011112222", "01022223333"};
	
		for (int i = 0; i < memberIDs.length; i++) {
			
			Member member = new Member(memberIDs[i], memberPWs[i], memberMAILs[i], memberPHONEs[i]);
			db.memberDB.put(memberIDs[i], member);
			
		}
		
	}
	
}
