package tecnicas.u04;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0, num, r;

		System.out.println("Ingrese un numero: ");
		num = teclado.nextInt();

		for (i = 1; i <= 10; i = i + 1) {
			r = num * i;
			System.out.println(num + " x " + i + " = " + r);
		}

	}

}
