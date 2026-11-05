package com.office.membercopy;

import java.util.HashMap;

public class MemberDao {
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();
	
	/*데이터 저장*/
	public boolean insertNewMember(MemberDto memberDto) {
		
		String memId = memberDto.getMemId();
		db.put(memId, memberDto);
		
		return memId != null ? true : false;
	}
	
	/*아이디 중복 확인*/
	public boolean isMember(String memId) {
		
		MemberDto memberDto = db.get(memId);
		
		return memberDto != null ? true : false;
	}
	
	/*가입 회원 정보 조회 - 로그인*/
	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null & dto.getMemPw().equals(memberDto.getMemPw())) {
			
			return dto;
			
		} else {
			
			return null;
			
		}
		
	}

}
