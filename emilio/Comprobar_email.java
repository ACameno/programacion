package email;

import javax.swing.JOptionPane;

public class Comprobar_email {

	public static void main(String[] args) {
		
		
		String correo=JOptionPane.showInputDialog("Introduce un correo electrónico", "ejemplo@dominio.com"); //panel introducir correo
		int cant_arrobas=0; //cantidad de arrobas (maximo de 1 para valido)
		boolean tiene_punto=false; //si tiene puntos o no		
		for(int i=0; i<correo.length(); i++) {
			if(correo.charAt(i)=='@') { //comprobar si tiene arroba
				cant_arrobas++;
			} else {
				if (correo.charAt(i)=='.') { //comprobar si tiene punto
					tiene_punto=true; //ponemos booleano tiene_punto en true (verdadero)
				}
			}
			
		}
		
		if(tiene_punto==true && cant_arrobas==1) { //si es valido
			System.out.println("El correo introducido es válido");
		} else { //si invalido
			System.out.println("El correo introducido es inválido");
		}
	}

}
