package com.cookingtime.cooking.model;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;

import com.cookingtime.cooking.constant.AccountStatus;
import com.cookingtime.cooking.constant.AccountType;


public class Account {

	@Size(min=4, max=30)
	@Indexed(unique = true)
	private String username;
	
	@Size(min=5, max=30)
	private String password;
	
	@Transient
	private String confirmPassword;
	
	private AccountType type;
	
	private AccountStatus status;
	
	
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}
}
