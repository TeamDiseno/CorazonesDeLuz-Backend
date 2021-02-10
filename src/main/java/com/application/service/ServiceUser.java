package com.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.repository.IRepositoryUser;
import com.domain.entity.User;

@Service
public class ServiceUser {

	@Autowired
	private IRepositoryUser repository;
	
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	
	
	public List<User> getAllUser() {
		return repository.findAll();
	}
	
	
	public void deleteUser(int id) {
		repository.deleteById(id);
	}
	
}
