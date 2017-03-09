package com.mysecurity.controllers;

import java.security.Principal;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@RequestMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}	
	
	@RequestMapping("/public/accounts/{accountNo}")
	String getPublicAccountDetails(@PathVariable String accountNo)
	{
		return "Your Public Account No is " + accountNo;
	}
	
	@RequestMapping("private/admin/accounts/{accountNo}")
	String getPrivateAdminAccountDetails(@PathVariable String accountNo)
	{
		return "Your Private  Account No is " + accountNo;
	}
	
	@RequestMapping("private/user/accounts/{accountNo}")
	String getPrivateUserAccountDetails(@PathVariable String accountNo)
	{
		return "Your Private  Account No is " + accountNo;
	}
}

