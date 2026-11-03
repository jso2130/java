package com.office.calculator;

public class MainClass {

	public static void main(String[] args) {
		
		OurCalculator ourCalculator = new OurCalculator();
		
		ourCalculator.calculate(20, 10, new CalAdd());
		ourCalculator.calculate(20, 10, new CalSub());
		ourCalculator.calculate(20, 10, new CalMul());
		ourCalculator.calculate(20, 10, new CalDiv());
		                              // 외부에서 부품을 주입받는 방식 
		
	}

}
