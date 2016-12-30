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

import com.sunbeam.app.interfaces.UserDao;
import com.sunbeam.app.model.User;

/**
 * @author mored
 *
 */

@Service
public class UserService {

	private static final Logger logger = LoggerFactory.getLogger(RoleService.class);

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Transactional
	public List<User> listUser() {
		return userDao.listUsers();
	}

	@Transactional
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	
	@Transactional
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	@Transactional
	public void removeUser(int id) {
		userDao.removeUser(id);
	}
}
