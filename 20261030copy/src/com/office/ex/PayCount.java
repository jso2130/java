package com.office.ex;

public class PayCount {

	private int cnt = 0;
	private static PayCount paycount = null;
	
	private PayCount() {
		
	}
	
	public static PayCount getPayCountInstance() {
		
		if (paycount == null)
			paycount = new PayCount();
		
		return paycount;
		
	}

	public int getCnt() {
		
		return cnt;
		
	}

	public void setCnt() {
		
		this.cnt++;
		
	}
	
	
	
}
