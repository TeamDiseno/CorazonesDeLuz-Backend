package com.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.repository.IRepositoryEvent;
import com.domain.entity.Event;

@Service
public class EventService {

	@Autowired
	private IRepositoryEvent repository;
	
	//Alta
	public Event saveEvent (Event event) {
		return repository.save(event);
	}
	
	//Modificacion
	public Event updateEvent (Event event) {
		Event mdEvent = repository.findById(event.getId()).orElse(null);
		
		mdEvent.setDescripcion(event.getDescripcion());
		mdEvent.setFechaInicio(event.getFechaInicio());
		mdEvent.setFechaFin(event.getFechaFin());
		mdEvent.setIntitucion(event.getIntitucion());
		
		return repository.save(mdEvent);
	}
	
	//Baja
	public void deleteEvent (int id) {
		repository.deleteById(id);
	}
	
	//Listar
	public List<Event> getAllEvent(){
		return repository.findAll();
	}
	
	
}
