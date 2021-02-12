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
import com.application.service.InstitutionService;
import com.database.repository.InstitucionEntity;
import com.domain.entity.Institution;

@RestController
public class InstitutionController {
	
	
	@Autowired
	private InstitutionService service;
	
	@PostMapping("/api/institution")
    public String addPersona(@RequestBody Institution newInstitution) {
		InstitucionEntity institution = new InstitucionEntity();
		institution.setId(institution.getId());
		institution.setDireccion(newInstitution.getDireccion());
		institution.setEncargado(newInstitution.getEncargado());
		institution.setNombre(newInstitution.getNombre());
        return service.saveInstitution(institution);
	}
	
	
	@GetMapping("/api/institution")
	public List<InstitucionEntity> findAll(){
		return service.getInstitutions();
	}
	
	
	@PutMapping("/api/institution")
	public InstitucionEntity update(@RequestBody Institution institution) {
		return service.updateInstitution(institution);
	}
	
	@DeleteMapping("/api/institution/{id}")
	public InstitucionEntity delete(@PathVariable int id) {
		return service.deleteInstitution(id);
	}
	

}
