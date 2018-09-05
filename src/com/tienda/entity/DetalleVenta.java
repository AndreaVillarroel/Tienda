package com.tienda.entity;

public class DetalleVenta {

	private int codDetalleVenta;
	private int codProducto;
	private int numeroVenta;
	private int cantidad;

	public DetalleVenta(int codDetalleVenta, int codProducto, int numeroVenta, int cantidad) {
		super();
		this.codDetalleVenta = codDetalleVenta;
		this.codProducto = codProducto;
		this.numeroVenta = numeroVenta;
		this.cantidad = cantidad;
	}

	public int getCodDetalleVenta() {
		return codDetalleVenta;
	}

	public void setCodDetalleVenta(int codDetalleVenta) {
		this.codDetalleVenta = codDetalleVenta;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public int getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "DetalleVenta [codDetalleVenta=" + codDetalleVenta + ", codProducto=" + codProducto + ", numeroVenta="
				+ numeroVenta + ", cantidad=" + cantidad + "]";
	}

}
