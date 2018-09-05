package categoria.entity;

public class Categoria {

	private int codCategoria;
	private String nombreCategoria;
	private String descripcionCategoria;

	public Categoria(int codigoCategoria, String nombreCategoria, String descripcionCategoria) {
		super();
		this.codCategoria = codigoCategoria;
		this.nombreCategoria = nombreCategoria;
		this.descripcionCategoria = descripcionCategoria;
	}

	public int getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codigoCategoria) {
		this.codCategoria = codigoCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public String getDescripcionCategoria() {
		return descripcionCategoria;
	}

	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}

	@Override
	public String toString() {
		return "Categoria [codigoCategoria=" + codCategoria + ", nombreCategoria=" + nombreCategoria
				+ ", descripcionCategoria=" + descripcionCategoria + "]";
	}

}
