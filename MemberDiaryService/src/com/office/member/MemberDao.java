package com.office.member;
import java.util.HashMap;

public class MemberDao {
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();

	
	/*아이디 중복 확인 - 회원가입*/
	public boolean isMember(String memberDto) {
		
		MemberDto isMember = db.get(memberDto);
		
		return isMember == null ? true : false;
		
	}

	/*로그인*/
	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			
			return dto;
			
		} else {
		
			return null;
			
		}
		
	}

	/*탈퇴*/
	public boolean deleteMember(String sessionId) {
		
		db.remove(sessionId);
		
		return db.get(sessionId) == null ? true : false;
		
	}

	public MemberDto updatedMemberDto(String sessionId, MemberDto memberDto) {
		
		db.put(sessionId, memberDto);
		
		return db.get(sessionId);
		
	}

}
