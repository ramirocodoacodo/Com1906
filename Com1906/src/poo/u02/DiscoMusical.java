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
		texto = "El autor es: " + autor + ", titulo: "  + titulo + 
				" y el año de edición: " + anioEdicion + ".";
		return texto;
	}
}
