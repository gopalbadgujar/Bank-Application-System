package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Account;

public interface AccountService {

	void registerAccount(Account a);

	List<Account> getAllAccounts();

	List<Account> getUserAccount(String user, String pass);

	Account getSingleUser(int id);

	void updateData(Account a);

	void delAccount(int id);

	Account getAccount(String accNo, String user, String pass);
	
//	Account displayBalance(String accNo, String user, String pass);
//
//	Account depositeService(String accNo, String user, String pass);
//
//	Account withdrawService(String accNo, String user, String pass);

}
