package com.cookingtime.cooking.constant;

public enum AccountType {

	USER("accounttype.user", "user"),
	ADMIN("accounttype.user", "user");
	
	private String code;
	private String value;
	
	private AccountType(String code, String value){
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
