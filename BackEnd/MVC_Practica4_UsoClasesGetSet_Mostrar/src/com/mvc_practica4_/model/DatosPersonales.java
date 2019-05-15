package com.mvc_practica4_.model;

public class DatosPersonales {
	
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private int edad;
	private int estatura;
	private String sexo;
	private String[] mascotas;
	
	public DatosPersonales() {
		
	}
	
	public DatosPersonales(String _nombre,String _apellidoPat,String _apellidoMat,int _edad,int _estatura,String _sexo,String[] _mascotas) {
		
		nombre=_nombre;
		apellidoPat=_apellidoPat;
		apellidoMat=_apellidoMat;
		edad=_edad;
		estatura=_estatura;
		sexo=_sexo;
		mascotas=_mascotas;
	}
	
	public String toString() {
		
		String misMascotas="";
		for(String mascota:mascotas) {
			misMascotas+=mascota+" ";
		}
		return "Nombre: "+nombre+" Nombre Padre"+apellidoPat+" Nombre Madre: "+apellidoMat+" Edad: "+edad+" Estatura: "+estatura+" sexo: "+sexo+" Mascotas: "+misMascotas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String _nombre) {
		nombre=_nombre;
	}
	public String getApellidoPat() {
		return apellidoPat;
	}
	public void setApellidoPat(String _apellidoPat) {
		apellidoPat=_apellidoPat;
	}
	public String getApellidoMat() {
		return apellidoMat;
	}
	public void setApellidoMat(String _apellidoMat) {
		apellidoMat=_apellidoMat;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int _edad) {
		edad=_edad;
	}
	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int _estatura) {
		estatura=_estatura;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String _sexo) {
		sexo=_sexo;
	}
	public String getMascotas() {
		String misMascotas=" ";
		
		for(String mascota:mascotas) {
			misMascotas+=mascota+" ";
		}
		return misMascotas;
	}
	public void setMascotas(String[] _mascotas) {
		
		mascotas=_mascotas;
	}
	

}
