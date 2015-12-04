package com.cookingtime.cooking.model;


import java.util.Set;
import java.util.TreeSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cookingtime.cooking.constant.DbStatus;

@Document(collection = "User")
@TypeAlias("user")
public class User {
	
	@Id
	private String accountId;

	@DBRef
	private Contact contact;
	
	private DbStatus dbStatus;
	
	private Set<String> favouriteReceiptsIds = new TreeSet<String>();

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public DbStatus getDbStatus() {
		return dbStatus;
	}

	public void setDbStatus(DbStatus dbStatus) {
		this.dbStatus = dbStatus;
	}

	public Set<String> getFavouriteReceiptsIds() {
		return favouriteReceiptsIds;
	}

	public void setFavouriteReceiptsIds(Set<String> favouriteReceiptsIds) {
		this.favouriteReceiptsIds = favouriteReceiptsIds;
	}
	
	
}
