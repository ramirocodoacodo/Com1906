package tecnicas.u05;

import java.util.Scanner;

public class Ej02 {
	static int sumar(int num1, int num2) {
		return num1 + num2;
	}

	static int restar(int num1, int num2) {
		return num1 - num2;
	}

	static int operacion(String op, int num1, int num2) {
		int result = 0;
		switch (op) {
		case "S":
		case "s":
			result = sumar(num1, num2);
			break;
		case "R":
		case "r":
			result = restar(num1, num2);
			break;
		default:
			break;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingrese 2 números: ");
		int n1 = ent.nextInt();
		int n2 = ent.nextInt();

		System.out.println("Ingrese la operación a realizar: ");
		ent.nextLine(); // Limpio el buffer
		String op = ent.nextLine();

		System.out.println("Resultado: " + operacion(op, n1, n2));
	}

}
