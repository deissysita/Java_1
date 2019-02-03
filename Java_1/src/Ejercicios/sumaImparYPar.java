/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Deissy Coral
 * Esta clase suma los numeros pares e impares a partir de un numero pedido por teclado
 */
public class sumaImparYPar {

	static Scanner entrada=new Scanner(System.in);
	static int cadena=0,impar=0,par=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System. out. println("Esta clase suma los numeros pares e impares a partir de un numero pedido por teclado");
		sumarParesImpares();
	}

	private static void sumarParesImpares() {
		// TODO Auto-generated method stub
		System. out. println("Digite un numero y luego enter:");
		try{
			cadena=Integer.parseInt(entrada.nextLine());
			calcular();
			System. out. println("La suma de los numeros impares es: "+impar);
			System. out. println("La suma de los numeros pares es: "+par);
		}catch(Exception e) {
			System.out.println("Lo digitado no es un numero");
			System. out. println("Suma indefinida");
		}
	}

	private static void calcular() {
		// TODO Auto-generated method stub
		int ciclo=1;
		for (ciclo=1;ciclo<=cadena;ciclo++) {
			if(ciclo%2==0) {
				par+=ciclo;
			}else {
				impar+=ciclo;
			}
		}
	}
}
