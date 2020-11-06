package com.segurosbolivar.prestamobolivar.services;

import java.util.List;

import com.segurosbolivar.prestamobolivar.model.Persona;

public interface PersonaService {
	
	void save (Persona persona);
	List<Persona>findAll();
}
