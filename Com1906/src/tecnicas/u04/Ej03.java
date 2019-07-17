package tecnicas.u04;
import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese dos números: ");
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		double cociente = (double)num1/num2;
		
		System.out.println("El resultado es: " + cociente);
		teclado.close();
	}

}
