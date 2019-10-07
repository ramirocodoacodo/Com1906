package poo.u05;

public class MainAnimal {

	public static void main(String[] args) {
		Gato gato1 = new Gato();
		gato1.emitirSonido();
		Perro perro1 = new Perro();
		perro1.emitirSonido();

		AnimalTerrestre animal = new Gato();
		animal.emitirSonido();
	}

}
