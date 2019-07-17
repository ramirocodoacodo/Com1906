package tecnicas.u06;

import java.util.Scanner;

public class Ej28 {

	public static void main(String[] args) {

		String frase = leerCadena("Ingrese una cadena de texto");

		char[] frasechar = frase.trim().toCharArray();
		int espacios = 0;

		for (int i = 0; i < frasechar.length; i++) {
			if (frasechar[i] == ' ') {
				espacios += 1;
			}
		}

		int palabras = espacios + 1;

		System.out.println("La frase ingresada contiene " + palabras + " palabras");

	}

	static String leerCadena(String msj) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(msj);
		return teclado.nextLine();
	}
}
