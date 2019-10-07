package poo.u07;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un número:");
		String aux = teclado.nextLine();
		try {
			int aux2 = Integer.parseInt(aux);
		} catch (NumberFormatException e1) {
			System.out.println(e1.getMessage());
			System.out.println("Debe ingresar un número entero!");
		} catch (Exception e2) {
			System.out.println("Ha ocurrido un error inesperado!");
		}
	}
}