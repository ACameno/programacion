package ejercicios_array;

public class Clase_Matrices {

	public static void main(String[] args) {

		// crear matriz
		int columnas = 5;
		int filas = 7;
		int contador = 0;
		int matriz[][] = new int[filas][columnas];

		// rellenar matriz

		// filas
		for (int i = 0; i < filas; i++) {
			// columnas
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = contador;
				contador++;
			}
		}

		// mostrar contenido

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("El valor de la posicion " + i + "," + j + " es: " + matriz[i][j]);
			}
		}

		// dimensiones

		System.out.println("la cantidad de filas es: " + matriz.length);
		System.out.println("la cantidad de columnas es: " + matriz[0].length);
	}

}
