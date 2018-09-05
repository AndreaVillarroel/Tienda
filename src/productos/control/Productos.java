package productos.control;

import producto.entity.Producto;

public class Productos {

	private static Producto[] productos;
	private static int cantidad;
	private static int ultimo;

	public Productos(int tamanno) {
		productos = new Producto[tamanno];
		cantidad = 0;
		ultimo = -1;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static Producto[] getProductos() {
		return productos;
	}

	public  void ingresar(Producto producto)  throws java.lang.ArrayIndexOutOfBoundsException{
		productos[++ultimo] = producto;
		cantidad++;
	
	}

	public void eliminar(int codProducto) {
		int indice = buscar(codProducto);
		if (indice >= 0) {
			if (indice != ultimo) {
				for (int i = indice; i <= ultimo; i++) {
					// recorre todo los elementos a partir de i
					productos[i] = productos[i + 1];
				}
				ultimo--;
				cantidad--;
			}
		}
	}

	private int buscar(int codProducto) {
		int indice = -1;
		int i = 0;
		while (i <= ultimo) {
			if (codProducto == productos[i].getCodigoProducto()) {
				indice = i;
				break;
			}
			i++;
		}
		return indice;
	}
}
