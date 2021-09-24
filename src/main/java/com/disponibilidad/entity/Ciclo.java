package com.disponibilidad.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ciclo")
@Getter
@Setter
public class Ciclo {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idCiclo;
	 	private String nombre;
	 	private String estado;
	

}
