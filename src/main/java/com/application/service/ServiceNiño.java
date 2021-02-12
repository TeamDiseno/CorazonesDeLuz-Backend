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
	
		
	public void deleteNiño(int id) {
		repository.deleteById(id);
		
	}
	
	
	 public niño updateNiño(niño Niño){
	
	    niño upniño = repository.findById(Niño.getDni()).orElse(null);

		 upniño.setApellido(Niño.getApellido());
		 upniño.setNombre(Niño.getNombre());
		 upniño.setEdad(Niño.getEdad());
		upniño.setCalzado(Niño.getCalzado());
		 upniño.setTalle(Niño.getTalle());
		

		return repository.save(upniño);
		}
	
	
	
}
