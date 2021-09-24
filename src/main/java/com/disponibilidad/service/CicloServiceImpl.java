package com.disponibilidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disponibilidad.entity.Ciclo;
import com.disponibilidad.repository.CicloRepository;

@Service
public class CicloServiceImpl implements CicloService{
	
	@Autowired
	private CicloRepository repository;
	
	@Override
	public List<Ciclo> listarCiclos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
