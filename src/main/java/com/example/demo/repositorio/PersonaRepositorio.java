package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.example.demo.entidades.Persona;


public interface PersonaRepositorio extends JpaRepository<Persona, Integer>{
	
}
