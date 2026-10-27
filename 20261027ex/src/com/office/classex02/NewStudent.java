package com.office.classex02;

public class NewStudent {

	/*속성 - 멤버필드*/
	int grade = 1;          // 학년
	int classNo;        // 반번호
	int studentNo;      // 학생 개인 번호
	String studentName; // 학생 이름
	boolean absence = false;    // 휴학구분(휴학: true, 재학: false)

	
	/*생성자 오버로딩*/
	/*
	 * 생성자가 과적했다는 의미. 
	 * 생성자를 여러 개 생성해두고 파라미터 개수와 데이터 타입으로 자동 초기화된다.
	 */
	
	// 생성자 1 - 디폴트 생성자
	public void name() {
		
	}
	// 생성자 2
	public NewStudent(int grade, int classNo, int studentNo, String studentName, boolean absence) {
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}
	// 생성자 3
	public NewStudent(int classNo, int studentNo, String studentName, boolean absence) {
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}
	// 생성자 4
	public NewStudent(int classNo, int studentNo, String studentName) {
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}
	// 생성자 5
	public NewStudent(int grade, int classNo, int studentNo, String studentName) {
		super();
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	
	/*메서드*/
	public void printInfo() {
		System.out.println(grade);
		System.out.println(classNo);
		System.out.println(studentNo);
		System.out.println(studentName);
		System.out.println(absence);
	}
	
}

