/**
 * 
 */
package com.sunbeam.app.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunbeam.app.interfaces.RoleDao;
import com.sunbeam.app.model.Person;
import com.sunbeam.app.model.Role;
import com.sunbeam.app.model.User;

/**
 * @author mored
 *
 */
@Repository
public class RoleDaoImpl implements RoleDao {
	
	private static final Logger logger = LoggerFactory.getLogger(RoleDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addRole(Role role) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(role);
	}

	@Override
	public void updateRole(Role role) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(role);
	}

	@Override
	public List<Role> listRoles() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Role> roleList = session.createQuery("from role").list();
		return roleList;
	}

	@Override
	public Role getRoleById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Role role = (Role) session.load(Role.class, new Integer(id));
		return role;
	}

	@Override
	public void removeRole(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Role role = (Role) session.load(Role.class, new Integer(id));
		if(null != role){
			session.delete(role);
		}
	}
	
	@Override
	public Role getRoleByName(String roleName){
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Role.class);
        criteria.add(Restrictions.like("role_name", roleName));
        return (Role) criteria.uniqueResult();
	}

}
