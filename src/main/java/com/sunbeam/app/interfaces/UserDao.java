package com.sunbeam.app.interfaces;

import java.util.List;

import com.sunbeam.app.model.User;

public interface UserDao {

	public void addUser(User user);
	public void updateUser(User user);
	public List<User> listUsers();
	public User getUserById(int id);
	public void removeUser(int id);
	public User getUserByUsername(String username);
}
