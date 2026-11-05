package com.office.membercopy;

public class MemberService implements IMemberService {

	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		
		this.memberDao = memberDao;
	
	}
	
	/*회원가입*/
	@Override
	public void signUp(MemberDto memberDto) {
		
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		if (!isMember) {
			
			boolean result = memberDao.insertNewMember(memberDto);
			
			if (!result) {
				
				System.out.println("회원가입에 실패하였습니다.");
				
			} else {
				
				System.out.println("회원가입이 완료되었습니다.");
				
			}
			
		} else {
			
			System.out.println("이미 존재하는 아이디입니다.");
			
		}
		
	}

	/*로그인*/
	@Override
	public void signIn(MemberDto memberDto) {
		
		MemberDto searchedMemberDto = memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		if (searchedMemberDto != null) {
			
			System.out.println("로그인 성공");
			
		} else {
			
			System.out.println("로그인 실패");
			
		}
		
	}

	/*정보 수정*/
	@Override
	public void modify() {
		// TODO Auto-generated method stub
		
	}

	/*탈퇴*/
	@Override
	public void delete(MemberDto memberDto) {
		
		
		
	}

}
