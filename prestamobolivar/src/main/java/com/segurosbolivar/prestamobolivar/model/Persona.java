package com.segurosbolivar.prestamobolivar.model;


public class Persona {
	
	private int id;
	private String nombre, email, celular;
	
	public Persona(int id, String nombre, String email, String celular) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.celular = celular;
	}
	public Persona() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", email=" + email + ", celular=" + celular + "]";
	}
	
	
}
