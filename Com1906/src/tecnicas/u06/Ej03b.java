package tecnicas.u06;

public class Ej03b {
	static void mostrarArrayEspejado(char[] arrEntrada) {
		//arrEntrada[2] = 'M';
		for (int i = arrEntrada.length - 1; i >=0; i--) {
			System.out.print(arrEntrada[i]);
		}
	}

	public static void main(String[] args) {
		char[] caracteres = { 'a', 'v', 'a', 'J' };
		mostrarArrayEspejado(caracteres);
	}

}
