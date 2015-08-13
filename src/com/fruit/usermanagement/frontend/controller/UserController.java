package com.fruit.usermanagement.frontend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.fruit.usermanagement.backend.bean.User;

@Controller
@RequestMapping( "/user" )
public class UserController extends AbstractController{

	@RequestMapping( value = "/home", method = RequestMethod.GET )
	@ResponseStatus( HttpStatus.OK )
	public ModelAndView home() {
		
		ModelAndView modelAndView = new ModelAndView( "UserHome" ); //this will map to jsp file
		
		modelAndView.addObject( "users", getiUserManagementService().getAllUsers() );	//the parameter "users" will be passed to Home.jsp
		
		return modelAndView;
		
	}
	
	@RequestMapping( value = "/edit", method = RequestMethod.GET )
	@ResponseStatus( HttpStatus.OK )
	public ModelAndView edit( @RequestParam Long id ) {	//@RequestParam maps java code's id to url's id
		
		ModelAndView modelAndView = new ModelAndView( "EditUser" );
		
		modelAndView.addObject( "user", getiUserManagementService().getUser( id ) );
		modelAndView.addObject( "facilities", getiUserManagementService().getAllFacilities() );
		
		return modelAndView;
		
	}
	
	@RequestMapping( value = "/save", method = RequestMethod.POST )
	public ModelAndView edit( @ModelAttribute User user ) {
		
		getiUserManagementService().saveUser( user );
		
		return home();
		
	}


}
