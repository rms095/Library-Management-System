/**
 * 
 */
package com.sunbeam.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author mored
 *
 */

@Entity
@Table(name="auth_verify")
public class AuthVerify {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "verify_email")
	private boolean verifyEmail;

	@Column(name = "email_token")
	private boolean emailToken;

	@Column(name = "verify_sms")
	private boolean verifyMobile;

	@Column(name = "sms_token")
	private boolean smsToken;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(boolean verifyEmail) {
		this.verifyEmail = verifyEmail;
	}

	public boolean isEmailToken() {
		return emailToken;
	}

	public void setEmailToken(boolean emailToken) {
		this.emailToken = emailToken;
	}

	public boolean isVerifyMobile() {
		return verifyMobile;
	}

	public void setVerifyMobile(boolean verifyMobile) {
		this.verifyMobile = verifyMobile;
	}

	public boolean isSmsToken() {
		return smsToken;
	}

	public void setSmsToken(boolean smsToken) {
		this.smsToken = smsToken;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "AuthVerify [id=" + id + ", verifyEmail=" + verifyEmail + ", emailToken=" + emailToken
				+ ", verifyMobile=" + verifyMobile + ", smsToken=" + smsToken + ", user=" + user + "]";
	}
}
