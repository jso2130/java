package com.office.member;

import com.office.membercopy.MemberContainer;

public class MainClass {

	public static void main(String[] args) {
		
		MemberContainer.getInstance()
		               .getMemberController()
		               .execute();
			
	}
	
}
