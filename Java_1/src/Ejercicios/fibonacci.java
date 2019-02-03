/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Deissy Coral
 * Esta clase muestra la serie fibonacci hasta un numero pedido por teclado
 */
public class fibonacci {

	static Scanner entrada=new Scanner(System.in);
	static int cadena=0;
	static int serie[];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System. out. println("Esta clase muestra la serie fibonacci hasta un numero pedido por teclado");
		serieFib();
	}
	private static void serieFib() {
		// TODO Auto-generated method stub
		System. out. println("Digite un numero y luego enter:");
		try{
			cadena=Integer.parseInt(entrada.nextLine());
			calcular();
			System. out. println("La serie fibonnaci es:");
			int ciclo=0;
			for (ciclo=0;ciclo<cadena;ciclo++) {
				System. out. println(serie[ciclo]);
			}
		}catch(Exception e) {
			System.out.println("Lo digitado no es un numero");
			System. out. println("Serie indefinida");
		}
	}
	private static void calcular() {
		// TODO Auto-generated method stub
		serie=new int[cadena];
		int ciclo=0,ant=0,act=1;
		if(cadena>=2) {
			serie[0]=ant;
			serie[1]=act;
		}else if(cadena==1) {
			serie[0]=ant;
		}
		for (ciclo=2;ciclo<cadena;ciclo++) {
			serie[ciclo]=ant+act;
			ant=act;
			act=serie[ciclo];
		}
	}

}
