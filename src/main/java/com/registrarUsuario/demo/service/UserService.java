package com.registrarUsuario.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registrarUsuario.demo.entity.User;
import com.registrarUsuario.demo.repository.IUserRepository;

@Service
public class UserService {

	
	@Autowired
	private IUserRepository repo;
	
	public User saveUser(User user){
		return repo.save(user);
	}
	
	
	public List<User> getAll() {
		return repo.findAll();
	}
	
	
	public void deleteUser(int id) {
		repo.deleteById(id);
	}
	
	
	public User updateUser(User user) {
		User upUser = repo.findById(user.getDni()).orElse(null);
		
		upUser.setAddress(user.getAddress());
		upUser.setEmail(user.getEmail());
		upUser.setName(user.getName());
		upUser.setPassword(user.getPassword());
		upUser.setPhone(user.getPhone());
		upUser.setUser(user.getUser());
		upUser.setTypeUser(user.getTypeUser());
		
		
		return repo.save(upUser);
	}
	
	
}
