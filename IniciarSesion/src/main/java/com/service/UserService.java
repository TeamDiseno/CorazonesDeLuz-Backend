package com.service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.domain.*;
import com.repository.UserRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class UserService implements UserDetailsService{
	
	private final static String USER_NOT_FOUND = "Usuario con email %s no funciona.";
	private final UserRepository repo = null;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		return repo.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND, email)));
	}
	
}
