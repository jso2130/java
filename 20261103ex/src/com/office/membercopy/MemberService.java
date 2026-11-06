package com.office.membercopy;

public class MemberService implements IMemberService {

	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		
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
	public void doModify(MemberDto memberDto) {
		
		MemberDto updateMemberDto = memberDao.updateMemberByMemId(memberDto.getMemId(), memberDto);
		
		if (updateMemberDto != null) {
			
			System.out.println("수정이 완료되었습니다");
			
		} else {
			
			System.out.println("수정에 실패하였습니다. 다시 시도해주세요");
			
		}
		
	}


	@Override
	public void doDelete(MemberDto memberDto) {

		boolean result = memberDao.deleteMember()
		
	}


	@Override
	public void doDiaryWrite(String sessionId, DiaryDto diaryDto) {
		
		boolean updatedDiary = memberDao.setDiary(sessionId, diaryDto);
		
		if (updatedDiary) {
			
			System.out.println("다이어리가 추가되었습니다.");
			
		} else {
			
			System.out.println("다이어리 추가에 실패하였습니다.");
			
		}
		
	}


	@Override
	public void doDiaryRead(MemberDto memberDto) {
		// TODO Auto-generated method stub
		
	}
	
}
