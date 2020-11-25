package com.naveen.accessapistoredata.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.naveen.accessapistoredata.models.Profile;
import com.naveen.accessapistoredata.models.RequestObject;

@Service
@FeignClient(name="fakeJSON-API", url = "http://app.fakejson.com")
public interface  ApiServiceProxy {
	
	@PostMapping(value="/q")
	public 	List<Profile> getProfiles(@RequestBody  RequestObject  request);

}
