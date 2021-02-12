package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



import com.domain.entity.niño;
import com.application.service.ServiceNiño;


@Controller
public class ControllerNiño {
	
	@Autowired
	private ServiceNiño serviceN;
	
	@PostMapping("/api")
    public niño addPersona(@RequestBody niño Niño) {
        return serviceN.saveNiño(Niño);
	}

	@GetMapping("/api")
	public List<niño> findAll(){
		return serviceN.getniño();
	}
	
	
	@PutMapping("/api")
	public niño update(@RequestBody niño Niño) {
		return serviceN.updateniño(Niño);
	}
	
	@DeleteMapping("/api/{id}")
	public niño delete(@PathVariable int id) {
		return serviceN.deleteniño(id);
	}
	

}
