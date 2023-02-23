package bucles2;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Sume los elementos de un array de dimensión 1 que contiene los siguientes
		 * valores enteros: {3,4,-9,5,2,0,3,5,-7,17,3}.
		 */

		int vector[] = { 3, 4, -9, 5, 2, 0, 3, 5, -7, 17, 3 };
		int suma = 0; // variable sumatorio

		for (int i = 0; i < vector.length; i++) {
			suma = suma + vector[i];
		}

		System.out.println(suma);
	}

}
