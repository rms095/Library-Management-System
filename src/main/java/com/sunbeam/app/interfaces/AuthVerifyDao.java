package com.sunbeam.app.interfaces;

import java.util.List;

import com.sunbeam.app.model.AuthVerify;

public interface AuthVerifyDao {

	public void addAuthVerify(AuthVerify p);
	public void updateAuthVerify(AuthVerify p);
	public List<AuthVerify> listAuthVerifys();
	public AuthVerify getAuthVerifyById(int id);
	public void removeAuthVerify(int id);
}
