package tecnicas.u05;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un Numero del 1 al 12");
		int num = teclado.nextInt();

		if (obtenerMesEnTexto(num).equals(""))
			System.out.println("Ingrese un mes válido!");
		else
			System.out.println(obtenerMesEnTexto(num));
	}

	static String obtenerMesEnTexto(int num) {
		String mes = "";
		switch (num) {

		case 1:
			mes = "Enero";
			break;
		case 2:
			mes = "Febrero";
			break;

		case 3:
			mes = "Marzo";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;

		case 9:
			mes = "Septiembre";
			break;

		case 10:
			mes = "Octubre";
			break;

		case 11:
			mes = "Noviembre";
			break;
		case 12:
			mes = "Diciembre";
			break;
		default:
			mes = "";
			break;

		}
		return mes;
	}

}
