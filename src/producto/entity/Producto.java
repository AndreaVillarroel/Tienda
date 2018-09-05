package producto.entity;

	public class Producto {
		
		
		private int codProducto;
		private String nombreProducto;
		private double precio;
		private String descripcion;
		private int codCategoria;
	public Producto(int codigoProducto, String nombre, double precio, String descripcion, int codigoCategoria) {
		super();
		this.codProducto = codigoProducto;
		this.nombreProducto = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.codCategoria = codigoCategoria;
	}
	public int getCodigoProducto() {
		return codProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codProducto = codigoProducto;
	}
	public String getNombre() {
		return nombreProducto;
	}
	public void setNombre(String nombre) {
		this.nombreProducto = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCodigoCategoria() {
		return codCategoria;
	}
	public void setCodigoCategoria(int codigoCategoria) {
		this.codCategoria = codigoCategoria;
	}

		
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codProducto + ", nombre=" + nombreProducto + ", precio=" + precio
				+ ", descripcion=" + descripcion + ", codigoCategoria=" + codCategoria + "]";
	}
	}

