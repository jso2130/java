package com.office.membercopy;

public interface Config {
	
	/*개발모드 설정*/
	final boolean IS_DEV = true;
	
	/*메뉴 선택 상수*/
	
	// 로그인 전
	final int SIGN_UP = 1;
	final int SIGN_IN = 2;
	
	// 로그인 후
	final int SIGN_OUT = 1;
	final int MODIFY = 2;
	final int DIATY_WRITE = 3;
	final int DIATY_READ = 4;
	final int DELETE = 5;
	
	final int SYSTEM_OUT = 99;

}
