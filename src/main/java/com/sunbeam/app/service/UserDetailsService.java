/**
 * 
 */
package com.sunbeam.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.app.dao.UserDetailsDaoImpl;
import com.sunbeam.app.model.UserDetails;

/**
 * @author mored
 *
 */

@Service
public class UserDetailsService {

	private static final Logger logger = LoggerFactory.getLogger(UserDetailsService.class);

	@Autowired
	private UserDetailsDaoImpl userDetailsDaoImpl;
	
	@Transactional
	public void addUserDetails(UserDetails userDetails) {
		userDetailsDaoImpl.addUserDetails(userDetails);
	}

	@Transactional
	public void updateUserDetails(UserDetails userDetails) {
		userDetailsDaoImpl.updateUserDetails(userDetails);
	}

	@Transactional
	public List<UserDetails> listUserDetails() {
		return userDetailsDaoImpl.listUserDetails();
	}

	@Transactional
	public UserDetails getUserDetailsById(int id) {
		return userDetailsDaoImpl.getUserDetailsById(id);
	}

	@Transactional
	public void removeUserDetails(int id) {
		userDetailsDaoImpl.removeUserDetails(id);
	}
}
