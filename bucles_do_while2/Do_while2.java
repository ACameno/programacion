package bucles_do_while2;

import java.util.Scanner;

public class Do_while2 {

	public static void main(String[] args) {
		/*
		 * 2. Dibuje por pantalla un arbolito de navidad de la altura que le pida el
		 * usuario. Ejemplo con valor 6:
		 */

		Scanner introducir = new Scanner(System.in);
		System.out.println("introduzca altura");
		int altura = introducir.nextInt();
		int filas_restantes = 1; // contador para calcular la cantidad de espacios según la fila en la que estemos
		String asteriscos = "*";
		int fila_actual = 1; // fila actual del arbol
		String espacios = "";
		int contador = 0; // contador espacios para ultima fila
		int i = 1;

		while (fila_actual <= altura) { // while que va recorriendo cada fila

			while (filas_restantes < altura) { // while para calcular el número de espacios de una fila determinada
				espacios = espacios + " ";
				filas_restantes++;
			}

			System.out.println(espacios + asteriscos + espacios); // mostramos los datos
			asteriscos = asteriscos + "*" + "*"; // añadir 2 asteriscos para la siguiente fila
			espacios = ""; // reiniciamos espacios para siguiente fila;
			fila_actual++; // incrementamos fila actual
			filas_restantes = fila_actual; // igualamos la fila actual al contador para calcular espacios
			contador++;
		}

		while (i < contador) { // para calcular los espacios de la última linea. El contador es el numero de espacios
			espacios = espacios + " ";
			i++;
		}
		System.out.println(espacios + "||" + espacios); // imprimimos las tuberias

	}
	
	

}
