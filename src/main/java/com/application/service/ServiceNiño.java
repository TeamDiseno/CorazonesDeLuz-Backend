package com.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.repository.IRepositoryNiño;
import com.domain.entity.niño;

@Service
public class ServiceNiño {
	
	@Autowired
	private IRepositoryNiño repository;
	
	
	public niño saveNiño(niño Niño) {
		return repository.save(Niño);
	}

	public List<niño> getniño(){
		return repository.findAll();
	}
	
		
	public niño deleteniño(int id) {
		niño n = repository.findById(id).orElse(null);
		repository.delete(n);
		return n;
	}
	
	
	public niño updateniño(niño Niño){
		//nose que fallo ahi
		niño upniño = repository.findById(niño.getDni()).orElse(null);

		upniño.setApellido(niño.getApellido());
		upniño.setNombre(niño.getNombre());
		upniño.setEdad(niño.getEdad());
		upniño.setCalzado(niño.getCalzado());
		upniño.setTalle(niño.getTalle());
		

		return repository.save(upniño);
	}
	
	
	public void deletePerson(niño Niño){
		repository.deleteById(Niño.getId());
	}
	
	
}
