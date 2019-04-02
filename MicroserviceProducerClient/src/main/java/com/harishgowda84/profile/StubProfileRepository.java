package com.harishgowda84.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class StubProfileRepository implements ProfileRepository {
	
	private Map<String, Profile> profileData = new HashMap<String, Profile>();
	
	public StubProfileRepository() {
		Profile profile = new Profile("8767", "Jim");
		profileData.put("8767", profile);
		profile = new Profile("7896", "Tim");
		profileData.put("7896", profile);
		profile = new Profile("2345", "Jane");
		profileData.put("2345", profile);
	}
	
	@Override
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profileData.values());
	}

	@Override
	public Profile getProfile(String userId) {
		return profileData.get(userId);
	}

}