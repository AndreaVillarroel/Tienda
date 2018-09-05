package producto.view;

import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.CategoriaNoExistente;
import producto.entity.Producto;
import productos.control.Productos;
import view.InputTypes;

public class ProductoView {

	public static ProductoView productosView;

	private Scanner scanner;
	private Productos productos;
	private Categorias categorias;

	public ProductoView(Productos productos, Categorias categorias, Scanner scanner) {
		this.scanner = scanner;
		this.categorias = categorias;
		this.productos = productos;
	}

	public void add() throws CategoriaNoExistente {
		Producto producto;
		producto = RegistroProducto.ingresar(scanner, categorias);
		productos.ingresar(producto);
	}

	public void list() {
		int codCategoria = 0;
		int indiceCategoria = 0;
		for (int i = 0; i < productos.getCantidad(); i++) {
			System.out.println(productos.getProductos()[i]);
			codCategoria = productos.getProductos()[i].getCodigoCategoria();
			try {
				codCategoria = categorias.buscar(codCategoria);
					System.out.println(categorias.getCategoria());
				System.out.println(categorias.getCategoria()[indiceCategoria]);
			} catch (CategoriaNoExistente e) {
				e.printStackTrace();
			}

		}
	}

	public void delete() {
		/*
		 * Producto codProducto; codProducto = RegistroProducto.Eliminado(scanner);
		 * productos.eliminar(codProducto.getCodigoProducto());
		 */
		int codproducto = InputTypes.readInt("Codigo de producto	:		", scanner);
		productos.eliminar(codproducto);
	}

}
