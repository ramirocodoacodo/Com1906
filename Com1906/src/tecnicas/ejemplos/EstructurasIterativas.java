/*
 * Ejemplo de while, do-while y for:
 * Contador de 1 a 10
 * */
package tecnicas.ejemplos;

public class EstructurasIterativas {

	public static void main(String[] args) {
		final int MAX = 10;
		int cont;
		
		// while
		cont = 1;
		while (cont <= MAX) {
			System.out.println(cont);
			cont++;
		}

		// do-while
		cont = 1;
		do {
			System.out.println(cont);
			cont++;
		} while (cont <= MAX);

		// for
		for (int i = 0; i < MAX; i++) {
			System.out.println(i + 1);
		}
	}

}
