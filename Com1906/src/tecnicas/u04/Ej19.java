package tecnicas.u04;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		System.out.println("Ingrese el alto de la escalera: ");
		Scanner ent = new Scanner(System.in);

		int num = ent.nextInt();
		int filas = num;
		int col = num;

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("*");
			}
			System.out.println(""); // Salto de línea
			col--;
		}

		System.out.println(); // Salto de línea
		System.out.println("Resolución con un contador decreciente e if: ");
		// Resolución con un contador decreciente e if
		for (int i = 0; i < num; i++) {
			for (int j = num; j > 0; j--)
				if (i < j)
					System.out.print("*");
			System.out.println(""); // Salto de línea
		}
		
		System.out.println(); // Salto de línea
		System.out.println("Resolución con un contador decreciente pero sin if: "); // La condición está dentro del for
		for(int i=0; i<num; i++) {
			for(int k=num; k>i; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
