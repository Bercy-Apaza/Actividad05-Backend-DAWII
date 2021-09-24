package com.disponibilidad.entity;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "disponibilidad")
@Getter
@Setter
public class Disponibilidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDisponibilidad;
	
	private Time horaInicio;
	private Time horaFin;
	private String dia;
	
	@ManyToOne
	@JoinColumn(name = "idCiclo")
	private Ciclo ciclo;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	
	
	

}
