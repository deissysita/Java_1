/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Deissy Coral
 * Esta clase calcula el factorial de un numero pedido por teclado
 */
public class factorial {

	 /*Variables*/
	static Scanner entrada=new Scanner(System.in);
	static int cadena=0;
	static int resultado=0;
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	datosFactorial();
	}
	
	private static void datosFactorial() {
		// TODO Auto-generated method stub
		System. out. println("Digite un numero y luego enter:");
		try{
			cadena=Integer.parseInt(entrada.nextLine());
			resultado=calcular();
			System. out. println("Factorial de "+cadena+" es: "+resultado);
		}catch(Exception e) {
			System.out.println("Lo digitado no es un numero");
			System. out. println("Factorial indefinido");
		}		
	}

	private static int calcular() {
		// TODO Auto-generated method stub
		int resultado=1, ciclo=1;
		for (ciclo=1;ciclo<=cadena;ciclo++) {
			resultado=resultado*ciclo;
		}
		return resultado;
	}

	
	/*Sets and gets*/
	

}
