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


import com.database.entities.TableNiño;
import com.domain.entity.niño;
import com.application.service.ServiceNiño;


@RestController
public class ControllerNiño {
	
	@Autowired
	private ServiceNiño serviceN;
	
	@PostMapping(path = "/api/niño", consumes = "application/json", produces = "application/json")
    public String addNiño(@RequestBody niño newNiño) {
		TableNiño Niño = new TableNiño();
		Niño.setId(Niño.getId());
		Niño.setNombre(Niño.getNombre());
		Niño.setApellido(Niño.getApellido());
		Niño.setDni(Niño.getDni());
		Niño.setCalzado(Niño.getCalzado());
		Niño.setTalle(Niño.getTalle());
        return serviceN.saveNiño(Niño);
	}
	
	@GetMapping(path = "/api/niño", consumes = "application/json", produces = "application/json")
	public List<TableNiño> findAll(){
		return serviceN.getNiño();
	}
	
	@PutMapping(path = "/api/niño", consumes = "application/json", produces = "application/json")
	public TableNiño update(@RequestBody niño Niño) {
		return serviceN.updateNiño(Niño);
	}
	
	@DeleteMapping(path = "/api/niño/{id}", consumes = "application/json", produces = "application/json")
	public TableNiño delete(@PathVariable int id) {
		return serviceN.deleteNiño(id);
	}
	

}
