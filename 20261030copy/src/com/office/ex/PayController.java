package com.office.ex;

import java.util.Scanner;

public class PayController {
	
	Scanner scanner = new Scanner(System.in);
	PayService payService = new PayService();

	public void execute() {
		
		while(true) {
			
			System.out.println("월 정보를 입력하세요");
			int thisMonth = scanner.nextInt();
			
			if (thisMonth >= 1 && thisMonth <= 12) {
				
				payService.pay(thisMonth);
				break;
				
			} else {
				
				System.out.println("잘못입력하셨습니다.");
				
			}
		}
	
		scanner.close();
		
	}
	
}
