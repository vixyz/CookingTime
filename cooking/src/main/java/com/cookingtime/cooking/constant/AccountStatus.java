package com.cookingtime.cooking.constant;

import com.cookingtime.cooking.util.Translatable;

public enum AccountStatus implements Translatable{

	PENDING("status.pending", "pending"),
	CONFIRMED("status.confirmed", "confirmed"),
	ACTIVE("status.active", "active"),
	SUSPENDED("status.suspended", "suspended");
	
	private String code;
	private String value;
	
	private AccountStatus(String code, String value){
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return this.code;
	}

	public String getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
