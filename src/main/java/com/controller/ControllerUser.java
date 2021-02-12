package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.service.ServiceUser;
import com.domain.entity.User;


@RestController
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
	
	
	@DeleteMapping("/api/{id}")
	public void deleteUser(@PathVariable int id) {
		//sSystem.out.print("El usuario de "+id+" Fue eliminado");
		service.deleteUser(id);
	}
	
	
	@PutMapping("/api")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
}
