package com.tienda.entity;

public class Venta {

	private int numeroVenta;
	private String fecha;
	public Venta(int numeroVenta, String fecha) {
		super();
		this.numeroVenta = numeroVenta;
		this.fecha = fecha;
	}
	public int getNumeroVenta() {
		return numeroVenta;
	}
	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Venta [numeroVenta=" + numeroVenta + ", fecha=" + fecha + "]";
	}
	
}
