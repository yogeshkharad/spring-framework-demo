package com.example.demo.model;

import java.math.BigDecimal;

public class Account {

	private Integer accountID;
	public Account() {
		super();
	}
	private String accountName;
	private BigDecimal balance;
	private String accountType;
	
	public Integer getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public Account(int accountID, String accountName, BigDecimal balance, String accountType) {
		super();
		this.accountID = accountID;
		this.accountName = accountName;
		this.balance = balance;
		this.accountType = accountType;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}
