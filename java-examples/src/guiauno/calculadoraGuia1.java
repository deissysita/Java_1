package guiauno;

import java.util.Scanner;

public class calculadoraGuia1 {

	public static void main(String[] args) {

		System.out.println("Bienvenido a su calculadora");
		System.out.println("Este programa realiza operaciones básicas de cálculo/nPor favor digite la opción");
		System.out.println("...........................");
		System.out.println("1. suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Cuadrado de un número");
		System.out.println("6. Porcentaje de un número");
		System.out.println("7. Raiz cuadrada de un numero");
		System.out.println("8. Salir");

		int opc = 0;

		Scanner captura = new Scanner(System.in);
		System.out.println("Por favor digite la opcion que desea realizar");
		opc = captura.nextInt();

		double num1 = 0;
		double num2 = 0;
		double num3 = 0;

		switch (opc) {
		case 1: 
			System.out.println("Por favor digite el primer número");
			try {
				num1 = captura.nextDouble();			
			System.out.println("Por favor digite el segundo número");

				num2 = captura.nextDouble();
			
			double suma = num1 + num2;
			System.out.println("La suma es " + suma);
			} catch (Exception e1) {
				System.out.println("Por favor digite numeros validos");
			}

			break;
		

		case 2: 
			try {
			System.out.println("Por favor digite el primer número");
			num1 = captura.nextDouble();
			System.out.println("Por favor digite el segundo número");
			num2 = captura.nextDouble();
			double resta = num1 - num2;
			System.out.println("El residuo es " + resta);
		} catch (Exception e1) {
			System.out.println("Por favor digite numeros validos");
		}

			break;
		
		case 3: 
			try {
			System.out.println("Por favor digite el primer factor");
			num1 = captura.nextDouble();
			System.out.println("Por favor digite el segundo factor");
			num2 = captura.nextDouble();
			double multi = num1 * num2;
			System.out.println("El producto es " + multi);
			} catch (Exception e1) {
				System.out.println("Por favor digite numeros validos");
			}

			break;
		

		case 4: 
			try {
			System.out.println("Por favor digite el numerador");

			num1 = captura.nextDouble();
			do {
				System.out.println("Por favor digite el denominador");
				num3 = captura.nextDouble();
				if (num3 <= 0) {
					System.out.println("¡Error, el denominador no puede ser cero ni menor!");
					System.out.println("Por falvor vuelva a digitar el denominador");
				}else {
					double div = num1 / num3;
					System.out.println("El cociente es " + div);
				}
			} while (num3 <= 0);
			} catch (Exception e1) {
				System.out.println("Por favor digite numeros validos");
			}

			break;
		
		case 5: 
			try {
			System.out.println("Por favor digite el número");
			num1 = captura.nextDouble();
			double cuadra = num1 * num1;
			System.out.println("El cuadrado es " + cuadra);
			} catch (Exception e1) {
				System.out.println("Por favor digite numeros validos");
			}

			break;
		
		case 6: 
			try {
			System.out.println("Por favor digite el número");
			num1 = captura.nextDouble();
			System.out.println("Por favor digite el porcentaje que desea aplicar");
			num3 = captura.nextDouble();
			double porc = num1 * num3 / 100;
			System.out.println("El porcentaje es " + porc);
			} catch (Exception e1) {
				System.out.println("Por favor digite numeros validos");
			}

			break;
		
		case 7: 
			try {
			System.out.println("Por favor digite el número");
			num1 = captura.nextDouble();
			double raiz = Math.sqrt(num1);
			System.out.println("La raiz es " + raiz);
			} catch (Exception e1) {
				System.out.println("Por favor digite numeros validos");
			}

			break;
		
		case 8: 
			System.out.println("Gracias por participar");
			break;
		

		default: 
			System.out.println("¡Error, opción no valida!");
		
		}
		captura.close();
	}
}
