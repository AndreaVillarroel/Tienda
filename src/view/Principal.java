package view;

import view.MenuOficial;

import java.util.Scanner;

import categoria.entity.CategoriaNoExistente;
import categoria.view.MenuCategoria;
import producto.view.ProductoMenu;

@SuppressWarnings("unused")
public class Principal {

	public static void main(String[] args) throws CategoriaNoExistente {
		Scanner scanner = new Scanner(System.in);

		ProductoMenu menuProducto = null; 
		MenuCategoria menuCategoria = null;
		
		view.MenuOficial.menuOficial(scanner,  menuCategoria, menuProducto);

		scanner.close();
		
	}

}
