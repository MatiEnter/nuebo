package ar.edu.unlam.pb2.usuario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsuarioTest {
		
	private Usuario user;
	
	//preparacion (dado)
	//ejecucion (cuando suceda)
	//validacion - contrastacion (entonces)
	
	@Test
	public void CrearLaPasswordDelUsuario() {
		whenCreoUnUsuario();
		thenLaPasswordEsFuerte();
		asignarPasswordAlUsuario(user);
	}

	private void whenCreoUnUsuario() {
		user = new Usuario();
	}
	
	 private void asignarPasswordAlUsuario(Usuario user) {
		 user.setPassword(null);
	 }
	 
	private void thenLaPasswordEsFuerte() {
		assertTrue(user.laPasswordEsFuerte()==true);
	}
	

}
