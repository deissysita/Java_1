/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Deissy Coral
 * Esta clase suma los numeros pedido por teclado y muestra la serie inversa
 */
public class serieInversa {
	
	static Scanner entrada=new Scanner(System.in);
	static int numeros[]= new int[5];
	static int suma=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System. out. println("Esta clase suma los numeros pedido por teclado y muestra la serie inversa");
		invertirSerie();
	}
	private static void invertirSerie() {
		// TODO Auto-generated method stub
		int serie=0;
		System. out. println("Digite 5 numeros seguidos de enter:");
		try{
			for(serie=0;serie<5;serie++) {
				numeros[serie]=Integer.parseInt(entrada.nextLine());
			}
			calcular();
			System. out. println("La suma de los numeros es: "+suma);
			System. out. println("La serie inversa es:");
			for(serie=4;serie>=0;serie--) {
				System. out. println(numeros[serie]);
			}
		}catch(Exception e) {
			System.out.println("Lo digitado no es un numero");
			System. out. println("Calculo indefinido");
		}
	}
	private static void calcular() {
		// TODO Auto-generated method stub
		int serie=0;
		for(serie=0;serie<5;serie++) {
			suma+=numeros[serie];
		}
	}

}
