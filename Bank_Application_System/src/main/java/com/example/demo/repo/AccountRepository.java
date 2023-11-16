package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	List<Account> findByUsernameAndPassword(String user, String pass);

	Account findByAccNoAndUsernameAndPassword(String accNo, String user, String pass);

}
