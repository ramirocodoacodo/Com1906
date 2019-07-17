package tecnicas.u05;

import java.util.Scanner;

public class Ej07 {

	static void imprimirSimbolo(int num, char car) {
		for (int i = 1; i <= num; i++) { // I = 1 ; Mientras I sea menor o igual a num; I se incrmenta por uno cada
											// vuelta
			System.out.print(car);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor, ingrese un número.");
		int num = teclado.nextInt();

		System.out.println("Por favor, ingrese un caracter.");
		String carStr = teclado.next();
		char car = carStr.charAt(0); // Lee la linea que ingresa el usuario. Luego solo toma el caracter en la
												// posicion 0. ejem. "Simbolo" toma la 'S' como char.

		teclado.close();

		imprimirSimbolo(num, car);

	}
}