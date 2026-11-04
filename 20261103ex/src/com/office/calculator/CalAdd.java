package com.office.calculator;

public class CalAdd implements ICalculator {

	@Override
	public int doOperator(int n1, int n2) {
		
		int result = n1 + n2;
		return result;
		
	}
	
}
