package cine;

public class Sala {
	private int num;
	private int pasillo; // columna del pasillo
	private Butaca[][] butacas;

	public Sala(int filas, int asientos, int num, int pasillo) {
		this.num = num;
		butacas = new Butaca[filas][asientos];
		this.pasillo = pasillo;
		inicializarSala();
	}

	private void inicializarSala() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				butacas[i][j] = new Butaca(i,j);
				if (j == pasillo)
					butacas[i][j].pasillo();
			}
		}
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				str = str + butacas[i][j].getEstado() + " ";
			}
			str = str + "\n";
		}
		return str;
	}
}
