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

import com.sunbeam.app.enums.Roles;

/**
 * @author mored
 *
 */

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="email_id")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name = "act_status")
	private boolean actStatus;
	
	@Column(name = "mobile_no")
	private String mobileNo;

	@OneToOne
	@JoinColumn(name = "role_id")
	private Role role;
	
	public User() {
		super();
	}

	public User(String username, String password, String mobileNo, Role role) {
		super();
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.role = role;
	}
	
	public static User create(String username, String password, String mobileNo, Role role){
		return new User(username,  password, mobileNo, role);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isActStatus() {
		return actStatus;
	}

	public void setActStatus(boolean actStatus) {
		this.actStatus = actStatus;
	}

	public String isMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", actStatus=" + actStatus
				+ ", mobileNo=" + mobileNo + ", role=" + role + "]";
	}
}
