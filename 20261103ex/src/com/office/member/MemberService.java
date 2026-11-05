package com.office.member;

import java.util.Scanner;

// 비즈니스 로직
public class MemberService implements IMemberService {

	MemberDao memberDao = new MemberDao();
	
	@Override
	public void signUp(MemberDto memberDto) {
		
		// 아이디 중복 체크
		boolean isMember = memberDao.isMember(memberDto.getMemId());  // 아이디(key)값만 전달해서 조회
		
		
		// 회원 정보 저장(회원가입)
		if (!isMember) {           // false - 중복 정보가 없으면 회원가입 가능
			
			int result = memberDao.insertNewMember(memberDto);       // 0 : 실패, 1 : 성공
			
			if (result == 0) {
				
				System.out.println("죄송합니다. 회원가입에 실패하였습니다. 잠시후 다시 시도해주세요");
				
			} else {
				
				System.out.println("회원가입이 완료되었습니다");
				
			}
			
		} else {
			
			System.out.println("이미 존재하는 아이디입니다.");
			
		}
		
		
	}

	@Override
	public void signIn(MemberDto memberDto) {
		                                          // 동사 + 명사 By 조건
		MemberDto searchedMemberDto = memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		if (searchedMemberDto != null) {
			
			System.out.println("로그인 성공");
			
		} else {
			
			System.out.println("로그인 실패");
			
		}
		
	}

	@Override
	public void modify(MemberDto memberDto) {
		
		MemberDto updateMemberDto = memberDao.updateMemberByMemId(memberDto);
		
		if (updateMemberDto != null) {
			System.out.println("수정완료되었습니다");
		} else {
			
			System.out.println("수정에 실패하였습니다");
		}
		
	}

	@Override
	public void delete(MemberDto memberDto) {
		
		MemberDto deletedMemberDto = memberDao.deletedMemberByMemIdAndMemPw(memberDto);
		
		if (deletedMemberDto != null) {
			
			System.out.println("탈퇴 완료");
			
		} else {
			
			System.out.println("탈퇴 실패");
			
		}
		
	}
	
	public boolean doAuthenticationByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		return dto != null ? true : false;
		
	}

}
