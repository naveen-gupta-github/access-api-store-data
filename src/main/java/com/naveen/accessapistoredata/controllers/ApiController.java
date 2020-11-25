package com.naveen.accessapistoredata.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.accessapistoredata.service.ApiServiceProxy;
import com.naveen.accessapistoredata.service.ProfileService;
import com.naveen.accessapistoredata.models.Profile;
import com.naveen.accessapistoredata.models.RequestObject;


@RestController   						//Use of @Controller  would need a ViewResolver i.e. an UI.  Thymleaf is a work around for that
public class ApiController {

	@Autowired
	ApiServiceProxy proxy;
	
	@Autowired
	ProfileService profileService;
	
	@GetMapping("/profiles")
	public List<Profile> loadProfiles(){
		
	        return proxy.getProfiles(new RequestObject());
	
	}
	
	@GetMapping("/SaveProfiles")    //using GetMapping so to run this in browser, PostMapping makes much more sense here
	public String  saveProfiles(){
		
	        List<Profile> profiles =  proxy.getProfiles(new RequestObject());
	        
	        boolean isSuccess = profileService.saveProfiles(profiles);
	        
	        if(isSuccess)
	        	return "Done";
	        
	        return null;
	
	}
	
	
	
}
