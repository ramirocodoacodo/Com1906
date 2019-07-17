package tecnicas.u06;

import java.util.Scanner;

public class Ej29b {
	/*
	 * Crear un programa que pida al usuario su nombre y apellidos y los muestre con
	 * las mayúsculas y minúsculas correctas (aparecerán en mayúsculas la primera
	 * letra y la que haya tras cada espacio; las demás aparecerán en minúsculas.
	 * Por ejemplo, si introduce “nAcho cabaNes”, es escribirá “Nacho Cabanes”).
	 */

	public static void main(String[] args) {
		System.out.println("Ingrese su nombre: ");
		String nombre = String.valueOf(new Scanner(System.in).nextLine()).trim();
		String salida = "";
		boolean bandera = true;

		do {
			salida += String.valueOf(nombre.charAt(0)).toUpperCase()
					+ nombre.substring(1, nombre.indexOf(' ')).toLowerCase() + " ";
			nombre = nombre.substring(nombre.indexOf(' ') + 1);
			if (nombre.indexOf(' ') == -1) {
				salida += String.valueOf(nombre.charAt(0)).toUpperCase() + nombre.substring(1).toLowerCase();
				bandera = false;
			}
		} while (bandera);

		System.out.println(salida);
	}
}
