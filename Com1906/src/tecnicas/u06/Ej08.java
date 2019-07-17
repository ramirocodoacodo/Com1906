/*
 * Desarrollar un algoritmo que permita ingresar 5 números 
 * pertenecientes al arreglo A y otros 5 números 
 * pertenecientes al arreglo B. La computadora crea y 
 * muestra un arreglo C, donde cada posición es el 
 * resultado de la suma del número en la misma posición en 
 * el arreglo A con el número en la misma posición en el 
 * arreglo B. Ejemplo: Se ingresa 1 2 3 4 5 y 4 7 1 3 6 la 
 * computadora muestra: 5 9 4 7 11.
 * */

package tecnicas.u06;

import java.util.Scanner;

public class Ej08 {
	public static int leerNumero(String msj) {
		Scanner objNum = new Scanner(System.in);
		System.out.println(msj);
		return objNum.nextInt();
	}
	
	// pre: recibe un vector de n elementos
	// pos: carga el vector con números ingresados por el usuario
	public static void cargarVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = leerNumero("Ingrese el elemento de la posición " + i + ": ");
		}
	}
	
	// pre: recibe un vector de n elementos
	// pos: muestra el conteido del vector por consola
	public static void mostrarVector(int[] vector) {
		for (int elem : vector)
			System.out.print(elem + " ");
		System.out.println();
	}
	
	// pre: recibe dos vectores de números
	// pos: devuelve la suma de ellos en un 3er vector
	public static void sumarVectores(int[] v1, int[] v2, int[] v3) {
		for (int i = 0; i < v1.length; i++) {
			v3[i] = v1[i] + v2[i];
		}
	}
	
	public static void main(String[] args) {
		// Declaro los 3 vectores
		int vectorA[] = new int[5];
		int vectorB[] = new int[5];
		int vectorC[] = new int[5];
		
		cargarVector(vectorA);
		cargarVector(vectorB);
		sumarVectores(vectorA, vectorB, vectorC);
		mostrarVector(vectorC);
	}

}
