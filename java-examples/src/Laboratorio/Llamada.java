package Laboratorio;

import java.util.Scanner;

public class Llamada {

	public static void main(String[] args) {

		Scanner captura = new Scanner(System.in);
		double minuto = 0;
		double fija = 0;
		double min = 0;
		String opcion = "";
		/*
		 * Captura es el nÃºmero por leido por pantalla, min corresponde a minutos, a1
		 * es el dato real a multiplicar por $30, tol es resultado a pagar
		 */
		System.out.println("Bienvenido a su programa costo de llamada");
		System.out.println("Este programa le permite calcular el valor de su llamada.  Presione S para salir.");
		System.out.println("(Primero deberá parametrizar el valor del minuto y la tarifa fija)");
		System.out.println("Tarifa minuto: ");
		minuto = captura.nextDouble();
		System.out.println("Tarifa fija (de 1 a 3 minutos): ");
		fija = captura.nextDouble();
		do {
			System.out.println("Digite los minutos de su llamada: ");
			opcion = captura.next();
			try {
				if (!opcion.equals("S")) {
					min = Double.parseDouble(opcion);
				}
			} catch (Exception e) {
				System.out.println("No es un número, intente nuevamente ");
			}

			double a1 = 0;
			double tol = 0;

			if (min <= 3) {
				System.out.println("El valor de su llamada es de $" + String.valueOf(fija));
			} else if (min > 3) {
				a1 = min - 3;
				tol = a1 * minuto + fija;
				System.out.println("El valor de su llamada es $" + tol);
			}
		} while (!opcion.equals("S"));
		captura.close();
	}
}