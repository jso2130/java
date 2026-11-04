package com.office.member;

import java.util.Scanner;

public class MemberService implements IMemberService {

	MemberDao memberDao = new MemberDao();
	
	@Override
	public void signUp(MemberDto memberDto) {
		
		// 아이디 중복 체크
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		// 회원 정보 저장(회원가입)
		if (!isMember) {           // false
			
			int result = memberDao.insertNewMember(memberDto);  // 0 : 실패, 1 : 성공
			
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
	public void modify() {
		// TODO Auto-generated method stub
		
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

}
