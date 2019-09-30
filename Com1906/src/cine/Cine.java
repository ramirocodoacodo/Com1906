package cine;

import java.util.ArrayList;
import java.util.Iterator;


public class Cine {
	private ArrayList<Pelicula> cartelera;
	private ArrayList salas;
	private ArrayList reservas;
	private ArrayList usuarios;
	private String nombre;
	private boolean estado;

	public Cine(String nombre) {
		cartelera = new ArrayList<Pelicula>();
		this.nombre = nombre;
		estado = true;
	}

	public boolean eliminarPelicula(Pelicula peli) {
		return cartelera.remove(peli);
	}
	public Pelicula eliminarPelicula(int pos) {
		return (Pelicula) cartelera.remove(pos);
	}
	
	public boolean agregarPelicula(Pelicula peli) {
		return cartelera.add(peli);
	}

	public boolean agregarPelicula(String nombre) {
		// Pelicula pelicula = new Pelicula(nombre);
		return cartelera.add(new Pelicula(nombre));
	}

	public String listarPeliculas() {
		String str = "";
		Iterator<Pelicula> it = cartelera.iterator();
		while (it.hasNext()) {
			Pelicula pelicula = (Pelicula) it.next();
			str += pelicula.toString() + "\n";
		}
		return str;
	}
}

