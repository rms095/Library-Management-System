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

import com.sunbeam.app.interfaces.AuthVerifyDao;
import com.sunbeam.app.model.AuthVerify;

/**
 * @author mored
 *
 */
@Repository
public class AuthVerifyImpl implements AuthVerifyDao {

	private static final Logger logger = LoggerFactory.getLogger(AuthVerifyImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
	/* (non-Javadoc)
	 * @see com.sunbeam.app.dao.AuthVerifyDao#addAuthVerify(com.sunbeam.app.model.AuthVerify)
	 */
	@Override
	public void addAuthVerify(AuthVerify p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
	}

	/* (non-Javadoc)
	 * @see com.sunbeam.app.dao.AuthVerifyDao#updateAuthVerify(com.sunbeam.app.model.AuthVerify)
	 */
	@Override
	public void updateAuthVerify(AuthVerify p) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.sunbeam.app.dao.AuthVerifyDao#listAuthVerifys()
	 */
	@Override
	public List<AuthVerify> listAuthVerifys() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.sunbeam.app.dao.AuthVerifyDao#getAuthVerifyById(int)
	 */
	@Override
	public AuthVerify getAuthVerifyById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.sunbeam.app.dao.AuthVerifyDao#removeAuthVerify(int)
	 */
	@Override
	public void removeAuthVerify(int id) {
		// TODO Auto-generated method stub

	}

}
