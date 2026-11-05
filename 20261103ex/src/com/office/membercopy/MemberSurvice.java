package com.office.membercopy;

public class MemberSurvice implements IMemberService {

	final private MemberDao memberDao;
	
	public MemberSurvice(MemberDao memberDao) {
		
		this.memberDao = memberDao;
		
	}

	
	@Override
	public void doSignUp(MemberDto memberDto) {
		
		// 아이디 중복 확인
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		if (isMember) {
			
			boolean result = memberDao.insertNewMember(memberDto);
			
			if (result) {
				
				System.out.println("회원가입이 완료되었습니다");
				
			} else {
				
				System.out.println("회원가입에 실패하였습니다. 다시 시도해주세요");
				
			}
			
		} else {
			
			System.out.println("이미 존재하는 아이디입니다");
			
		}
		
	}

	@Override
	public boolean doSignIn(MemberDto memberDto) {
		
		MemberDto searchedMemberDto = memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		if (searchedMemberDto != null) {
			
			System.out.println("로그인 되었습니다");
			return true;
			
		} else {
			
			System.out.println("로그인에 실패하였습니다");
			return false;		
		}
		
	}


	@Override
	public void doModify(String currentMemId, MemberDto memberDto) {
		
		MemberDto updateMemberDto = memberDao.updateMemberByMemId(currentMemId, memberDto);
		
		if (updateMemberDto != null) {
			
			System.out.println("수정이 완료되었습니다");
			
		} else {
			
			System.out.println("수정에 실패하였습니다. 다시 시도해주세요");
			
		}
		
	}


	@Override
	public void doDelete(MemberDto memberDto) {
		// TODO Auto-generated method stub
		
	}
	
}
