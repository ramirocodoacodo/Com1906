package tecnicas.u05;

import java.util.Scanner;

public class Calculadora2 {
	public static double leerNumero(String msj) {
		double num;
		Scanner objNum = new Scanner(System.in);
		System.out.println(msj);
		num = objNum.nextDouble();
		return num;
	}

	public static String leerTexto(String msj) {
		String txt;
		Scanner objStr = new Scanner(System.in);
		System.out.println(msj);
		txt = objStr.nextLine();
		return txt;
	}

	static boolean login(String user, String password) {
		boolean devuelve;
		final String USU= "ADMIN";
		final String PASS= "1234";

		if (user.equals(USU) && password.equals(PASS)) {
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
				System.out.println("Error!");
			break;
		default:
			break;

		}
		return result;
	}

	public static void main(String[] args) {
		// Inicializo variables
		boolean logOk = false; // flag que indica si hice el login correctamente
		int intentos = 0; // cantidad de intentos
		do {
			intentos++;
			// Ingreso Usu y Pass
			String usuario = leerTexto("Ingrese usuario: ");
			String clave = leerTexto("Ingrese contraseña: ");
			
			logOk = login(usuario, clave);

			if (!logOk)
				System.out.println("usuario o clave incorrectas");
			else {
				// Pido los datos para usar la funcion calcular
				String oper = leerTexto("Ingrese una operación (+, -, *, /): ");
				double num1 = leerNumero("Ingrese un número: ");
				double num2 = leerNumero("Ingrese otro número: ");

				System.out.println(calcular(oper, num1, num2));
			}
		} while (logOk || intentos < 3);
	}
}
