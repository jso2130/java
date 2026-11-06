package com.office.session;

public class Session {
	
	private String sessionId;
	
	private static Session session;
	

	private  Session() {}
	
	
	public static getSessionInsertance() {
		
		if (session == null) {
			
			session = new Session();
			
		}
		
		return session;
		
	}
	
	public String getSessionId() {
		
		return sessionId;
		
	}

	public void setSessionId(String sessionId) {
		
		this.sessionId = sessionId;
	
	}

}
