package com.disponibilidad.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.disponibilidad.entity.Disponibilidad;
import com.disponibilidad.service.DisponibilidadService;
import com.disponibilidad.util.Constantes;

@RestController
@RequestMapping("/rest/disponibilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class DisponibilidadController {
	
	@Autowired
	private DisponibilidadService disponibilidadService;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Disponibilidad>>listarDisponibilidad(){
		List<Disponibilidad>lista=disponibilidadService.listarDisponibilidad();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String, Object>>insertaActualizaDisponibilidad(@RequestBody Disponibilidad obj){
		Map<String, Object>salida=new HashMap<>();
		try {
			Disponibilidad objSalida=disponibilidadService.insertaActualizaDisponibilidad(obj);
			if(objSalida == null) {
				salida.put("mensaje",Constantes.MENSAJE_REG_ERROR);
			}else {
				salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
				
		
		}
		return ResponseEntity.ok(salida);
	}
	
}
