package com.office.member;

import com.office.diary.DiaryDto;

public class MemberService implements IMemberService {
	
	final private MemberDao dao;
	
	public MemberService(MemberDao dao) {
		
		this.dao = dao;
		
	}

	/*회원가입*/
	@Override
	public void signUp(MemberDto memberDto) {
		
		/*아이디 중복확인*/
		boolean isMember = dao.isMember(memberDto.getMemId());
		
		
		if (memberDto.getMemId() == null && memberDto.getMemPw().length() > 4) {
			
			DiaryDto diaryDto = new DiaryDto(null, null);
			System.out.println("회원가입이 완료되었습니다");
			
		} else if (memberDto.getMemId() != null){
			
			System.out.println("이미 존재하는 아이디입니다.");
			
		} else if (memberDto.getMemPw().length() < 4){
			
			System.out.println("비밀번호는 최소 4자리 이상입니다.");
			
		} 
		
	}

	/*로그인*/
	@Override
	public boolean signIn(MemberDto memberDto) {
		
		MemberDto dto = dao.searchMemberByMemIdAndMemPw(memberDto);
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			
			return true;
			
		} else {
		
			return false;
			
		}
		
	}

	/*정보수정*/
	@Override
	public void modify(String sessionId, MemberDto memberDto) {
		
		MemberDto dto = dao.updatedMemberDto(sessionId, memberDto);
		
		System.out.println("[수정된 정보]");
		System.out.println("비밀번호: " + dto.getMemPw());
		System.out.println("이메일: " + dto.getMemMail());
		System.out.println("전화번호: " + dto.getMemPhone());
		
	}

	/*탈퇴*/
	@Override
	public void delete(String sessionId) {
		
		boolean result = dao.deleteMember(sessionId);
		
		if (result) {
			
			System.out.println("탈퇴가 완료되었습니다.");
			
		} else {
			
			System.out.println("탈퇴에 실패하였습니다. 다시 시도해주세요");
			
		}
		
	}

}
