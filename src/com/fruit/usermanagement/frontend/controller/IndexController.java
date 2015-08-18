package com.fruit.usermanagement.frontend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fruit.usermanagement.backend.bean.Facility;

/**
 * Created by shian_mac on 8/16/15.
 */


@RestController
@RequestMapping("/data")
public class IndexController extends AbstractController{
  
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus( HttpStatus.OK )	
	@ResponseBody
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
