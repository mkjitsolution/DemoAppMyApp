package com.cg.myapp.controller;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import com.cg.myapp.bean.Account;

public class AccountController {

	public Account createAccount(int id,String name,int balance)
	{
		return new Account(id, name, balance);
	}
	
	public int getBalance(Account a)
	{
		return a.getAccountBalance();
	}
	
	
}//end class
