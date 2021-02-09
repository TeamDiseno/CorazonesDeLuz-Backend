package com.database.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.domain.entity.User;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Instituciones")
public class InstitucionEntity {
	
	@Id
	private int id;
	private String nombre;
	private String direccion; 
	private User encargado;
	
	

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
