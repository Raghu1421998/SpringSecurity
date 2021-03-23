package com.example.SpringSecurity.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.SpringSecurity.model.User;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user=userRepository.getUserbyUserName(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("Could not find User  "+username);
		}
		return new MyUserDetails(user);
	}

}
