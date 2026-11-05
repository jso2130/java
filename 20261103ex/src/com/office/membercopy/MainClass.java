package com.office.membercopy;

import com.office.member.MemberContainer;

public class MainClass {

	public static void main(String[] args) {
		
		MemberContainer.getInstance()
        			   .getMemberController()
        			   .execute();

	}

}
