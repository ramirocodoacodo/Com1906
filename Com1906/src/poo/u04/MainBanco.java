package poo.u04;

public class MainBanco {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta("28000111", 1000);
/*		System.out.println(c1);
		c1.depositar(100);
		System.out.println(c1);
		c1.extraer(1200);
		System.out.println(c1);
		c1.extraer(200);
		System.out.println(c1);
*/
		Cuenta c2 = new Cuenta("28000222", "Juan", 20, "M", 150);
		System.out.println(c2);
}

}
