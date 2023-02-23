package contraseña;
import javax.swing.*;

public class Contrasena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave="Cameno2023"; //contraseña correcta
		String contrasena=""; //contraseña a introducir
		int contadorfallos=0; //contador de veces introducida incorrecta.
	
		while (contrasena.equals(clave)!=true && contadorfallos<3) {
			contrasena=JOptionPane.showInputDialog("Introduce la contrasena"); //panel introducir contraseña
			
			//comprobamos si es correcta
			if (contrasena.equals(clave)==true) { //si verdadera
				System.out.println ("Contraseña aceptada");
			} else {
				System.out.println("Contraseña incorrecta");
				contadorfallos++; //sumamos 1 fallo
			}
		} 
		
		if(contadorfallos>=3) {
			System.out.println("Limite de intentos alcanzados, cerrando programa");
		}
	}
}
