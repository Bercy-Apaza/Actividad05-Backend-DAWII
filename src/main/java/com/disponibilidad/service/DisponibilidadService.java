package com.disponibilidad.service;

import java.util.List;

import com.disponibilidad.entity.Disponibilidad;

public interface DisponibilidadService {
	
	public Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj);
	public List<Disponibilidad>listarDisponibilidad();

}
