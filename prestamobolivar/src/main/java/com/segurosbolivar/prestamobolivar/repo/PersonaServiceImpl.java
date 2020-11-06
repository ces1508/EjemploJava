package com.segurosbolivar.prestamobolivar.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.segurosbolivar.prestamobolivar.model.Persona;
import com.segurosbolivar.prestamobolivar.services.PersonaService;

@Repository
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public void save(Persona persona) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("DECLARE ");
		sql.append("personaR PERSONA%ROWTYPE; ");
		sql.append(" BEGIN ");
		sql.append("Select ");
		sql.append("?,");
		sql.append("?,");
		sql.append("?,");
		sql.append("?");
		sql.append(" INTO personaR ");
		sql.append("From dual; ");
		sql.append(" pkgPersona.insert_Persona(personaR); ");
		sql.append("END; ");
		
		
		jdbcTemplate.update(sql.toString(), persona.getId(),persona.getNombre(),persona.getEmail(),persona.getCelular());	
		
	}

	@Override
	public List<Persona> findAll() {
		String sql="SELECT * FROM PERSONA";
		List<Persona> listaPersonas= jdbcTemplate.query(sql, (rs,rowNum)->new Persona(rs.getInt("id"),rs.getString("nombre"),rs.getString("email"),rs.getString("celular")));
		return listaPersonas;
	}
}
