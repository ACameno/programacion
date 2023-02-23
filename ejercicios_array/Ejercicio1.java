package ejercicios_array;

public class Ejercicio1 {

	public static void main(String[] args) {
		// crear arrays
		int array01[] = new int[5];
		int array02[] = new int[5];

		// rellenar manual
		array01[0] = 1;
		array01[1] = 2;
		array01[2] = 3;
		array01[3] = 4;
		array01[4] = 5;
		array02[0] = 5;
		array02[1] = 10;
		array02[2] = 15;
		array02[3] = 20;
		array02[4] = 25;
		int suma_array;

		for (int i = 0; i < 5; i++) {
			// guardamos suma en variable
			suma_array = array01[i] + array02[i];

			// mostramos en pantalla
			System.out.println("El valor de array01[" + i + "] + array02[" + i + "] es: " + suma_array);
		}

	}

}
