package com.tienda.entity;

public class Factura {

	private int numeroVenta;
	private int elNIT;
	private String nombreDirigido;
	public Factura(int numeroVenta, int elNIT, String nombreDirigido) {
		super();
		this.numeroVenta = numeroVenta;
		this.elNIT = elNIT;
		this.nombreDirigido = nombreDirigido;
	}
	public int getNumeroVenta() {
		return numeroVenta;
	}
	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}
	public int getElNIT() {
		return elNIT;
	}
	public void setElNIT(int elNIT) {
		this.elNIT = elNIT;
	}
	public String getNombreDirigido() {
		return nombreDirigido;
	}
	public void setNombreDirigido(String nombreDirigido) {
		this.nombreDirigido = nombreDirigido;
	}
	@Override
	public String toString() {
		return "Factura [numeroVenta=" + numeroVenta + ", elNIT=" + elNIT + ", nombreDirigido=" + nombreDirigido + "]";
	}
	
}
