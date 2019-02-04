/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Deissy Coral
 * Esta clase calcula si un numero pedido por teclado es primo
 */
public class primo {

	static Scanner entrada=new Scanner(System.in);
	static int cadena=0;
	static String esPrimo="";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System. out. println("Esta clase calcula si un numero pedido por teclado es primo");
		procesoPrimo();
	}
	private static void procesoPrimo() {
		// TODO Auto-generated method stub
		System. out. println("Digite un numero y luego enter:");
		try{
			cadena=Integer.parseInt(entrada.nextLine());
			calcular(cadena);
			System. out. println("El número "+cadena+" "+esPrimo+" es primo");
		}catch(Exception e) {
			System.out.println("Lo digitado no es un numero");
			System. out. println("Calculo indefinido");
		}
		System. out. println("Desea calcular otro numero? (S/N) ");
		if (entrada.nextLine().equals("S")){
			procesoPrimo();	
		}
	}
	private static void calcular(int cadena) {
		// TODO Auto-generated method stub
		int ciclo=1;
		esPrimo="SI";
		for (ciclo=2;ciclo<cadena;ciclo++) {
			if(cadena%ciclo==0) {
				esPrimo="NO";
				break;
			}
		}
	}

}
