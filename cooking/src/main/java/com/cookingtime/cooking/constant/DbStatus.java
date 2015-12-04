package com.cookingtime.cooking.constant;

public enum DbStatus {
	ACTIVE("active"),
	DELETED("deleted");
	
	private String value;
	
	private DbStatus(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
