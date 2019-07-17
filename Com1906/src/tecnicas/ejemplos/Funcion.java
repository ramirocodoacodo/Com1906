/*
 * Ejemplo de definición e invocación de una función en Java
 * */
package tecnicas.ejemplos;

public class Funcion {
	
	// Declarando la funcion sumar
	static double sumar(int num1, int num2) {
		return num1+num2;
	}
	
	public static void main(String[] args) {
		double suma;
		
		suma = sumar(2,3); // Invocando la funcion sumar

		System.out.println("El resultado de la suma es: " + suma);
	}

}
