package poo.ejemplos;

import javax.swing.JOptionPane;

public class MainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("", "Escalante Leiva", 28);
		p1.cambiarNombre("Ramiro");
		p1.saludar();
		Persona p2 = new Persona("Juan");
		JOptionPane.showMessageDialog(null, p1.miNombre());
		JOptionPane.showMessageDialog(null, p2.miNombre());
		
		System.out.println(p1);
	}

}
