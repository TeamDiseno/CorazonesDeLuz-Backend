package com.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.entities.InstitucionEntity;
import com.database.repository.IInstitutionRepository;
import com.domain.entity.Institution;



@Service
public class InstitutionService {
	
	@Autowired
	IInstitutionRepository repository;

	public String saveInstitution(InstitucionEntity newInstitution) {;
		repository.save(newInstitution);
		return ("La nueva institucion fue registrada");
	}
	
	
	public List<InstitucionEntity> getInstitutions(){
		return repository.findAll();
	}
	
	public InstitucionEntity deleteInstitution(int id) {
		InstitucionEntity institutionToDelete = repository.findById(id).orElse(null);
		repository.delete(institutionToDelete);
		return institutionToDelete;
	}
	
	public InstitucionEntity updateInstitution(Institution institution){
		InstitucionEntity institutionToUpdate = repository.findById(institution.getId()).orElse(null);
		institutionToUpdate.setDireccion(institution.getDireccion());
		institutionToUpdate.setNombre(institution.getNombre());
		repository.save(institutionToUpdate);
		return institutionToUpdate;
	}
	
}
