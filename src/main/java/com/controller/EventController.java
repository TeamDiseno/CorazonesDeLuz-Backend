package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.service.EventService;
import com.domain.entity.Event;

@RestController
@RequestMapping ("/api")

public class EventController {

	@Autowired
	private EventService service;
	
	@PostMapping ("/api")
	public Event addEvent (@RequestBody Event event) {
		return service.saveEvent(event);
	}
	
	@PutMapping ("/api")
	public Event updateEvent (@RequestBody Event event) {
		return service.updateEvent(event);
	}
	
	@DeleteMapping("/api/{id}")
	public void deleteEvent (@PathVariable int id) {
		service.deleteEvent(id);
	}
	
	@GetMapping ("/api")
	public List<Event> getEvent(){
		return service.getAllEvent();
	}
	
	
	
	
}
