package com.sunbeam.app.interfaces;

import java.util.List;

import com.sunbeam.app.model.Role;

public interface RoleDao {

	public void addRole(Role p);
	public void updateRole(Role p);
	public List<Role> listRoles();
	public Role getRoleById(int id);
	public Role getRoleByName(String roleName);
	public void removeRole(int id);
}
