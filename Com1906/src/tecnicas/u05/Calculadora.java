package tecnicas.u05;

import java.util.Scanner;

public class Calculadora {
	static boolean login(String user, String password) {
		boolean devuelve;

		if (user.equals("ADMIN") && password.equals("1234")) {
			devuelve = true;
		} else {
			devuelve = false;
		}

		return devuelve;

	}

	static double calcular(String oper, double n1, double n2) {
		double result = 0;
		switch (oper) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			if (n2 != 0)
				result = n1 / n2;
			else
				System.out.println("Error");
			break;
		default:
			break;

		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(login("ADMIN", "1234"));
		System.out.println(calcular("+", 2, 3));

		System.out.println("Ingrese su usuario");
		Scanner calc = new Scanner(System.in);
		String usuario = calc.nextLine();

		System.out.println("Ingrese su clave");
		String clave = calc.nextLine();

		if (login(usuario, clave) != true) {
			System.out.println("usuario o clave incorrectas");
		} else {

			System.out.println("Ingrese una operacion");
			Scanner calc1 = new Scanner(System.in);
			String oper = calc1.nextLine();

			System.out.println("Ingrese un numero");
			double num1 = calc.nextDouble();

			System.out.println("Ingrese otro numero");
			double num2 = calc.nextDouble();

			System.out.println(calcular(oper, num1, num2));

			calc.close();

		}

	}
}
