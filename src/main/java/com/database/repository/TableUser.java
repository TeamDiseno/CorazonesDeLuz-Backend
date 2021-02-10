package com.database.repository;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.domain.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//En proceso

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TableUser extends User{

	public TableUser(String nombre, String apellido, int dni, int tipoUsuario, String correo, String domicilio,
			int numTelefono, String username, String password) {
		super(nombre, apellido, dni, tipoUsuario, correo, domicilio, numTelefono, username, password);
		// TODO Auto-generated constructor stub
	}

	

	
	
	
	

}
