package chinos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Juego_de_los_Chinos {

	public static void main(String[] args) {

		// variables
		int num_monedas_jugador = 0; // numero que introduce el jugador.
		int num_monedas_maquina = 0; // numero que introduce la maquina.
		boolean turnos = true; // para determinar si le toca a jugador o máquina. Jugador=true Maquina=false;
		int solicitar_info; // comprobar si quiere ver las instrucciones
		int num_adivinar_jugador = 0; // numero introduce el jugador para adivinar
		int num_adivinar_maquina = 0; // numero introduce la maquina para adivinar
		int victorias_jugador = 0; // victorias jugador
		int victorias_maquina = 0; // victorias maquina
		String ganador = ""; // Quien gana la ronda

		Random aleatorio = new Random(); // objeto random

		solicitar_info = JOptionPane.showConfirmDialog(null, "¿Necesita las instrucciones del juego?",
				"Juego de los chinos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (solicitar_info == 0) { // si elige si

			JOptionPane.showMessageDialog(null,
					"Bienvenido al juego de los chinos \n" + "Va a jugar contra la maquina\n"
							+ "Cada turno se alterna quién comienza\n"
							+ "Cada jugador puede sacar entre 0 y 3 monedas\n"
							+ "Si adivina cuantas monedas han sacado entre los 2, gana\n"
							+ "El juego se acaba al introducir un número de monedas negativo\n" + "Buena suerte");
		}

		do {

			do {
				// solicitamos número y lo pasamos a entero
				num_monedas_jugador = Integer.parseInt(
						JOptionPane.showInputDialog("Introduce un número entre 0 y 3", "Introducir número de monedas"));
			} while (num_monedas_jugador > 3);

			if (num_monedas_jugador >= 0) {

				// generamos numero introducido de la máquina

				num_monedas_maquina = aleatorio.nextInt(3);

				if (turnos == true) { // turno del jugador

					JOptionPane.showMessageDialog(null, "EMPIEZA EL JUGADOR");
					num_adivinar_jugador = Integer.parseInt(JOptionPane.showInputDialog(
							"Introduce un número entre 0 y 6", "Introduce un numero para adivinar monedas"));

					do { // generar adivinar maquina
						num_adivinar_maquina = aleatorio.nextInt(6);
					} while (num_adivinar_maquina == num_adivinar_jugador || num_adivinar_maquina < num_monedas_jugador); 			
					// no puede ser igual al numero que ha adivinado el jugador
																									
					turnos = false; // cambiamos la variable para nuevo turno

				} else { // turno máquina

					JOptionPane.showMessageDialog(null, "EMPIEZA LA MÁQUINA");

					// generamos numero maquina primero

					do {
						num_adivinar_maquina = aleatorio.nextInt(6);
					} while (num_adivinar_maquina < num_monedas_jugador); // que el numero generado al menos sea igual a
																			// las monedas sacadas por el usuario

					turnos = true;

					do {
						num_adivinar_jugador = Integer.parseInt(JOptionPane.showInputDialog(
								"Introduce un número entre 0 y 6 distinto de: " + num_adivinar_maquina,
								"Introduce un numero para adivinar monedas"));
					} while (num_adivinar_jugador == num_adivinar_maquina);

				}

				if (num_adivinar_jugador == (num_monedas_jugador + num_monedas_maquina)) { // si jugador acierta
					victorias_jugador++;
					ganador = " Gana el jugador";
				} else if (num_adivinar_maquina == (num_monedas_jugador + num_monedas_maquina)) { // si acierta maquina
					victorias_maquina++;
					ganador = "Gana la máquina";
				} else {// si no acierta ninguno no se aumenta nada

					ganador = "No gana nadie";
				}

				JOptionPane.showMessageDialog(null,
						"Monedas jugador: " + num_monedas_jugador + "\n" + "Monedas máquina: " + num_monedas_maquina
								+ "\n" + "-----------------------------------------------\n"
								+ "Numero adivinado por jugador: " + num_adivinar_jugador + "\n"
								+ "Numero adivinado por maquina: " + num_adivinar_maquina + "\n"
								+ "--------------------------------------------------\n" + "Total monedas sacadas: "
								+ (num_monedas_jugador + num_monedas_maquina + "\n")
								+ "--------------------------------------------------\n" + ganador
								+ "\n--------------------------------------------------\n" + "Victorias jugador: "
								+ victorias_jugador + "\n" + "Victorias máquina: " + victorias_maquina);

			} else {
				JOptionPane.showMessageDialog(null, "Has introducido un número negativo de monedas. Fin programa");
			}
		} while (num_monedas_jugador >= 0);
	}
}
