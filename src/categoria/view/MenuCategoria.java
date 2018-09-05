package categoria.view;

import java.util.Scanner;

import categoria.entity.CategoriaNoExistente;
import view.InputTypes;

public class MenuCategoria {

	private static int encabezadoCategoria(Scanner scanner) {
		int opcion;
		while (true) {
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println("	Ingrese una opcion	: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Ingresar Categoria ");
			System.out.println("2. Listar Categoria ");
			System.out.println("3. Eliminar Categoria");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("Su opcion?", scanner);
			if (opcion >= 0 && opcion <= 3) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, CategoriaView categoriasView) {
		boolean salir = false;
		while (!salir) {
			switch (encabezadoCategoria(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				categoriasView.add();
				break;
			case 2:
				categoriasView.list();
				break;
			case 3:
				try {
					categoriasView.delete();

				} catch (CategoriaNoExistente e) {
					System.out.println("No existe la categoria");
				}
				break;
			}
		}
	}
}
