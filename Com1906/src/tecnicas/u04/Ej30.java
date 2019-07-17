package tecnicas.u04;

import java.util.Scanner;

public class Ej30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2;
		
		do {
			num2 = sc.nextDouble();
			if (num2==0)
				System.out.println("Ingrese otro divisor.");
		} while (num2==0);

		System.out.println(num1/num2);
		sc.close();
	}

}
