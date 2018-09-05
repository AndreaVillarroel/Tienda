package view;

import java.util.Scanner;

public class InputTypes {
	
	public static int readInt(String mensaje, Scanner scanner) {
		int valor = 0 ;
	while(true) {
	try {
		System.out.print(mensaje);
		valor = scanner.nextInt();
		scanner.nextLine();
		break;
	}catch (java.util.InputMismatchException e) {
		System.out.println("Debe ingresar valores numericos ! ");
		scanner.nextLine();
	}
	}
	return valor;
	}

	public static String readString(String mensaje, Scanner scanner) {
		String palabra = null;
		while(true) {
			try {
				System.out.print(mensaje);
				palabra = scanner.nextLine();
				break;
			}catch (java.util.InputMismatchException e) {
				System.out.println("Debe ingresar valores tipo caracter ! ");
			}
			}
			return palabra;
			}
		

	public static double readDouble(String mensaje, Scanner scanner) {
		double decimal = 0;
		while(true) {
			try {
				System.out.print(mensaje);
				decimal = scanner.nextDouble();
				scanner.nextLine();
				break;
			}catch (java.util.InputMismatchException e) {
				System.out.println("Debe ingresar valores numericos ! ");
				scanner.nextLine();
			}
			}
			return decimal;
			}
		
	
}
