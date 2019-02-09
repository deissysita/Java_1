package guia2;

import java.util.Scanner;

public class Vector10 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int x = 10;
		int[] vector = new int[x];
		
		System.out.println("Bienvenido a su programa vector");
		System.out.println("Este programa le mostrará de forma ascendente/descendete el vector");
		System.out.println("Digite los numeros de su vector(10)");
		
		//Leer números
		for (int i = 0; i < x; i++) {
			vector[i] = leer.nextInt();
		}
		
		//Ordenar vector con método burbuja
		vector = ordenarAscendentementeMetodoBurbuja(vector);
		
		//Imprimir vector
		System.out.println("Vector ordenado ascendentemente:\n");
		for (int i = 0; i < x; i++) {
			System.out.print(vector[i] + " ");
		}
		//Ordenar vector con método burbuja
		vector = ordenarDescendentementeMetodoBurbuja(vector);
				
		System.out.println("\n\nVector ordenado descendentemente:\n");
		for (int i = 0; i < x; i++) {
			System.out.print(vector[i] + " ");
		}
		
		leer.close();
	}
	
	private static int[] ordenarAscendentementeMetodoBurbuja(int[] vectorNuevo) {
		
		boolean hayCambios = true;
		int aux = 0;
		int cambios = 0;
		
		do {
			cambios = 0;
			for(int i=0 ; i<(vectorNuevo.length - 1) ; i++) {
				if (vectorNuevo[i] > vectorNuevo[i+1]) {
					aux = vectorNuevo[i+1];
					vectorNuevo[i+1] = vectorNuevo[i];
					vectorNuevo[i] = aux;
					cambios++;
				}
			}
			if(cambios == 0) {
				hayCambios = false;
			}
		} while(hayCambios);
		
		return vectorNuevo;
	}
	
	private static int[] ordenarDescendentementeMetodoBurbuja(int[] vectorNuevo) {
		
		boolean hayCambios = true;
		int aux = 0;
		int cambios = 0;
		
		do {
			cambios = 0;
			for(int i=0 ; i<(vectorNuevo.length - 1) ; i++) {
				if (vectorNuevo[i] < vectorNuevo[i+1]) {
					aux = vectorNuevo[i+1];
					vectorNuevo[i+1] = vectorNuevo[i];
					vectorNuevo[i] = aux;
					cambios++;
				}
			}
			if(cambios == 0) {
				hayCambios = false;
			}
		} while(hayCambios);
		
		return vectorNuevo;
	}
	
}