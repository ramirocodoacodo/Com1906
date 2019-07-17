package tecnicas.u06;

import java.util.Scanner;

public class Ej02 {

	
	public static double leerNumero(String msj) {
		double num;
		Scanner objNum = new Scanner(System.in);
		System.out.println(msj);
		num = objNum.nextDouble();
		return num;
		
	}
	
	public static void mostrarArreglo (double [] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2) Desarrollar un algoritmo que permita mostrar un arreglo de enteros con
	sus valores a la mitad. Ejemplo: Arreglo {1,2,3,4}, la computadora
	muestra: 0.5 1.0 1.5 2.0. */
		
		
		int [] numeros= {2,3,9,8};
		
		for (double d : numeros) {
			System.out.println(d/2);
		}
		
		
	}

}
