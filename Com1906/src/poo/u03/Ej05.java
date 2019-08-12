package poo.u03;

import java.util.ArrayList;
import java.util.Random;

public class Ej05 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>(20);
		
		//numeros.add(12);
		Random rand = new Random();
		//numeros.add(rand.nextInt(10));
		
		System.out.println(numeros.toString());
		
		for (int i = 0; i < 10; i++) {
			numeros.add(rand.nextInt(10));
		}
		System.out.println(numeros);
	}

}
