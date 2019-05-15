package com.practica1.model;

public class DatosPersonales {
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private String domicilio;
	private int edad;
	private String sexo;
	private double estatura;
	
	public DatosPersonales() {
		
	}
	public DatosPersonales(String nombre, String apellidoPat, String apellidoMat, String domicilio, int edad,
			String sexo, double estatura) {
		super();
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.domicilio = domicilio;
		this.edad = edad;
		this.sexo = sexo;
		this.estatura = estatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPat() {
		return apellidoPat;
	}
	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}
	public String getApellidoMat() {
		return apellidoMat;
	}
	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	@Override
	public String toString() {
		return "DatosPersonales [nombre=" + nombre + ", apellidoPat=" + apellidoPat + ", apellidoMat=" + apellidoMat
				+ ", domicilio=" + domicilio + ", edad=" + edad + ", sexo=" + sexo + ", estatura=" + estatura + "]";
	}
	public DatosPersonales(String nombre) {
		super();
		this.nombre = nombre;
	}
	

	

}
