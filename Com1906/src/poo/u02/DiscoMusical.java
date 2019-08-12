package poo.u02;

public class DiscoMusical {
	private String titulo;
	private String autor;
	private int anioEdicion;
	private String formato;
	private boolean digital;

	public DiscoMusical() {
		titulo = "";
		autor = "";
		anioEdicion = 0;
	}

	public DiscoMusical(String titulo, String autor, int anioEdicion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioEdicion = anioEdicion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String t) {
		titulo = t;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioEdicion() {
		return anioEdicion;
	}

	public void setAnioEdicion(int anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	public String toString() {
		String texto = "";
		// Codigo
		texto = "El autor es: " + autor + ", titulo: " + titulo + " y el año de edición: " + anioEdicion + ".";
		return texto;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiscoMusical other = (DiscoMusical) obj;
		if (anioEdicion != other.anioEdicion)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	// public boolean equals(DiscoMusical disco) {
	/*
	public boolean equals(Object o) {
		DiscoMusical disco = (DiscoMusical) o;
		if (this.titulo.equals(disco.titulo) && 
				this.autor.equals(disco.autor) && 
				this.anioEdicion == disco.anioEdicion)
			return true;
		else
			return false;
	}
	*/
	
}
