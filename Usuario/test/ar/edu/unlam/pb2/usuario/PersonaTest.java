package ar.edu.unlam.pb2.usuario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	public void queSePuedaCrearUnaPersona() {
		Integer dni =40512642;
		String nombre ="ruben";
		
		Persona persona = new Persona (dni,nombre);
		assertNotNull(persona);
		//watefac
		
	}

}
