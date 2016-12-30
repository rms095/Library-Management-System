/**
 * 
 */
package com.sunbeam.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunbeam.app.interfaces.UserDetailsDao;
import com.sunbeam.app.model.UserDetails;

/**
 * @author mored
 *
 */
@Repository
public class UserDetailsDaoImpl implements UserDetailsDao {

	private static final Logger logger = LoggerFactory.getLogger(UserDetailsDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUserDetails(UserDetails userDetails) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(userDetails);
	}

	@Override
	public void updateUserDetails(UserDetails userDetails) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(userDetails);
	}

	@Override
	public List<UserDetails> listUserDetails() {
		Session session = this.sessionFactory.getCurrentSession();
		List<UserDetails> userDetailsList = session.createQuery("from userDetails").list();
		return userDetailsList;
	}

	@Override
	public UserDetails getUserDetailsById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		UserDetails userDetails = (UserDetails) session.load(UserDetails.class, new Integer(id));
		return userDetails;
	}

	@Override
	public void removeUserDetails(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		UserDetails userDetails = (UserDetails) session.load(UserDetails.class, new Integer(id));
		if(null != userDetails){
			session.delete(userDetails);
		}
	}

}
