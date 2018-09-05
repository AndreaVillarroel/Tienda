package categoria.view;

import java.util.Scanner;

import categoria.entity.Categoria;
import producto.entity.Producto;
import view.InputTypes;

public class RegistroCategoria {
	
	public static Categoria ingresar (Scanner scanner) {
		
		int codCategoria = InputTypes.readInt("Ingrese el codigo Categoria :", scanner);
		String nombreCategoria = InputTypes.readString(" Nombre Categoria :", scanner);
		String descripcionCategoria = InputTypes.readString("Descripcion :", scanner);
		return new Categoria(codCategoria, nombreCategoria, descripcionCategoria);

	}

	private static void Categoria(int codCategoria, String nombreCategoria, String descripcion) {
	}
	public static Categoria Eliminada(Scanner scanner) {
		int codCategoria = InputTypes.readInt("Ingrese el codigo del producto que desea eliminar", scanner);
		return new Categoria(codCategoria, null, null);
}
}