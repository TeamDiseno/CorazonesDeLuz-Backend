package com.domain.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
public class User {

	private String nombre;
	private String apellido;
	
	@Id
	@Column(unique = true)
	private int dni;
	
	private int tipoUsuario;
	private String correo;
	private String domicilio;
	private int numTelefono;
	private String username;
	private String password;
	
	
	
	public User(String nombre, String apellido, int dni, int tipoUsuario, String correo, String domicilio,
			int numTelefono, String username, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.tipoUsuario = tipoUsuario;
		this.correo = correo;
		this.domicilio = domicilio;
		this.numTelefono = numTelefono;
		this.username = username;
		this.password = password;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public int getTipoUsuario() {
		return tipoUsuario;
	}



	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getDomicilio() {
		return domicilio;
	}



	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}



	public int getNumTelefono() {
		return numTelefono;
	}



	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
