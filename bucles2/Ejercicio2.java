package bucles2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// 2. Tenemos un array de dimensión 2 de tamaño 3x5 con los siguientes valores:

		int array[][] = { { 2, -5, 7, -8, 1 }, { -1, 21, -9, 6, 1 }, { 1, 0, -1, 3, -2 } };
		int arraytemporal[] = new int[5]; // con solo contenido de fila para ir mostrando fila a fila
		// sumamos 2 a cada elemento
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = array[i][j] + 2;
			}
		}

		// mostramos
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				arraytemporal[j] = array[i][j]; // asignamos en la posicion del array temporal el valor actual de la
												// posicion en la que estamos
				System.out.print(arraytemporal[j] + " ");
			}
			System.out.println(""); // salto de linea
		}

		// invertimos valores
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = array[i][j] * -1;
			}
		}

		System.out.println("\n-------------------------------------------\n"); // salto de linea

		// mostramos
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				arraytemporal[j] = array[i][j]; // asignamos en la posicion del array temporal el valor actual de la
												// posicion en la que estamos
				System.out.print(arraytemporal[j] + " ");
			}
			System.out.println(""); // salto de linea
		}
	}

}
