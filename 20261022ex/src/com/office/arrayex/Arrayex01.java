package com.office.arrayex;

public class Arrayex01 {

	public static void main(String[] args) {
		
		/*
		 * 예제 ) 배열로 데이터 구조화 하기
		 */
		
		int[][] scores = {
			{85,90,90},  //1학기 성적들
			{90,80,85},  //2학기 성적들
			{90,90,100}, //3학기 성적들
			{95,85,100}  //4학기 성적들
		}
		
		// 데이터 조회
		
		for (int i = 0; i < scores.length; i++) {
			
			int [] temp = scores[i];     // 1차 배열
			
			for (int j = 0; j < temp.length; i++) {
				
				String str = "";
				switch (j) {
				case 0: //국어
					str = "국어";
					break;
				case 1: //영어
					str = "영어";
					break;
				case 2: //수학
					str = "수학";
					break;

				}
				
				System.out.printf("%d학기 %s 점수: %d\n", (i+1), str, temp[j]);
				
			}
			
		}
		
	}
	
}
