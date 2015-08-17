package com.fruit.usermanagement.frontend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fruit.usermanagement.backend.bean.Facility;

@Controller
@RequestMapping("/facility")
public class FacilityController extends AbstractController{

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus( HttpStatus.OK )	
	public List<Facility> getFacilityList() {
		
		List<Facility> facilityList = new ArrayList<Facility>();
		for( Facility facility : getiUserManagementService().getAllFacilities() ) {
			if (facility != null) {
				facilityList.add(facility);
			}
		}
		
		return facilityList;
	}
	
}

//@Controller
//@RequestMapping("/facility")
//public class FacilityController extends AbstractController{
//
//	@RequestMapping(value = "/home", method = RequestMethod.GET)
//	@ResponseStatus( HttpStatus.OK )
//	public ModelAndView home() {
//		
//		ModelAndView modelAndView = new ModelAndView( "FacilityHome" ); //this will map to jsp file
//		
//		modelAndView.addObject( "facilities", getiUserManagementService().getAllFacilities() );	//the parameter "users" will be passed to Home.jsp
//		
//		return modelAndView;
//		
//	}
//	
//	@RequestMapping( value = "/edit", method = RequestMethod.GET )
//	@ResponseStatus( HttpStatus.OK )
//	public ModelAndView edit( @RequestParam Long id ) {	//@RequestParam maps java code's id to url's id
//		
//		ModelAndView modelAndView = new ModelAndView( "EditFacility" );
//		
//		modelAndView.addObject( "facility", getiUserManagementService().getFacilityById( id ) );
//		
//		modelAndView.addObject( "users", getiUserManagementService().getUsersByFacility( id ) );
//		
//		return modelAndView;
//		
//	}
//	
//	@RequestMapping( value = "/save", method = RequestMethod.POST )
//	public ModelAndView edit( @ModelAttribute Facility facility ) {	//@ModelAttribute gets data from webpage 
//		
//		getiUserManagementService().saveFacility( facility );
//		return home();
//		
//	}
//	
//	@RequestMapping( value = "/delete", method = RequestMethod.GET )
//	@ResponseStatus( HttpStatus.OK )
//	public ModelAndView delete( @RequestParam Long id ) {	//@ModelAttribute gets data from webpage 
//		
//		getiUserManagementService().deleteFacility( id );
//		return home();
//		
//	}
//}

