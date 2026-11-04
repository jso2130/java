package com.office.member;

import java.util.HashMap;

public class MemberDao {
	
	// 데이터 베이스
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();

	
	/*DB 검색*/
	public boolean isMember(String memId) {
		
		MemberDto memberDto = db.get(memId);      // DB에 정보가 있는지 확인
		
		return memberDto != null ? true : false;  // 정보가 있는지 불리언 값으로 반환
	
	}

	
	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
				
			return dto;
			
		} else {
			
			return null;
			
		}
		
	}
	
	
	/*데이터 저장*/
	public int insertNewMember(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto); 
		
		// 저장 성공 여부 반환
		return db.get(memberDto.getMemId()) != null ? 1 : 0;
	
	}

	
	/*데이터 삭제*/
	public MemberDto deletedMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
				
			MemberDto deletedMemberDto = db.remove(memberDto.getMemId());
			
			if (deletedMemberDto != null) {
				
				return deletedMemberDto;
				
			} else {
				
				return null;
				
			}
			
		} else {
			
			return null;
			
		}
		
	}

}
