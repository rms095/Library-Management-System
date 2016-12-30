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

import com.sunbeam.app.dao.RoleDaoImpl;
import com.sunbeam.app.model.Role;

/**
 * @author mored
 *
 */

@Service
public class RoleService {

	private static final Logger logger = LoggerFactory.getLogger(RoleService.class);

	@Autowired
	private RoleDaoImpl roleDaoImpl;
	
	@Transactional
	public void addRole(Role role) {
		roleDaoImpl.addRole(role);
	}

	@Transactional
	public void updateRole(Role role) {
		roleDaoImpl.updateRole(role);
	}

	@Transactional
	public List<Role> listRole() {
		return roleDaoImpl.listRoles();
	}

	@Transactional
	public Role getRoleById(int id) {
		return roleDaoImpl.getRoleById(id);
	}

	@Transactional
	public Role getRoleByName(String roleName){
		return roleDaoImpl.getRoleByName(roleName);
	}
	
	@Transactional
	public void removeRole(int id) {
		roleDaoImpl.removeRole(id);
	}
}
