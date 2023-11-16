package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@Controller
public class BankAppSystem {

	
	@Autowired
	private AccountService service;

	@RequestMapping(value = "/")
	public String homePageCalled() {

		return "index";
	}

	@RequestMapping(value = "reg", method = RequestMethod.POST)
	public String registerDetails(@ModelAttribute Account a, Model m) {

		System.out.println(a);
		service.registerAccount(a);

		return "index";
	}
	
	@RequestMapping(value = "/log", method = RequestMethod.POST)
	public String loginCredential(@RequestParam String username,
			@RequestParam String password, Model m) {

		if (username.equals("Admin") && password.equals("admin@123")) {
			
			List<Account> listAcc = service.getAllAccounts();
			m.addAttribute("listAcc", listAcc);
			return "details";
		} else {
			List<Account> listAcc = service.getUserAccount(username, password);
			
			for(Account al:listAcc) {
				
				if(listAcc != null && username.equals(al.getUsername()) && password.equals(al.getPassword() )) {
					
					m.addAttribute("listAcc", listAcc);
					return "details";
				}
			}		
		}
		String str = "You have entered wrong Credentials, Try again...";
		m.addAttribute("str",str);
		return "index"; 
	}

	@RequestMapping(value = "edit")
	public String editAction(@RequestParam int id, Model m) {

		Account a = service.getSingleUser(id);
		m.addAttribute("account", a);
		return "edit";
	}

	@RequestMapping(value = "up")
	public String updateAction(@ModelAttribute Account a) {

		service.updateData(a);
		return "index";
	}

	@RequestMapping(value = "del")
	public String deleteAction(@RequestParam int id, Model m) {

		service.delAccount(id);

		return "index";
	}

	@RequestMapping(value = "balance", method = RequestMethod.POST)
	public String balance(@RequestParam String accNo, @RequestParam String username, @RequestParam String password,
			Model m) {
		System.out.println("check balance : "+accNo + "   "+ username+"  "+password  );
		Account account = service.getAccount(accNo, username, password);
		m.addAttribute("bal", account);
		return "successbalance";
	}

	@RequestMapping(value = "deposit",method = RequestMethod.POST)
	public String deposit(@RequestParam String accNo, @RequestParam String username, @RequestParam String password,
			@RequestParam double depositMoney, Model m) {
		Account account = service.getAccount(accNo, username, password);
		account.setInitialBalance(account.getInitialBalance()+ depositMoney); 
		service.registerAccount(account);
		m.addAttribute("accDepositMoney", account);
		return "successdeposit";
	}

	@RequestMapping(value = "withdraw", method = RequestMethod.POST)
	public String withdrawService(@RequestParam String accNo,@RequestParam String username, @RequestParam String password, @RequestParam double withdrawMoney, Model m) {
		
		Account account = service.getAccount(accNo, username, password);
		account.setInitialBalance(account.getInitialBalance() - withdrawMoney);
		service.registerAccount(account);
		m.addAttribute("acc", account);
		return "successwithdraw";
	}
	
}
