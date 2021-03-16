package com.domain.entity;

public class niño {
	
	
	private int id;
	
	private  String Nombre;
	private  String Apellido;
	private   int Dni;
	private  int Edad;
	private  String Calzado;
	private  int Talle;
	private User encargado;
	
	public niño(){
		
	}
	public niño(String Nombre, String Apellido, int Dni, int Edad,String Calzado, int Talle,User encargado) {
		this.Nombre=Nombre;
		this.Apellido=Apellido;
		this.Dni=Dni;
		this.Edad=Edad;
		this.Calzado=Calzado;
		this.Talle=Talle;
		this.encargado=encargado;
		
	}
	public int getId() {
		return id;
	}
	
	public  String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public  String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public  int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	public  int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public  String getCalzado() {
		return Calzado;
	}
	public void setCalzado(String calzado) {
		Calzado = calzado;
	}
	public  int getTalle() {
		return Talle;
	}
	public void setTalle(int talle) {
		Talle = talle;
	}
	public User getEncargado() {
		return encargado;
	}
	public void setEncargado(User encargado) {
		this.encargado = encargado;
	}
	
	
}
