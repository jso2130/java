package com.office.arrayex;

public class ArrayEx {

	public static void main(String[] args) {
		
		/*
		 * 배열
		 */
		
		
		
		/*
		 * 배열 선언과 초기화
		 */
		// 1. 데이터 타입 [] 배열 변수명
		int [] nembers1;        // 선언부
		numbers = {1,2,3,4,5}; // 초기화부
		
		// 2. 데이터 타입[] 배열 변수명 = new 데이터 타입 [배열의 길이]
		int[] nembers2 = new int [3];        // 빈 배열을 만드는 방법
		nembers2[0] = 1;
		nembers2[1] = 2;
		nembers2[2] = 3;
		
		// 3. 데이터 타입[] 배열 변수명 = new 데이터 타입[]{...}
		int[] numbers3 = new int[] {1,2,3,4,5};
		
		
		
		/*
		 * 배열 데이터 조회 : 인덱스를 이용
		 */
		int [] scores = {80,90,100,75,60};
		System.out.println(scores[0]);  //80
		System.out.println(scores[1]);  //90 
		System.out.println(scores[2]);  //100
		System.out.println(scores[3]);  //75
		System.out.println(scores[4]);  //60
		
		
		// 전체 데이터 조회
		 
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]: %d\n", i, scores[i]);
		}
		
		for (int scores : scores) {
			System.out.println("scores: " + scores);
		}
		
		
		
		/*
		 * 데이터 수정 : 인덱스를 이용한 재할당
		 */
		int [] points = {80,70,100,60,90};
		for (int i = 0; i < points.length; i++) {
			System.out.printf("points[%d]: %d\n", i, points[i]);  // 일단 전체 출력
		}
		points[0] = 800;  // 원하는 인덱스에 재할당
		System.out.println("points[%d]: %d\n", 0, points[0]);  // 수정된 값 출력해서 확인
		
		
		/*
		 * java의 배열 특징
		 * 1. 배열은 단일 데이터 타입만 저장 가능하다.(배열 선언할 때 정한 데이터 타입만 가능)
		 * 2. 최초 선언된 배열은 배열의 길이를 변경할 수 없다. (삭제, 추가 불가)
		 * 3. 존재하지 않는 인덱스를 이용하게 되면 에러 발생
		 */
		
		
		
		// 예제 ) 배열을 이용해 학급 학생의 시험 성적, 총점, 평균을 출력
		int [] studentScores = {80, 95, 100, 70, 68, 74, 88, 98, 100, 76};
		
		int total = 0;
		float avg = 0.0f;
		
		for (int i = 0; i < studentScores.length; i++) {
			System.out.printf("studentScores[%d] score: %d \n", i, studentScores[i]);
			
			total += studentScores[i];
			
		}
		avg = total / studentScores.length;
		
		System.out.println("total score: " + total);
		System.out.println("avg score: " + avg);
		
		
		
		// 예제 ) 값이 없는 배열의 초기값은?
		
		int [] classes = new int[5];
		
		for (int i = 0; i < classes.length; i++) {
			System.out.println(classes[i]);      //int타입의 배열이므로 0이 들어가있다
		}
		
		float [] averages = new float[5];
		
		for (float i = 0; i < averages.length; i++) {
			System.out.println(averages[i]);      //float타입의 배열이므로 0.0이 들어가있다
		}
		
		
		
		/*
		 * 배열 복사
		 */
		
		//1. 기초 데이터 타입은 값 자체를 가지고 있어 그냥 복사 가능
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1);  //10
		System.out.println(num2);  //20
		
		num2 = num1;
		System.out.println(num1);  //10
		System.out.println(num2);  //10
		
		//2. 배열은 참조 데이터 타입
		int [] nums = {1,2,3};
		int [] numsCopy = nums;    // 메모리 주소를 복사
		
		System.out.println(nums);      // 둘 다 같은 메모리 주소가 출력된다.
		System.out.println(numsCopy);  
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d]: %d \n", i, nums[i]);
			System.out.printf("numsCopy[%d]: %d \n", i, numsCopy[i]);
		}
		
		//3. 깊은 복사
		int [] nums = {1,2,3};
		int [] numsDeepCopy = new int [nums.length];   // 복사할 배열의 길이만큼의 빈 배열을 만든다  
		
		for (int i = 0; i < nums.length; i++) {
			numsDeepCopy[i] = nums[i];                 // 빈 배열에 반복문으로 복사
		}
		
		for (int i = 0; i < numsDeepCopy.length; i++) {
			System.out.printf("numsDeepCopy[%d]: %d \n", i, numsDeepCopy[i]);
		}
		
		
		
		/*
		 * 배열 삭제
		 */
		int [] myScores = {80,90,100};
		myScores = null;
		
		
		
		/*
		 * 다차원 배열
		 */
		
		//2차원 배열 (면)
		
		int [][] mns = new int [3][2];
		mns[0][0] = 1;
		mns[0][1] = 1;
		mns[1][0] = 1;
		mns[1][1] = 1;
		mns[2][0] = 1;
		mns[2][1] = 1;
		
		int [][]mns = {{1,2}, {3,4}};
		
		int [][] mmns = new int [][] {{1,2}, {3,4}};
		
		// 데이터 조회
		
		System.out.println(mns[0][0]);
		
		// 데이터 수정 
		
		mns[0][0] = 1000;
		
	}
	
}
