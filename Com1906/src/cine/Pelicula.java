package cine;

public class Pelicula {
	private String nombre;
	private String genero;

	public Pelicula(String n) {
		nombre = n;
		genero = "";
	}
	public Pelicula(String n, String g) {
		nombre = n;
		genero = g;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		else {
			Pelicula other = (Pelicula) obj;
			if (nombre.equals(other.nombre))
				return true;
			else 
				return false;
		}
	}
	
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", genero=" + genero + "]";
	}
}
