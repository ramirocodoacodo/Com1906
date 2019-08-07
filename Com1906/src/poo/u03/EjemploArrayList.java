package poo.u03;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Ramiro");
		nombres.add("Juan");
		nombres.add(1, "Ana");
		
		for (String var : nombres) {
			System.out.println(var);
		}
		/*
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}
		for (Object obj : nombres) {
			System.out.println(obj);
		}
		*/
		System.out.println("Elemento eliminado: " + nombres.set(0, "Ezequiel"));
		nombres.remove(0); 
		for (String var : nombres) {
			System.out.println(var);
		}

	}

}
