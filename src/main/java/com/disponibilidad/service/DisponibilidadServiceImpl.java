package com.disponibilidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disponibilidad.entity.Disponibilidad;
import com.disponibilidad.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService{
	
	@Autowired
	private DisponibilidadRepository repository;

	@Override
	public Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public List<Disponibilidad> listarDisponibilidad() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	

}
