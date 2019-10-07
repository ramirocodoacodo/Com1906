package poo.u07;

import java.util.Scanner;

public class EjemploExcepciones {
	public static int validarEdad(int edad) throws IntervaloEdadException {
		if (edad < 0 || edad > 120) {
			throw new IntervaloEdadException("Edad no v�lida");
		} else
			return edad;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String edadStr = teclado.nextLine();
		int edad;

		try {
			edad = Integer.parseInt(edadStr);
			edad = validarEdad(edad);
			System.out.println("La edad ingresada es: " + edad);
		} catch (NumberFormatException e1) {
			System.out.println("Error en el n�mero ingresado");
		} catch (IntervaloEdadException e2) {
			System.out.println("Intervalo de edad fuera de rango");
		} catch (Exception e3) {
			System.out.println("Error no esperado!");
		}

	}

}