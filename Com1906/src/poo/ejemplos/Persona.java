package poo.ejemplos;

import javax.swing.JOptionPane;

public class Persona {
	// Atributos
	protected String nombre;
	private String apellido;
	// private String matricula;
	private int dni;
	private int edad;
	
	// Método Constructor
	public Persona(String nombre) {
		this.nombre = nombre;
		apellido = "";
		edad = 0;
	}

	public Persona(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		apellido = "";
		edad = 0;
	}

	// Métodos (Comportamiento)
	public void saludar() {
		JOptionPane.showMessageDialog(null, "Hola");
	}
	public void caminar() {
		System.out.println("Caminando...");
	}
	public String getNombre() {
		return nombre;
	}
	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}

	
	
	public int getEdad() {
		return edad;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	
}
