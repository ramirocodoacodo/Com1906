package poo.ejemplos;

import javax.swing.JOptionPane;

public class MainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("", "Escalante Leiva", 28);
		p1.cambiarNombre("Ramiro");
		//p1.saludar();
		Persona p2 = new Persona("Juan");
		//JOptionPane.showMessageDialog(null, p1.getNombre());
		//JOptionPane.showMessageDialog(null, p2.getNombre());
		
		//System.out.println(p1);
		
		Persona p3 = new Persona("Juan", "Perez", 10);
		Alumno a1 = new Alumno("Juan", "Perez", 10, "1234");
		System.out.println(p3);
		System.out.println(a1);
	}

}
