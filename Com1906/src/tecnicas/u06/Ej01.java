package tecnicas.u06;

import java.util.Scanner;

public class Ej01 {
	public static int leerEntero(String msj) {
		int num;
		Scanner objNum = new Scanner(System.in);
		System.out.println(msj);
		num = objNum.nextInt();
		return num;
	}
	
	public static void main(String[] args) {
		// Declaro un vector de tamaño 5
		int[] numeros = new int[5];
		
		numeros[0] = 1; // Establecer un valor (constante)
		numeros[3] = leerEntero("Ingrese un número: "); // Leer por teclado un número
		numeros[4] = 10;
		
		// Mostrar por pantalla el vector
		// Obtener todos los valores
		for (int i = 0; i < numeros.length; i++) { // Obtener longitud del arreglo
		// for (int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + " "); // Obtener un valor
		}
		System.out.println(); // Salto  de linea
		
		// Establecer todos los valores
		for (int i = 0; i < numeros.length; i++) { // Obtener longitud del arreglo
			numeros[i] = leerEntero("Ingrese un número: "); // Leer por teclado un número
		}
		System.out.println(); // Salto  de linea

		for (int num : numeros) System.out.print(num + " ");
		System.out.println(); // Salto  de linea
		
	}

}
