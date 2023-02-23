package ejercicios_array;

public class Ejercicio2 {

	public static void main(String[] args) {
		// declarar array
		int enteros1a100[] = new int[100];
		float suma = 0;
		float media = 0;

		for (int i = 0; i < 100; i++) {
			// rellenar con valores de 1 a 100
			enteros1a100[i] = i + 1;

			// sumar
			suma += enteros1a100[i];

		}

		System.out.println("La suma de los números 1 al 100 es: " + suma);

		// media
		media = suma / 100;
		System.out.println("La media de los números 1 al 100 es: " + suma / media);

	}

}
