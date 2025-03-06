package com.generation;
/**
 * Para hacer el codigo mas ordenado y facil de modificar, se separo en dos archivos: Codigo4.java y Jugada.java. 
 * En Codigo4.java se mantiene la parte que interactua con el usuario, como pedir las jugadas y mostrar el resultado. 
 * 
 * En Jugada.java se colocaron los metodos que validan las jugadas y determinan al ganador. 
 * Esto ayuda a que el codigo sea mas claro y permite reutilizar la logica del juego sin mezclarla con la entrada de datos.
 * Tambien se cambio el switch por una estructura if-else para hacer la comparacion de jugadas mas sencilla y directa. 
 * Con switch habia que usar varios case y break, lo que hacia el codigo mas largo y con mas posibilidades de errores.
 * Con if-else las condiciones quedan mas compactas y faciles de leer, sin necesidad de usar una variable extra para guardar el resultado. 
 * Esto hace que el codigo sea mas eficiente y entendible.
 **/

import java.util.Scanner; // Se hizo la importacion necesario para el uso de Scanner

public class Codigo4 {
	public static void main (String [] args) {
			Scanner scanner = new Scanner(System.in); //Se agrego System.in y la "s" se cambio por scanner para que sea mas descriptivo y se sepa para que se utlizara
	
	 	// Se cambio "j1" por jugador1 y "j2" por jugador2"
	    
			System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
			String jugador1 = scanner.nextLine().toLowerCase(); // Se agrego "tolowerCase para convertir la entrada en minusculas
	    
			System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
			String jugador2 = scanner.nextLine().toLowerCase();
	    
			
	    if (!Jugada.esJugadaValida(jugador1) || !Jugada.esJugadaValida(jugador2)) { // Se agregó la función esJugadaValida para validar la entrada del usuario. También se reemplazó "==" por "||" para corregir la comparación y garantizar una validación correcta.

	      System.out.println("Error: Una de las entradas no es valida. Debe ser 'piedra', 'papel' o 'tijeras'.");
	    } else {
	    	Jugada.ganador(jugador1, jugador2);
	    }
	  // Se agrego el cerrar el escaner
		scanner.close();
	    }
	
}
