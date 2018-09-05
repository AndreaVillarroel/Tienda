package categoria.view;

import java.util.Scanner;


import categoria.control.Categorias;
import categoria.entity.Categoria;
import categoria.entity.CategoriaNoExistente;
import producto.entity.Producto;
import producto.view.RegistroProducto;
import productos.control.Productos;
import view.InputTypes;

public class CategoriaView {

	public static CategoriaView catagoriasView;
	private Scanner scanner;
	private Categorias categorias;
	private Productos productos;

	public CategoriaView(Categorias categorias, Productos productos, Scanner scanner) {
		this.scanner = scanner;
		this.categorias = categorias;
		this.productos = productos;
	}

	public void add() {
		Categoria categoria;
		categoria = RegistroCategoria.ingresar(scanner);
		categorias.ingresar(categoria);
	}
	public void list() {
		for (int i = 0; i < categorias.getCantidad(); i++) {
			System.out.println(categorias.getCategoria()[i]);
		}
	}

	public void listproducts() throws CategoriaNoExistente {

		int codCategoria = InputTypes.readInt("Codigo de categoria:", scanner);
		System.out.println(categorias.getCategoria()[categorias.buscar(codCategoria)]);
		for (int i = 0; i < productos.getCantidad(); i++) {
			if (codCategoria == productos.getProductos()[i].getCodigoCategoria())
				System.out.println(productos.getProductos()[i]);
		}
	}

	public void delete() throws CategoriaNoExistente {
		int codcategoria = InputTypes.readInt("Codigo de categoria : ", scanner);
		categorias.eliminar(codcategoria);
	}
}
