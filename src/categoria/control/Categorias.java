package categoria.control;

import categoria.entity.Categoria;
import producto.entity.Producto;
import categoria.entity.CategoriaNoExistente;

public class Categorias {

	private static Categoria[] categorias;
	private static int cantidad;
	private static int ultimo;

	public Categorias(int tamanno) {
		categorias = new Categoria[tamanno];
		cantidad = 0;
		ultimo = -1;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCategorias(Categoria[] categorias) {
		this.categorias = categorias;
	}

	public Categoria[] getCategoria() {
		return categorias;
	}

	public static void ingresar(Categoria categoria) throws java.lang.ArrayIndexOutOfBoundsException {
		categorias[++ultimo] = categoria;
		cantidad++;
	}

	public void eliminar(int codCategoria) throws CategoriaNoExistente {
		int indice = buscar(codCategoria);
		if (indice > -1) {
			if (indice != ultimo) {
				for (int i = indice; i <= ultimo; i++) {
					// recorre todo los elementos a partir de i
					categorias[i] = categorias[i + 1];

				}
			}
			ultimo--;
			cantidad--;
		}
	}

		
	public int buscar(int codCategoria) throws CategoriaNoExistente {

		int indice = -1;
		int i = 0;
		while (i <= ultimo) {
			if (codCategoria == categorias[i].getCodCategoria()) {
				indice = i;
				break;
			}
			i++;
		}
		if (indice == -1)
			throw new CategoriaNoExistente();
		return indice;

	}
//busca categoria y devuelve un valor , si no hay categoria devuelve falso
//verifica la existencia de la categoria

	public boolean searchCategoriaboolean(int codCategoria) throws CategoriaNoExistente {
		boolean valor = false;
		for (int i = 0; i <= ultimo; i++) {
			if (codCategoria == categorias[i].getCodCategoria()) {
				valor = !valor;
			}
		}
		// si valor es igual a falso
		if (!valor) {
			throw new CategoriaNoExistente();
		}
		return valor;
	}

}
