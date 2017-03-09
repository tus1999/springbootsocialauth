package com.mysecurity.service;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//seqrch for this username in DB and populate User object
		/*User user = repo.findByName(username);
		if (user == null) {
			return null;
		}*/
		List<GrantedAuthority> auth = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
		if (username.equals("admin")) {
			auth = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN");
		}
		if (username.equals("tushar")) {
			auth = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER,ROLE_ADMIN,ROLE_REVIEWER");
		}
		//String password = user.getPassword();
		return new org.springframework.security.core.userdetails.User(username, "mypass", auth);
	}
}
