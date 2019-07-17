package tecnicas.u04;

import java.util.Scanner;

public class Ej19Bis {

	/* Crear un programa que muestre en pantalla una escalera inversa de asteriscos.
	 * La cantidad de filas de la escalera se ingresa por teclado. Utilice la
	 * instrucción for.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad de filas: ");
		int cantAsteriscos =  sc.nextInt();
		int lineas = cantAsteriscos;
		
		for (int i = 0; i < lineas; i++) {
			for (int j = 0; j < cantAsteriscos; j++) {
				System.out.print("*");
			}
			cantAsteriscos--;
			System.out.println("");
		}
		
		sc.close();
	}

}
