package bucles_do_while2;

import java.util.Scanner;

public class Do_while1 {

	public static void main(String[] args) {
		/*
		 * 1. Cree un programa que dibuje una escalera de asteriscos de una altura que
		 * sea solicitada al usuario. Si el usuario introduce, por ejemplo, una altura
		 * de 5, el resultado será:
		 */

		Scanner introducir = new Scanner(System.in);
		System.out.println("introduzca altura");
		int altura = introducir.nextInt();
		int contador = 0;
		String asterisco = "*";
		do {
			System.out.println(asterisco);
			asterisco += "*";
			contador++;
		} while (contador != altura);

	}

}
