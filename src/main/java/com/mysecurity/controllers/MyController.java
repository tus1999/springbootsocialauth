package com.mysecurity.controllers;
import java.util.Date;
import java.util.Map;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/loginpage")
	String login(Map<String, Object> model)
	{
		return "loginpage";
	}
	
	@RequestMapping("/welcome")
	String welcome(Map<String, Object> model)
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		String authorities = auth.getAuthorities().toString();
		
		model.put("username", username);
		model.put("role", authorities);
		return "welcome";
	}

	@RequestMapping("/")
	@Secured({"ROLE_ADMIN","ROLE_REVIEWER","ROLE_USER"})
	public String home(Map<String, Object> model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		//String username = (String) auth.getPrincipal().toString();
		//String password = auth.getCredentials().toString();
		String authorities = auth.getAuthorities().toString();
		
		model.put("message", "Hello World");
		model.put("title", "Hello Home");
		model.put("date", new Date());
		model.put("username", username);
		//model.put("password", password);
		model.put("role", authorities);
		return "welcome";
	}
	
}
