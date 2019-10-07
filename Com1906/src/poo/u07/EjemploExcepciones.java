package poo.u07;

import java.util.Scanner;

public class EjemploExcepciones {
	
	public static int validarEdad(int edad) throws IntervaloEdadException {
		if (edad < 0 || edad > 120) {
			throw new IntervaloEdadException("Edad no válida");
		} else
			return edad;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		String edadStr = teclado.nextLine();
		int edad;

		try {
			edad = Integer.parseInt(edadStr);
			edad = validarEdad(edad);
			System.out.println("La edad ingresada es: " + edad);
		} catch (NumberFormatException e1) {
			System.out.println("Error en el formato del número ingresado");
		} catch (IntervaloEdadException e2) {
			//System.out.println("Intervalo de edad fuera de rango");
			System.out.println(e2.getMessage());
		} catch (Exception e3) {
			System.out.println("Error no esperado!");
		}

	}

}