package poo.u02;

public class Discografica {
	private DiscoMusical[] discografia;
	private String nombre;
	private int anioCreacion;
	private int cont;
	
	public Discografica(int tam, String nombre) {
		discografia = new DiscoMusical[tam];
		this.nombre = nombre;
		cont = 0;
	}
	
	public boolean agregarDisco(DiscoMusical disco) {
		// Codigo del método
		cont++;
		return true;
	}
	
	public String toString() {
		String texto = "";
		DiscoMusical disco;
		// Codigo del método
		for (int i = 0; i < cont; i++) {
			disco = discografia[i];
			texto += disco.toString() + "\n";
		}
		return texto;
	}
	
	
	
}
