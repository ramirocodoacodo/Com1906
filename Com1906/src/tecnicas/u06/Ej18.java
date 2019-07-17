package tecnicas.u06;

import java.util.Scanner;

public class Ej18 {
	public static void main(String[] args) {
		System.out.println("Ingrese tamaño del cine");
		boolean[][] butacas = cargarMatBoolRand(
				crearMatBool(obtenerEntero("Ingrese filas: "), obtenerEntero("Ingrese columnas: ")));

		mostrarButacas(butacas);

		System.out.println("Butacas libres: " + contarButacasLibres(butacas));
	}

	static int obtenerEntero(String msg) {
		System.out.print(msg);
		return Integer.valueOf(new Scanner(System.in).nextLine());
	}

	static boolean[][] crearMatBool(int filas, int columnas) {
		boolean[][] matSalida = new boolean[filas][columnas];
		return matSalida;
	}

	static boolean[][] cargarMatBoolRand(boolean[][] matEntrada) {
		boolean[][] matSalida = matEntrada;
		for (int i = 0; i < matEntrada.length; i++)
			for (int j = 0; j < matEntrada[i].length; j++)
				matSalida[i][j] = Math.round(Math.random() * 1) == 1 ? false : true;
		return matSalida;
	}

	static void mostrarButacas(boolean[][] matEntrada) {
		for (int i = 0; i < matEntrada.length; i++) {
			for (int j = 0; j < matEntrada[i].length; j++)
				System.out.print(matEntrada[i][j] + " ");
			System.out.println();
		}
	}

	static int contarButacasLibres(boolean[][] matEntrada) {
		int acum = 0;
		for (int i = 0; i < matEntrada.length; i++) {
			for (int j = 0; j < matEntrada[i].length; j++)
				acum += !matEntrada[i][j] ? 1 : 0;
		}
		return acum;
	}
}
