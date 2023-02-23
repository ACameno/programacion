package ejercicios_array2;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] nombres = { { "SA IZA", "SA BOTIJO", "SA ALMIJER", "SA GRANDE" },
				{ "SA GOLONDRINO", "SA CAMENO", "SA LOSAN", "SA ENZIO" },
				{ "SA AGUERA", "SA PETER", "SA AGUDO", "SA CASTLES" },
				{ "SA CARCAS", "SA ABASCAL", "VACIO", "VACIO" } };

		int edades[][] = new int[4][4];

		// objeto para generar entero aleatorio

		Random aleatorio = new Random();

		// rellenar edades

		for (int i = 0; i < edades.length; i++) {
			// columnas
			for (int j = 0; j < edades[i].length; j++) {
				// generamos aleatorio entre 0 y 100
				// solo si hay alumno
				if (nombres[i][j] != "VACIO") {
					edades[i][j] = aleatorio.nextInt(100);
				} else {
					// rellenamos con cero
					edades[i][j] = 0;
				}

			}
		}

		int contador = 1;
		// mostrar
		for (int i = 0; i < nombres.length; i++) {
			for (int j = 0; j < nombres[i].length; j++) {
				System.out.println("Puesto: " + contador + " Fila: " + (i + 1) + " Columna: " + (j + 1) + " es: "
						+ nombres[i][j] + " Edad: " + edades[i][j]);
				contador++;
			}
		}

	}

}
