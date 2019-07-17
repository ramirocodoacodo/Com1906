package tecnicas.u04;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Definimos variables
		int base, altura;
		double perimetro, superficie, hipotenusa;

		// Leer
		System.out.println("Ingrese base triangulo");
		base= teclado.nextInt();
		System.out.println("Ingrese altura triangulo");
		altura= teclado.nextInt();

		superficie= (base*altura)/2;
		System.out.println("la superficie es: " + superficie);

		hipotenusa= Math.sqrt(Math.pow(base, 2)+Math.pow(altura,2));
		
		perimetro=base+altura+hipotenusa;
		System.out.println("el perimetro es: " + perimetro);
	}

}
