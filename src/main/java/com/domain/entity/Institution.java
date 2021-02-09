package com.domain.entity;

import javax.persistence.GeneratedValue;

public class Institution {
	
	
	@GeneratedValue
	private int id;
	
	private String nombre;
	private String direccion; 
	private User encargado;
	
	
	
	public Institution() {
		
	}
	
	public Institution(String nombre, String direccion, User encargado) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.nombre=nombre; 
	}
	


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public User getEncargado() {
		return encargado;
	}
	public void setEncargado(User encargado) {
		this.encargado = encargado;
	}

	
	
	
}
