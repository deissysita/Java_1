package guia2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    double numero;
         
        Scanner read = new Scanner(System.in);
        System.out.println("Bienvenido a su programa factorial");
        System.out.println("Este programa mostrará el factorial que desea de un número");
        System.out.println("Por favor, digite el número que desea conocer su factorial");
             // Hallar factorial ejemplo:
            //   1,2,6,24,120,720,5040....
        numero = read.nextDouble();
        if(numero < 0) {
            System.out.println("Error factorial no se puede concebir");
        }
        else if(numero >150){
            System.out.println("El número es muy grande");
        }
        else if (numero == 0) {
            System.out.println("El resultado es igual a 1");
                    }
        else {
            System.out.println("El factorial es: ");
            double fact = 1;
          for(double i=1; i<=numero; i++) {
                    fact=fact*i;
                   }
          System.out.println(fact);
        }
        read.close();
     }
}
