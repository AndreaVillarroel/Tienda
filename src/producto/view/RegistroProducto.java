package producto.view;

import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.Categoria;
import categoria.entity.CategoriaNoExistente;
import producto.entity.Producto;
import view.InputTypes;

public class RegistroProducto {

	public static Producto ingresar(Scanner scanner, Categorias categorias) throws CategoriaNoExistente {
		
		int codProducto = InputTypes.readInt("Ingrese el codigo Producto :", scanner);
		String nombreProducto = InputTypes.readString(" Nombre Producto :", scanner);
		double precio = InputTypes.readDouble("Precio producto :", scanner);
		String descripcion = InputTypes.readString("Descripcion :", scanner);

		//valor = InputTypes.readInt("Codigo Categoria :", scanner);
	//
		
		//
//		int codCategoria = valor;
		int codCategoria=InputTypes.readInt("Codigo Categoria", scanner);
		categorias.buscar(codCategoria);
		
		return new Producto(codProducto, nombreProducto, precio, descripcion, codCategoria);

	}

	private static void Producto(int codProducto, String nombreProducto, double precio, String descripcion,
			int codCategoria) {

	}
	public static Producto Eliminado(Scanner scanner) {
		int codProducto = InputTypes.readInt("Ingrese el codigo del producto que desea eliminar", scanner);
		return new Producto(codProducto, null, codProducto, null, codProducto);
	}
}
