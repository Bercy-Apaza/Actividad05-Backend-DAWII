package com.disponibilidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.disponibilidad.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
