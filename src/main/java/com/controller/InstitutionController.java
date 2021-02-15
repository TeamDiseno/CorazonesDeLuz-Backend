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
import com.database.entities.InstitucionEntity;
import com.domain.entity.Institution;

@RestController
public class InstitutionController {
	
	
	@Autowired
	private InstitutionService service;
	
	@PostMapping(path = "/api/institution", consumes = "application/json", produces = "application/json")
    public String addPersona(@RequestBody Institution newInstitution) {
		InstitucionEntity institution = new InstitucionEntity();
		institution.setId(institution.getId());
		institution.setDireccion(newInstitution.getDireccion());
		institution.setNombre(newInstitution.getNombre());
        return service.saveInstitution(institution);
	}
	
	
	@GetMapping(path = "/api/institution", consumes = "application/json", produces = "application/json")
	public List<InstitucionEntity> findAll(){
		return service.getInstitutions();
	}
	
	
	@PutMapping(path = "/api/institution", consumes = "application/json", produces = "application/json")
	public InstitucionEntity update(@RequestBody Institution institution) {
		return service.updateInstitution(institution);
	}
	
	@DeleteMapping(path = "/api/institution/{id}", consumes = "application/json", produces = "application/json")
	public InstitucionEntity delete(@PathVariable int id) {
		return service.deleteInstitution(id);
	}
	

}
