package bucles1;

public class Ejercicio1 {

	public static void main(String[] args) {
		String asterisco = "*";
		for (int i = 0; i < 10; i++) {
			System.out.println(asterisco);
			asterisco = asterisco + "*"; // añadimos asterisco para siguiente vuelta
		}
	}
}
