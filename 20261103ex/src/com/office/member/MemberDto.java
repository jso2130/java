package com.office.member;

public class MemberDto {

	private String memId;
	private String memPw;
	private String memMail;
	private String memPhone;
	
	public MemberDto() {        // 다양한 경우의 수를 담을 빈 객체를 생성하기 위한 생성자
		
	}
	
	public MemberDto(String memId, String memPw, String memMail, String memPhone) {  // 모든 
		
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
		this.memPhone = memPhone;
		
	}

	// 모든 경우의 수대로 초기화 하는 메서드
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemMail() {
		return memMail;
	}

	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	
}
