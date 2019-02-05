package guia2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Guayabita {

	public static void main(String[] args) throws IOException {
		System.out.print("JUGAR GUAYABITA !!");
		Scanner leer = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int acumulado = 10;
		int cantidadJugadores = 0;
		int tiro1 = 0;
		int tiro2 = 0;
		int cantidadApostar = 0;
		boolean valorApostadoOk = false;
		
		//1. Pedir la cantidad de jugadores
		System.out.print("\n\nCantidad jugadores: ");
		cantidadJugadores = leer.nextInt();
		String[] vcJugadores = new String[cantidadJugadores];
		
		//2. Pedir los nombres de los jugadores
		System.out.print("\n");
		for(int i=0 ; i<vcJugadores.length ; i++) {
			System.out.print("Nombre del jugador " + (i + 1) + ": ");
			vcJugadores[i] = leer.next();
		}
		
		while (acumulado > 0) {
			//2. Turnos de los jugadores
			for(int i=0 ; i<vcJugadores.length ; i++) {
				tiro1 = 0;
				tiro2 = 0;
				valorApostadoOk = false;
				cantidadApostar = 0;
				
				System.out.print("\n\nTurno de " + vcJugadores[i]);
				System.out.print("\nAcumulado: " + acumulado);
				
				tiro1 = aleatorio.nextInt(6) + 1;
				System.out.print("\nTiro inicial: " + tiro1);
				
				if(tiro1 == 1 || tiro1 == 6) {
					System.out.print("\nEl tiro inicial fue 1 o 6, se coloca una moneda en el acumulado");
					acumulado++;
				} else {					
					System.out.print("\nCantidad a apostar: ");
					
					while (!valorApostadoOk) {
						cantidadApostar = leer.nextInt();
						if(cantidadApostar > acumulado) {
							System.out.print("\nLa cantidad a apostar no puede ser mayor que el acumulado. Ingrese de nuevo la cantidad a apostar: ");
						} else if(cantidadApostar <= 0) {
							System.out.print("\nLa cantidad a apostar no puede ser menor o igual a 0. Ingrese de nuevo la cantidad a apostar: ");
						}  
						else {
							valorApostadoOk = true;
						}
					}

					tiro2 = aleatorio.nextInt(6) + 1;
					System.out.print("\nSegundo tiro: " + tiro2);
					
					if(tiro2 > tiro1) {
						System.out.print("\nSegundo tiro mayor a primer tiro, usted gana: " + cantidadApostar);
						acumulado -= cantidadApostar;
					} else {
						System.out.print("\nSegundo tiro menor o igual primer tiro, usted pierde: " + cantidadApostar);
						acumulado += cantidadApostar;
					}
					
					if(acumulado == 0) {
						break;
					}
				}
			}
			
			if(acumulado == 0) {
				System.out.print("\n\nEl acumulado llego a 0");
				//System.out.print("\nGanador: " + vcJugadores[i]);
				System.out.print("\nFin del juego");
			}
		}
		
		leer.close();
	}

}