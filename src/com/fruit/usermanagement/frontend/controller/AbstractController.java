package com.fruit.usermanagement.frontend.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.fruit.usermanagement.backend.service.IUserManagementService;

public abstract class AbstractController {

	protected final Logger logger = Logger.getLogger( getClass() );
	
	@Autowired
	private IUserManagementService iUserManagementService;

	public IUserManagementService getiUserManagementService() {
		return iUserManagementService;
	}

	public void setiUserManagementService( IUserManagementService iUserManagementService ) {
		this.iUserManagementService = iUserManagementService;
	}
}
