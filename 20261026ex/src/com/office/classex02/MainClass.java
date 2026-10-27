package com.office.classex02;

public class MainClass {

	public static void main(String[] args) {
		
		/*속성 접근*/
		Student student1 = new Student("홍길동", 1, 20, "Computer");
		Student student2 = new Student("박찬호", 1, 21, "Sports");
		
		System.out.println("Name: " + student1.name);
		System.out.println("Grade: " + student1.grade);
		System.out.println("Age: " + student1.age);
		System.out.println("Major: " + student1.major);
		
		System.out.println("Name: " + student2.name);
		System.out.println("Grade: " + student2.grade);
		System.out.println("Age: " + student2.age);
		System.out.println("Major: " + student2.major);
		
		/*기능 접근*/
		student1.printInfo();
		student2.printInfo();
		
	}

}
