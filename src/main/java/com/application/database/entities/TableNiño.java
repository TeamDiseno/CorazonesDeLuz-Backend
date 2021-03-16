package com.database.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.domain.entity.niño;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Niños")
public class TableNiño {
	@Id
	@GeneratedValue
	private Integer id;
	private  String Nombre;
	private  String Apellido;
	private   int Dni;
	private  int Edad;
	private  String Calzado;
	private  int Talle;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getCalzado() {
		return Calzado;
	}
	public void setCalzado(String calzado) {
		Calzado = calzado;
	}
	public int getTalle() {
		return Talle;
	}
	public void setTalle(int talle) {
		Talle = talle;
	}
	
	
	
	}
