package com.mvc_practica10.productos.model;

public class Productos {

	private int id_producto=0;
	private String nombre_producto="";
	private double precio_producto=0.0;
	private int existencias_producto=0;
	
	public Productos() {
		
	}
	
	public Productos(int id_producto, String nombre_producto, double precio_producto, int existencias_producto) {
		
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.precio_producto = precio_producto;
		this.existencias_producto = existencias_producto;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public double getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(double precio_producto) {
		this.precio_producto = precio_producto;
	}

	public int getExistencias_producto() {
		return existencias_producto;
	}

	public void setExistencias_producto(int existencias_producto) {
		this.existencias_producto = existencias_producto;
	}

	@Override
	public String toString() {
		return "Productos [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", precio_producto="
				+ precio_producto + ", existencias_producto=" + existencias_producto + "]";
	}
	
}
