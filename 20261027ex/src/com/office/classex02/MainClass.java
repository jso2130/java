package com.office.classex02;

public class MainClass {

	public static void main(String[] args) {
		
		
		NewStudent newStudent1 = new NewStudent (1, 1, 5, "박찬호", false);
		NewStudent newStudent2 = new NewStudent (1, 2, 8, "박지성", false);
		newStudent1.printInfo();
		newStudent2.printInfo();
		
        
		NewStudent newStudent3 = new NewStudent (2, 8, "박세리");
		newStudent3.printInfo();
		
		NewStudent newStudent4 = new NewStudent (2, 7, 9, "김수지");
		newStudent4.printInfo();
		
		NewStudent newStudent5 = new NewStudent (1, 5 ,4, "김연경");
		newStudent5.printInfo();
		
		NewStudent newStudent6 = new NewStudent ();
		newStudent6.printInfo();
		
	}

}
