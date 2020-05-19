package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Persona;
import com.example.demo.repositorio.PersonaRepositorio;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class DemoControlador {
	
	
	@Autowired
	PersonaRepositorio repo;
	
	@GetMapping("/listar")
	public List<Persona>listar(){
		return repo.findAll();
	}
	
}
