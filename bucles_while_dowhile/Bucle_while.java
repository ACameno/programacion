package bucles_while_dowhile;

import java.util.Scanner;

public class Bucle_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Escriba un programa que solicite al usuario un número entre 0 y 999.
		 * Deberá devolver el cuadrado del número por consola. Se seguirá ejecutando
		 * mientras el usuario no introduzca el número cero, en cuyo momento finalizará.
		 */

		int numero = 0;

		Scanner objeto = new Scanner(System.in); // Objeto Scanner
		do {
			System.out.println("Introduce un numero entre 0 y 1000");
			numero = objeto.nextInt(); // Leer numero introducido

			while (numero >= 1000 || numero < 0) {
				System.out.println("Número invalido: Introduce un numero entre 0 y 100");
				numero = objeto.nextInt(); // Leer numero introducido
			}
			if (numero != 0) {
				numero = numero * numero; // elevamos al cuadrado
				System.out.println("el número introducido es: " + numero);
			} else { // Si introducido 0
				System.out.println("FIN PROGRAMA");
			}
		} while (numero != 0);
	}

}
