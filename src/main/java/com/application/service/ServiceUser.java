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
	
	
	public User updateUser(User user) {
		User upUser = repository.findById(user.getDni()).orElse(null);
		
		upUser.setApellido(user.getApellido());
		upUser.setCorreo(user.getCorreo());
		upUser.setDomicilio(user.getDomicilio());
		upUser.setNombre(user.getNombre());
		upUser.setNumTelefono(user.getNumTelefono());
		upUser.setPassword(user.getPassword());
		upUser.setUsername(user.getUsername());
		upUser.setTipoUsuario(user.getTipoUsuario());
		
		return repository.save(upUser);
	}
	
}
