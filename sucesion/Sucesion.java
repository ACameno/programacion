package sucesion;

import javax.swing.JOptionPane;

/**
 * @author aaloca3
 *
 */

public class Sucesion {

	public static void main(String[] args) {
	
		long x=Long.parseLong(JOptionPane.showInputDialog("Introduzca el término x:","Introduzca un número entero"));
		long n=Long.parseLong(JOptionPane.showInputDialog("Introduzca el término n:","Introduzca un número entero"));

		long factorial=0;
		long potencia=0;
		double resultado=0;
		
		
		//calculo del factorial y la potencia
		for (int i=0; i<=n; i++) {
			if (i==0) { //cuando estamos en 0!
				
				factorial=1;
				potencia=1;
				resultado=potencia/factorial; //añadimos al resulado cuando x^0/0!
				
			} else { //si mayor de 0
				
				resultado+=potencia/factorial; //sumamos al resultado anterior el valor nuevo
				// System.out.println(potencia/factorial); para ir viendo valores bien
			}
		}
		
		JOptionPane.showMessageDialog(null, "Resultado de la serie:\n" + resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
