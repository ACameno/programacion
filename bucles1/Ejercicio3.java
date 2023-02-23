package bucles1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 3. Empleando bucles, dibuje por pantalla un arbolito de navidad de altura 6.

		String asterisco = "*";
		String espacio = "";
		String tuberia = "|";
		int fila = 1;

		for (int i = 0; i < 6; i++) { // bucle asteriscos

			for (int j = fila; j < 6; j++) { // bucle espacios
				espacio = espacio + " ";
			}
			System.out.println(espacio + asterisco + espacio);
			asterisco = asterisco + "*" + "*"; // meter 2 asteriscos
			espacio = ""; // reiniciar espacios
			fila++; // siguiente fila
		}

		for (int i = 0; i < 4; i++) { // bucle fila tuberia
			espacio = espacio + " ";
		}
		System.out.println(espacio + tuberia + tuberia + espacio);
	}

}
