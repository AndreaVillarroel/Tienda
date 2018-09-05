package producto.view;

import java.util.Scanner;
import categoria.entity.CategoriaNoExistente;
import view.InputTypes;

public class ProductoMenu {

		private static int encabezado(Scanner scanner) {
			int opcion;
			while (true) {
				System.out.println();
				System.out.println("--------------------------------------");
				System.out.println("	Ingrese una opcion	: ");
				System.out.println("--------------------------------------");
				System.out.println("1. Ingresar Producto ");
				System.out.println("2. Listar Productos ");
				System.out.println("3. Eliminar Producto");
				System.out.println("0. Salir");
				System.out.println();

				opcion = InputTypes.readInt("Su opcion?", scanner);
				if(opcion >= 0 && opcion <= 3) {
					return opcion;
				}
			}
		}
		public static void menu(Scanner scanner, ProductoView productosView) throws CategoriaNoExistente {
		boolean salir = false;
				while (!salir) {
					switch (encabezado(scanner)) {
					case 0:
					salir = true;
					break;
					case 1:
						try {
					productosView.add();
						}catch(CategoriaNoExistente e) {
							System.out.println("La categoria no existe !");
						}
					break;
					case 2:
					productosView.list();
					break;
					case 3:
					productosView.delete();
					break;
					}
				//	CategoriaNoExistente catnoex ;
					
				}
		}
}
