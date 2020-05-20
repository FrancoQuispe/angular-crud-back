package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/agregar")
	public Persona agregar(@RequestBody Persona persona) {
		return repo.save(persona);
	}
	@GetMapping("/byid/{id}")
	public Optional<Persona> listarId(@PathVariable("id")int id) {
		return repo.findById(id);
	}
	@PutMapping("actualizar/{id}")
	public Persona actualizar(@RequestBody Persona persona, @PathVariable("id") int id) {
		persona.setId(id);
		return repo.save(persona);
	}
	
}
