package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Account;

@Service
public class AccountService {
	
	List<Account> accounts= new ArrayList<>();
	
	public int addAccount(Account account) {
	
		accounts.add(account);
		return account.getAccountID();
		
	}

	public Account getAccountByID(Integer accountId) {
		Optional<Account>account=Optional.ofNullable(accounts.stream()
		.filter(acc-> acc.getAccountID().equals(accountId))
		.findFirst()
		.orElse(null));
		
		if(account.isPresent()) {
			return account.get();
		}
		return new Account();

	}

}
