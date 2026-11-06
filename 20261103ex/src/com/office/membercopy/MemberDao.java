package com.office.membercopy;

import java.util.HashMap;

public class MemberDao {

	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();

	/*아이디 중복확인*/
	public boolean isMember(String memberDto) {

		MemberDto result = db.get(memberDto);
		
		return result == null ? true : false;
	}
	
	/*새로운 회원 추가*/
	public boolean insertNewMember(MemberDto memberDto) {

		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId()) != null ? true : false; 
		
	}

	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			
			return dto;
			
		} else {
		
			return null;
			
		}
		
	}

	public MemberDto updateMemberByMemId(String currentMemId, MemberDto memberDto) {
		
		db.put(currentMemId, memberDto);
		
		return db.get(currentMemId);
		
	}

	public boolean setDiary(String sessionId, DiaryDto diaryDto) {
		
		MemberDto memberDto = db.get(sessionId);
	    
	    if (memberDto != null) {

	        memberDto.getDiaries().add(diaryDto);
	        return true;
	        
	    }
	    
	    return false;
		
	}
	
}
