package com.generation;

// Contiene la logica validacion
public class Jugada {
	// Sirve para verificar si la entrda es válida
	public static boolean esJugadaValida(String jugada) {
		return jugada.equals("piedra") || jugada.equals("papel") || jugada.equals("tijeras");
	}

	// Sirve para saber el ganador
	public static void ganador(String jugador1, String jugador2) {
		if (jugador1.equals(jugador2)) { // Se usa .equals() para comparar el contenido de los Strings
			System.out.print("Empate");
		} else if ((jugador1.equals("piedra") && jugador2.equals("tijeras"))
				|| (jugador1.equals("papel") && jugador2.equals("piedra"))
				|| (jugador1.equals("tijeras") && jugador2.equals("papel"))) {
			System.out.print("Gana el jugador 1");
		} else {
			System.out.print("Gana el jugador 2");
		}
	}
}
