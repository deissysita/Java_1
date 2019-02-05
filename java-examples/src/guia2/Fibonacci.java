package guia2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
             Scanner captura = new Scanner(System.in);
        
        //1. Solicitar al usuario el número que representará la cantidad de numeros de
        //la serie Fibonacci
        System.out.println("Bienvenido a su programa Fibonacci");
        System.out.println("Este programa le mostrara los números de la serie teniendo en cuente el número que usted digite");
        System.out.println("Por favor digite la cantidad de números que desea ver: ");
        int cantidadNumeros = captura.nextInt();
        System.out.println("\nLos números de la seria Fibonacci son:");
        
        //2. Hallar la serie Fibonacci, ejemplo:
        //   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ....
        int numero1 = 0;
        int numero2 = 1;
        System.out.println(numero1);
        System.out.println(numero2);
        
        int i=2;
        for(i=2 ; i<cantidadNumeros ; i ++) {
            int suma = numero1 + numero2;
            System.out.println(suma);
            numero1 = numero2;
            numero2 = suma;
        
        }
        captura.close();
    }
    
}
