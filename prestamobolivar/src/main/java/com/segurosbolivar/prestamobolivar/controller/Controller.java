package com.segurosbolivar.prestamobolivar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.segurosbolivar.prestamobolivar.model.Persona;
import com.segurosbolivar.prestamobolivar.repo.PersonaServiceImpl;

@RestController
@RequestMapping
public class Controller {
	
	@Autowired
	PersonaServiceImpl personaServiceImpl;
	
	@GetMapping( {"/listarPersonas"} )
	public List<Persona> listarPersonas(){
		return personaServiceImpl.findAll();
	}
	
	@GetMapping( {"/mensaje"} )
	public String mensaje() {
		return "Hola Mundo";
		
	}
	
	@PostMapping( {"/insertar"} )
	public Persona insertarPersona() {
		Persona persona= new Persona();
		persona.setId(2);
		persona.setNombre("Brahyan Arteaga");
		persona.setEmail("blarteagaa@Uqvirtual.edu.co");
		persona.setCelular("3122622630");
		
		personaServiceImpl.save(persona);
		return persona;
	}

}
