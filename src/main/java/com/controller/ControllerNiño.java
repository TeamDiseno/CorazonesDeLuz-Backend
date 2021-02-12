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


import com.domain.entity.niño;
import com.application.service.ServiceNiño;


@RestController
public class ControllerNiño {
	
	@Autowired
	private ServiceNiño serviceN;
	
	@PostMapping("/api/Niño/add")
    public niño addPersona(@RequestBody niño Niño) {
        return serviceN.saveNiño(Niño);
	}

	@GetMapping("/api/Niño/findAll")
	public List<niño> findAll(){
		return serviceN.getniño();
	}
	
	
	@PutMapping("/api/Niño/update")
	public niño update(@RequestBody niño Niño) {
		return serviceN.updateniño(Niño);
	}
	
	@DeleteMapping("/api/Niño/delete/{id}")
	public niño delete(@PathVariable int id) {
		return serviceN.deleteniño(id);
	}
	

}
