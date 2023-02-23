package matriz;

import java.util.Random;
import java.util.Scanner;

public class Multiplica_matriz {

	public static void main(String[] args) {
		
		//pedimos cantidad de filas y columnas
		
				Scanner valores= new Scanner(System.in); //objeto Scanner
				
				//solicitamos las dimensiones de las 2 matrices.
				
				System.out.println("Introduce la cantidad de filas de la primera matriz");
				int filas= valores.nextInt();
				System.out.println("Introduce la cantidad de columnas de la primera matriz");
				int columnas=valores.nextInt();
				System.out.println("Introduce la cantidad de filas de la segunda matriz");
				int filas2= valores.nextInt();
				System.out.println("Introduce la cantidad de columnas de la segunda matriz");
				int columnas2=valores.nextInt();
				valores.close();
				
				/*comprobamos que el numero de columnas de la primera matriz sea igual
				 al numero de filas de la segunda */
				
				if(columnas==filas2) { //si coinciden
					int matriz1[][]= new int [filas][columnas];
					int matriz2[][]= new int [filas2][columnas2];
					
					Random aleatorio = new Random(); //objeto numero aleatorio
					
					//rellenar con aleatorios enteros entre 0 y 10 las matrices 1 y 2
					
					for (int i = 0; i < matriz1.length; i++) {
						for (int j = 0; j < matriz1[i].length; j++) {
						matriz1[i][j]= aleatorio.nextInt(10);
						}
						System.out.println(""); // salto de linea
					}
					
					for (int i = 0; i < matriz2.length; i++) {
						for (int j = 0; j < matriz2[i].length; j++) {
						matriz2[i][j]= aleatorio.nextInt(10);
						}
						System.out.println(""); // salto de linea
					}
		
					/*la matriz resultante tiene filas de primera matriz 
					y columnas de la segunda como dimensiones*/
					
					int matriz_resultado[][]= new int [filas][columnas2]; 
					
					for (int i=0; i<matriz1.length; i++) { //recorremos filas de la primera matriz
						for (int j=0; j<matriz2[i].length;j++) { //recorremos columnas de la segunda
							for (int k=0; k<matriz2.length;k++) { //recorremos columnas de la primera matriz (coinciden con las filas de la segunda, es para calcular multiplicacion)
								matriz_resultado[i][j]+=matriz1[i][k]*matriz2[k][j];
							}
						}
					}
					
					// mostramos los contenidos de las matrices
					
					System.out.println("Matriz 1\n"); 

					for (int i = 0; i < matriz1.length; i++) {
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print(matriz1[i][j] + " "); //imprimimos el valor de la posicion y un espacio
						}
						System.out.println(""); // salto de linea
					}
					
					System.out.println("Matriz 2\n");
					
					for (int i = 0; i < matriz2.length; i++) {
						for (int j = 0; j < matriz2[i].length; j++) {
							System.out.print(matriz2[i][j] + " "); //imprimimos el valor de la posicion y un espacio
						}
						System.out.println(""); // salto de linea
					}
					
					System.out.println("Matriz resultado\n");
					
					for (int i = 0; i < matriz_resultado.length; i++) {
						for (int j = 0; j < matriz_resultado[i].length; j++) {
							System.out.print(matriz_resultado[i][j] + " "); //imprimimos el valor de la posicion y un espacio
						}
						System.out.println(""); // salto de linea
					}

				} else { //si no coinciden las dimensiones
					System.out.println("las columnas de la primera matriz no coinciden con las filas de la segunda \nSaliendo del programa");
				}

	}

}