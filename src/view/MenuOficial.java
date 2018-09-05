package view;

import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.CategoriaNoExistente;
import producto.view.ProductoMenu;
import producto.view.ProductoView;
import productos.control.Productos;
import categoria.view.CategoriaView;
import categoria.view.MenuCategoria;

public class MenuOficial {

	public static void menuOficial(Scanner scanner, MenuCategoria menuCategoria , ProductoMenu menuProducto)
			throws CategoriaNoExistente {

		Productos productos = new Productos(10);
		Categorias categorias = new Categorias(10);

		boolean salir = false;
		while (!salir) {
			switch (encabezadoOFICIAL(scanner)) {
			case 0:
				salir = true;
				break;
		
			case 1:
				CategoriaView categoriasView = new CategoriaView(categorias, productos, scanner);
				
				//CategoriaView categoriasView = new CategoriaView(categorias, productos, scanner);
				MenuCategoria.menu(scanner, categoriasView);

				break;
			case 2:
				ProductoView productosView = new ProductoView(productos, categorias, scanner);
				producto.view.ProductoMenu.menu(scanner, productosView);

				break;
			}

		}
	}

	private static int encabezadoOFICIAL(Scanner scanner) {
		int opcion;
		while (true) {
			System.out.println("****************************************************************************************");
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("		        	Ingrese una opcion  : 			");
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("****************************************************************************************");

			System.out.println("1. Menu categoria ");
			System.out.println("2. Menu producto ");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("Su opcion?", scanner);
			if (opcion >= 0 && opcion <= 2) {
				return opcion;
			}
			return 0;
		}
	}
}