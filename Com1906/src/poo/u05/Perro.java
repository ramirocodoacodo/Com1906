package poo.u05;

public class Perro extends AnimalTerrestre implements IAnimal {

	public Perro() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void caminar() {
		System.out.println("Perro caminando");
	}

	@Override
	public void emitirSonido() {
		System.out.println("Guau");
	}


}
