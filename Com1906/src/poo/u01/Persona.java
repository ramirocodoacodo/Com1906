package poo.u01;

public class Persona {
	private String nombre;
	private double altura;
	private int edad;
	private String genero;

	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String nombre, int edad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	public int getEdad() {
		return edad;
	}

}
