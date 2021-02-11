package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.application.service.ServiceUser;
import com.domain.entity.User;

@Controller
public class ControllerUser {

	
	@Autowired
	private ServiceUser service;
	
	
	@PostMapping("/api")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	
	@GetMapping("/api")
	public List<User> getUser(){
		return service.getAllUser();
	}
	
	
	@DeleteMapping("/api")
	public void deleteUser(int id) {
		System.out.print("El usuario de "+id+" Fue eliminado");
		service.deleteUser(id);
	}
	
	
	@PutMapping("/api")
	public User updateUser(User user) {
		return service.updateUser(user);
	}
	
}
