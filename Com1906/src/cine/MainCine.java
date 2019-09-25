package cine;

import javax.swing.JOptionPane;

public class MainCine {

	public static void main(String[] args) {
		Butaca bu1 = new Butaca(1, 2);
		JOptionPane.showMessageDialog(null, bu1);
		bu1.ocupar();
		JOptionPane.showMessageDialog(null, bu1);
		
		Sala sal1 = new Sala(5, 8, 1, 5);
		JOptionPane.showMessageDialog(null, sal1);
		
	}

}
