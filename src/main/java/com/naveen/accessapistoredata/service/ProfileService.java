package com.naveen.accessapistoredata.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.naveen.accessapistoredata.Repository.ProfileRepo;
import com.naveen.accessapistoredata.models.Profile;


@Service
public class ProfileService {

	@Autowired
	ProfileRepo repo;

	
	public boolean saveProfiles(List<Profile> profiles) {
		
		List<Profile> savedProfiles = repo.saveAll(profiles);
		
		if(savedProfiles.isEmpty())
				return false;
		
		return true;
		
	}
	
}
