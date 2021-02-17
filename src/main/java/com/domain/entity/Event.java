package com.domain.entity;

import javax.persistence.Id;

public class Event {
	
	@Id
	private int id;
	private String descripcion;
	private String fechaInicio;
	private String fechaFin;
	private String intitucion;
	
	
	
	public Event(String descripcion, String fechaInicio, String fechaFin, String intitucion, int id) {
		
		this.id = id;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.intitucion = intitucion;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getIntitucion() {
		return intitucion;
	}
	public void setIntitucion(String intitucion) {
		this.intitucion = intitucion;
	}

	
}
