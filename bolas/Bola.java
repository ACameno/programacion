package bolas;

import javax.swing.JOptionPane;

public class Bola {
	
	int numero;
	String color;
	static int peso=165;
	
	public Bola(int numero, String color) {
		this.numero = numero;
		this.color = color;
	}
	
	
	public static void suma(Bola bola1, Bola bola2) {
		
		JOptionPane.showMessageDialog(null, "la suma de las bolas: "+bola1.numero + " "+ bola1.color +" y "+bola2.numero+" "+bola2.color +" es: "+ (bola1.numero+bola2.numero));
	}
	
	public void color() {
		JOptionPane.showMessageDialog(null, this.color);
	}
}
