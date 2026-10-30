package com.office.ex;

import java.util.Scanner;

/*
 * 월급 지급 명령을 내리는 클래스 
 */

public class PayController {
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		/*과제*/
		while (true) {
			
			System.out.println("월 정보를 입력하세요");
			int thisMonth = scanner.nextInt();
			
			PayService payService = new PayService();
			payService.pay(thisMonth);
			
		}
		
//		scanner.close();
	}

}
