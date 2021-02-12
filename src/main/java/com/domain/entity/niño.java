package com.domain.entity;
import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;





@Table(name="Niño")

public class niño {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name="Dni",unique=true)
	
	private String Nombre;
	private String Apellido;
	private  int Dni;
	private int Edad;
	private String Calzado;
	private int Talle;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public niño( String nombre, String apellido, int dni, int edad, String calzado, int talle) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Dni = dni;
		Edad = edad;
		Calzado = calzado;
		Talle = talle;
	}
	
	
}
