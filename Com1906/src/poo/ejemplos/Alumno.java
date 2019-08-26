package poo.ejemplos;

public class Alumno extends Persona {
	private String matricula;
	
	public Alumno(String n) {
		super(n);
	}
	
	public Alumno(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
	}
	
	public Alumno(String nombre, String apellido, int dni, String matricula) {
		super(nombre, apellido, dni);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		// return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Edad: " + getEdad() + ", Matrícula: " + matricula;
		return super.toString() + " Matrícula: " + nombre;
	}
}
