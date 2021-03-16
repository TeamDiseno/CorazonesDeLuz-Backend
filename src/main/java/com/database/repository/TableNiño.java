package com.database.repository;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.domain.entity.niño;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class TableNiño extends niño {
	
	
	
	public TableNiño( String Nombre, String Apellido,int Dni,int Edad, String Calzado, int Talle) {

		super(Nombre, Apellido,Dni,Edad,Calzado,Talle);
		// TODO Auto-generated constructor stub

    }
}