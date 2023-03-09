package areas;

import javax.swing.JOptionPane;

public class Areas {
	
	public static void area_circulo() {
		double radio= Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo"));
		double area= Math.PI* Math.pow(radio, 2); // pi por radio al cuadrado (metodo pow)
		JOptionPane.showMessageDialog(null, "El área del circulo de radio " + radio + " es: " + area);
	}
	
	public static void area_cuadrado() {
		double lado= Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
		double area= Math.pow(lado, 2); //lado al cuadrado
		JOptionPane.showMessageDialog(null, "El área del cuadrado de lado " + lado + " es: " + area);

	}
	
	public static void area_triangulo() {
		double base= Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triángulo"));
		double altura= Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triángulo"));
		double area = base*altura/2;
		JOptionPane.showMessageDialog(null, "El área del triángulo de base " + base + " y altura " + altura + " es: " + area);
	}
	
	public static void eleccion(int opcion) { //método que elige que se realizará a partir de la opción elegida inicialmente
			switch (opcion) {
			
			case -1: //salir
				JOptionPane.showMessageDialog(null, "has elegido salir del programa");
				break;
			case 0: //calcular área triángulo
				JOptionPane.showMessageDialog(null, "has elegido triángulo");
				area_triangulo();
				break;
			case 1: //calcular área círculo
				JOptionPane.showMessageDialog(null, "has elegido círculo");
				area_circulo();
				break;
			case 2: //calcular área cuadrado
				JOptionPane.showMessageDialog(null, "has elegido cuadrado");
				area_cuadrado();
				break;
			case 3 :
				JOptionPane.showMessageDialog(null, "has elegido salir del programa");
				break;
			}
			
			if(opcion!=-1 && opcion!=3) { //si distinto de -1 (click en "X" de la ventana) o 3 (Salir), volvemos a solicitar opción
				solicitar_opciones();
			}
	}
	
	public static void solicitar_opciones() {
		String opciones[]= {"Triángulo", "Círculo", "Cuadrado", "Salir"};
		int opcion=JOptionPane.showOptionDialog(null, "Elige tu figura", "opciones", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, opciones, "");
		
		eleccion(opcion); //llamada al método que actua según la opción elegida
	}
	
	public static void main(String[] args) {
		solicitar_opciones(); //abrimos ventana para elegir figura, con esto se ejecutará el programa hasta cierre
	}

}
