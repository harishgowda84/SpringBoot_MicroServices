package com.harishgowda84.profile;

import java.util.List;

public interface ProfileRepository {
	List<Profile> getAllProfiles();
	Profile getProfile(String userId);
}