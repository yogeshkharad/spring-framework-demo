package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping(value="/api")
public class AccountController {
	
	@Autowired
	AccountService accountservice;
	
	@PostMapping(path="/accounts")
	public ResponseEntity<String> addAccount(@RequestBody Account account) {
		accountservice.addAccount(account);
		return ResponseEntity.ok("Account Added successfully");
	}

	@GetMapping("/accounts/{accountId}")
	public Account getAccountById(@PathVariable Integer accountId) {
		return accountservice.getAccountByID(accountId);
	}
}
