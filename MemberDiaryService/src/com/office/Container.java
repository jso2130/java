package com.office;

import com.office.member.MemberController;
import com.office.member.MemberDao;
import com.office.member.MemberService;
import com.office.session.Session;

public class Container {
	
	final private MemberDao dao = new MemberDao();
	final private Session session = new Session();
	final private MemberService service = new MemberService(dao); 
	final private MemberController controller = new MemberController(service, session); 
	
	private static Container container;
	
	private Container() {}
	
	private static Container getInstance() {
		
		if (container == null) {
			
			container = new Container();
			
		}
		
		return container;
		
	}

	public MemberDao getDao() {
		return dao;
	}

	public MemberService getService() {
		return service;
	}

	public MemberController getController() {
		return controller;
	}
	
}
