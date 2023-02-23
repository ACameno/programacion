package bucles1;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * 2. Cree un programa que dibuje una escalera de números del 1 al 9, de tal
		 * manera que quede así:
		 */

		int numero = 1;
		String cadena = "1"; // va acumulando los valores en cadena de texto

		for (int i = 1; i < 10; i++) {
			System.out.println(cadena);
			cadena = cadena + (numero + i);
		}

	}

}
