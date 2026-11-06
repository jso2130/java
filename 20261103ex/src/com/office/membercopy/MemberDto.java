package com.office.membercopy;

import java.util.ArrayList;

public class MemberDto {

	private String memId;
	private String memPw;
	private String memMail;
	private String memPhone;
	
	private ArrayList<DiaryDto> diaries;
	
	public MemberDto() {
		
		this.diaries = new ArrayList<DiaryDto>();
		
	}

	public MemberDto(String memId, String memPw, String memMail, String memPhone) {

		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
		this.memPhone = memPhone;
		
		this.diaries = new ArrayList<DiaryDto>();
		
	}

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

	public ArrayList<DiaryDto> getDiaries() {
		return diaries;
	}
	
}
