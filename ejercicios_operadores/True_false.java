package ejercicios_operadores;

public class True_false {

	public static void main(String[] args) {
		/*
		 * 3. Dados los valores a=11 y b=8. Muestre por pantalla(con un true o false,
		 * usando operadores de relación):
		 */

		int a = 11;
		int b = 8;
		boolean res_cond;

		// Si a es mayor o igual que b.

		res_cond = a >= b;

		System.out.println("A es mayor o igual que b: " + res_cond);

		// Si b es mayor o igual que a.

		res_cond = a <= b || a == b;

		System.out.println("b es mayor o igual que a: " + res_cond);

		// Si a es mayor que b más uno o que b es divisible por 2.

		res_cond = a > (b + 1) && b % 2 == 0;

		System.out.println("a es mayor que b más uno o que b es divisible por 2: " + res_cond);

		// Si b es menor o igual que 8 y que a dividido entre b es menor o igual que 7.

		res_cond = b <= 8 && a / b <= 7;

		System.out.println("b es menor o igual que 8 y que a dividido entre b es menor o igual que 7: " + res_cond);

	}

}
