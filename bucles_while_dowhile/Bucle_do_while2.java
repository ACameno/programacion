package bucles_while_dowhile;

public class Bucle_do_while2 {
	public static void main(String[] args) {
		/*
		 * 2. Escriba un programa que muestre por pantalla todos los números múltiplos
		 * de tres entre 1000 y 1500, y que indique asimismo cuántos son.
		 */

		int valor = 1000;

		do {
			if (valor % 3 == 0) { // condicion para modulo
				System.out.println(valor);
			}
			valor++; // incrementar
		} while (valor <= 1500);
	}
}
