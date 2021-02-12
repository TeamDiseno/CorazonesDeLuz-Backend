package com.registrarUsuario.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registrarUsuario.demo.entity.User;
import com.registrarUsuario.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	
	@PostMapping("/api")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@GetMapping("/api")
	public List<User> getAll() {
		return service.getAll();
	}
	
	
	@DeleteMapping("/api/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteUser(id);
		System.out.print("El usuario " + id + " fue borrado");
	}
	
	
	@PutMapping("/api")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	
	
}
