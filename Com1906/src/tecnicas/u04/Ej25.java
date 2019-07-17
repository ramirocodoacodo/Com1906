package tecnicas.u04;

import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String clave;
		clave = "";

		int i = 1;
		while (!clave.equals("Eureka") && i <= 3) {
			i++;
			System.out.println("ingrese la contraseña");
			clave = teclado.nextLine();
		}
		
		if (i > 3) {
			System.out.println("agotado el numero intentos");
		}
	}

}
