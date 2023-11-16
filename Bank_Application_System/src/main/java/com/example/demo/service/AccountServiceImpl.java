package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repo;
	
	@Override
	public void registerAccount(Account a) {
		repo.save(a);
	}

	@Override
	public List<Account> getAllAccounts() {
		return repo.findAll();
	}

	@Override
	public List<Account> getUserAccount(String user, String pass) {

		return repo.findByUsernameAndPassword(user, pass);
	}

	@Override
	public Account getSingleUser(int id) {
		Account a= repo.getById(id);
		return a;
	}

	@Override
	public void updateData(Account a) {
		repo.save(a);
	}

	@Override
	public void delAccount(int id) {
		repo.deleteById(id);
	}


	@Override
	public Account getAccount(String accNo, String user, String pass) {
		return repo.findByAccNoAndUsernameAndPassword(accNo, user, pass);
	}


}
