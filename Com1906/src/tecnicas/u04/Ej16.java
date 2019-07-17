package tecnicas.u04;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num = teclado.nextInt();

		// do-while
		int i = 1;
		do {
			System.out.println(i + num);
			i++;
		} while (i <= 10);
		
		// while
		i = 0;
		while (i < 10) {
			i++;
			System.out.println(i + num);
		}

		// for
		for (int j = num; j < num + 10; j++) {
			System.out.println(j + 1);
		}
	}
}
