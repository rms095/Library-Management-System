package com.sunbeam.app.interfaces;

import java.util.List;

import com.sunbeam.app.model.UserDetails;

public interface UserDetailsDao {

	public void addUserDetails(UserDetails p);
	public void updateUserDetails(UserDetails p);
	public List<UserDetails> listUserDetails();
	public UserDetails getUserDetailsById(int id);
	public void removeUserDetails(int id);
}
