package com.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.database.entities.TableNiño;
import com.database.repository.IRepositoryNiño;

import com.domain.entity.niño;

@Service
public class ServiceNiño {
	
	@Autowired
	private IRepositoryNiño repository;
	
	public String saveNiño(TableNiño Niño) {
	repository.save(Niño);
	return ("La nueva institucion fue registrada");
}
	public List<TableNiño> getNiño(){
		return repository.findAll();
	}
	public TableNiño deleteNiño(int id) {
		TableNiño NiñoToDelete = repository.findById(id).orElse(null);
		repository.delete(NiñoToDelete);
		return NiñoToDelete;
	}
	public TableNiño updateNiño(niño Niño){
		TableNiño NiñoToUpdate = repository.findById(Niño.getId()).orElse(null);
		NiñoToUpdate.setApellido(Niño.getApellido());
		NiñoToUpdate.setNombre(Niño.getNombre());
		NiñoToUpdate.setDni(Niño.getDni());
		NiñoToUpdate.setEdad(Niño.getEdad());
		NiñoToUpdate.setTalle(Niño.getTalle());
		NiñoToUpdate.setCalzado(Niño.getCalzado());
		repository.save(NiñoToUpdate);
		return NiñoToUpdate;
		
		
	}
			
	
	

	
	
	
	
}
