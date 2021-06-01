package ar.edu.unlam.pb2.usuario;

public class Usuario {
	

	private String password;
	private char[] caracter;
	
	public Usuario() {
	this.password="maTi1234";
	}

	public boolean laPasswordEsFuerte() {
		if(laPasswordTieneMasDe8Caracteres()&&laPasswordTieneAlMenosUnaMayuscula()&&laPasswordTieneAlMenosUnaMinuscula()) {
		return true;
	}
		return false;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean laPasswordTieneMasDe8Caracteres() {	
		return this.password.length()>=8;
	}
	
	private boolean laPasswordTieneAlMenosUnaMinuscula() {
		  this.caracter=this.password.toCharArray();

	      for (int i= 0; i<caracter.length;i++) {

	      if(Character.isLowerCase(caracter[i])==true) {

	                return true;
	            }

	        }

	        return false;
	    }
	
	private boolean laPasswordTieneAlMenosUnaMayuscula() {
		
		  this.caracter=this.password.toCharArray();

	      for (int i= 0; i<caracter.length;i++) {

	      if(Character.isUpperCase(caracter[i])==true) {

	      return true;
	            }

	        }

	        return false;
	    }
}




