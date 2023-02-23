package matriz;
import java.util.Scanner;

public class Suma_matriz {

	public static void main(String[] args) {
		
		
		//pedimos cantidad de filas y columnas
		
		Scanner valores= new Scanner(System.in); //objeto Scanner
		System.out.println("Primera matriz");
		System.out.println("Introduce la cantidad de filas de la primera matriz");
		int filas= valores.nextInt();
		System.out.println("Introduce la cantidad de columnas de la segunda matriz");
		int columnas=valores.nextInt();
		
		//declaramos la matriz vacia con el tamaño especificado anteriormente por el usuario
		
		int matriz[][]= new int[filas][columnas];
		
		for(int i=0; i<matriz.length;i++) { //bucle que recorre filas
			for (int j=0; j<matriz[i].length;j++) { //bucle que recorre columnas
				/*mostramos entrada, sumamos 1 al valor mostrado ya que el indice de la matriz
				 empieza en 0 pero el numero de fila y columna en 1*/
				
				System.out.println("Introduce el valor de la fila " + (i+1) + " columna " +(j+1));
				
				//introducimos los datos en la posicion actual
				
				matriz[i][j]=valores.nextInt();								
			}
		}
		
		//pedimos datos de segunda matriz
		System.out.println("Segunda Matriz");
		System.out.println("Introduce la cantidad de filas de la segunda matriz");
		int filas2= valores.nextInt();
		System.out.println("Introduce la cantidad de columnas de la segunda matriz");
		int columnas2=valores.nextInt();	
		
		//creamos la segunda matriz
		
		int matriz2 [][]= new int[filas2][columnas2];
		
		if(filas2!=filas || columnas2!=columnas) {
			System.out.println("Las dimensiones de las matrices no coinciden. No se puede realizar la operación. FIN PROGRAMA");
		} else {
			
			//mismo procedimiento para introducir datos que en la primera matriz
			
			for(int i=0; i<matriz2.length;i++) { 
				for (int j=0; j<matriz2[i].length;j++) { 
					System.out.println("Introduce el valor de la fila " + (i+1) + " columna " +(j+1));
					matriz2[i][j]=valores.nextInt();
				}
			}
			
			valores.close(); //cerramos objeto Scanner
			
			System.out.println("Matriz 1\n"); // salto de linea entre segunda matriz y la suma

			
			// mostramos el contenido de la matriz
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + " "); //imprimimos el valor de la posicion y un espacio
				}
				System.out.println(""); // salto de linea
			}
			
			System.out.println("\nMatriz 2\n"); // salto de linea entre segunda matriz y la suma

			// mostramos el contenido de la matriz 2
			
			for (int i = 0; i < matriz2.length; i++) {
				for (int j = 0; j < matriz2[i].length; j++) {
					System.out.print(matriz2[i][j] + " "); 
				}
				System.out.println("");
			}
			
			System.out.println("\n-------------------------------------------\nSuma de matrices\n"); // salto de linea entre segunda matriz y la suma

			
			//sumamos ambas matrices
			
			for (int i = 0; i < matriz.length; i++) { //recorremos la primera matriz ya que ambas coinciden
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print((matriz[i][j]+matriz2[i][j]) + " "); 
				}
				System.out.println("");
			}
		
		}

	}	
}
