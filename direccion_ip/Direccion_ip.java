package direccion_ip;

import javax.swing.JOptionPane;

public class Direccion_ip {
	
	//método que comprueba si la longitud está entre 0 y 15 y devuelve una condición
	public static boolean comprobar_validez_longitud(String cadenaIP) {
		boolean comprobacion;
		if(cadenaIP.length()>15 || cadenaIP.length()<=0) {
			comprobacion=false;
		} else {
			comprobacion=true;
		}
		return comprobacion;
	}
	
	//metodo que cuenta y devuelve el número de puntos 
	
	public static int contarPuntos (String cadenaIP) {
		int contadorPuntos=0;
		
		for (int i=0; i<cadenaIP.length(); i++) { //recorre la cadena carácter a carácter.
			if(cadenaIP.charAt(i)=='.') {
				contadorPuntos++;
			}
		}
		return contadorPuntos;
	}
	
	/*método que comprueba si hay 3 puntos, a partir del método anterior que los contaba
	 * devuelve una condición
	 */
	
	public static boolean comprobar_validez_puntos(String cadenaIP) {
		boolean comprobacion;
		int contadorPuntos=contarPuntos(cadenaIP); //contamos puntos y guardamos en variable
		
		if(contadorPuntos !=3) { //comprueba si 3 puntos
			comprobacion=false;

		} else {
			comprobacion=true;		
		}
		
		return comprobacion;
	}
	
	/*metodo que separa e introduce en un vector la IP introducida anteriormente
	 * devuelve el vector*/
	
	public static String[] dividir_cadena (String cadenaIP) {
		
		String [] cadena= new String[contarPuntos(cadenaIP)+1]; //+1 porque tras el último punto hay otro indice con texto
		int puntos=0;
		for (int i=0; i<cadena.length; i++) { //inicializar array
			cadena[i]="";
		}	
		for(int i=0; i<cadenaIP.length(); i++) {
					if(cadenaIP.charAt(i)!='.') {
					cadena[puntos]+=String.valueOf(cadenaIP.charAt(i));
					} else {
				puntos++;
				
					}
			}
		return cadena;
	}
	
	//metodo que comprueba si se han introducido numeros enteros y devuelve una condicion
	public static boolean comprobar_entero( String[] cadena) {
		boolean comprobar;
		int provisionalEntero;
		try {
			for (int i=0; i<cadena.length; i++) {
				provisionalEntero= Integer.parseInt(cadena[i]);
			}
			comprobar=true;
		} catch (NumberFormatException e) {
			comprobar=false;
		}
		return comprobar;
	}
		
	//método que comprueba si la IP está entre 0 y 255. Devuelve una condición
	
	public static boolean comprobar_valor_ip( String[] cadena) {
		boolean comprobar=true;
		for (int i=0; i<cadena.length; i++) {
			if(Integer.parseInt(cadena[i])<=255 && Integer.parseInt(cadena[i])>=0 && comprobar==true) {
				comprobar=true;
			} else {
				comprobar=false;
			}
		}
		return comprobar;
	}
	
	
	public static void main(String[] args) {
		String IP= JOptionPane.showInputDialog("Introduce una dirección IP versión 4"); //introducimos IP
		String [] cadena_vector= dividir_cadena(IP); //llamamos al método para convertir a vector
		
		//comprobamos las condiciones y devolvemos mensaje según resultado de las comprobaciones
		
		if(comprobar_validez_longitud(IP)== false || comprobar_validez_puntos(IP)== false ||
				comprobar_entero(cadena_vector)==false || comprobar_valor_ip(cadena_vector)==false ) {
			JOptionPane.showMessageDialog(null, "La IP "+ IP+ " no es válida" );	
		} else {
			JOptionPane.showMessageDialog(null, "La IP "+ IP+ " es válida" );
		}
	}
}
