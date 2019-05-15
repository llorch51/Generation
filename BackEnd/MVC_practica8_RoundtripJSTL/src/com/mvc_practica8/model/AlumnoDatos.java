package com.mvc_practica8.model;

public class AlumnoDatos {

	private String nombre;
	private double cal1;
	private double cal2;
	
	public AlumnoDatos() {
		
	}
	public AlumnoDatos(String nombre, double cal1, double cal2) {
		this.nombre = nombre;
		this.cal1 = cal1;
		this.cal2 = cal2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCal1() {
		return cal1;
	}
	public void setCal1(double cal1) {
		this.cal1 = cal1;
	}
	public double getCal2() {
		return cal2;
	}
	public void setCal2(double cal2) {
		this.cal2 = cal2;
	}
	
	
}
