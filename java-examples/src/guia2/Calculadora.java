package guia2;

import java.util.Scanner;

public class Calculadora {    
    
    public static void main (String[] args) {
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
        
        Scanner captura = new Scanner(System.in);
        System.out.println ("Por favor digite la opcion que desea realizar");
        int opc = 0;
        opc = captura .nextInt();
        int num1=0;
        int num2=0;
        double num3=0;

        switch (opc) {
            case 1:
                System.out.println("Por favor digite el primer número");
                num1= captura .nextInt();
                System.out.println ("Por favor digite el segundo número");
                num2=captura .nextInt();
                int suma=num1+num2;
                System.out.println("La suma es " + suma);
                break;

            case 2:
                System.out.println("Por favor digite el primer número");
                num1= captura .nextInt();
                System.out.println ("Por favor digite el segundo número");
                num2=captura .nextInt();
                int resta=num1-num2;
                System.out.println("El residuo es " + resta);
                break;

            case 3:
                System.out.println("Por favor digite el numerador");
                num1= captura .nextInt();
                System.out.println ("Por favor digite el denominador");
                num2=captura .nextInt();
                int multi=num1*num2;
                System.out.println("El producto es " + multi); 
                break;

            case 4:
                System.out.println("Por favor digite el numerador");
                num1= captura .nextInt();
                do {
                System.out.println ("Por favor digite el denominador");
                num3=captura .nextDouble();
                double div=num1/num3;
                System.out.println("El cociente es " + div);
               if(num3<=0){
                   System.out.println("¡Error, el denominador no puede ser cero ni menor!");
                   System.out.println("Por falvor vuelva a digitar el denominador");
               }     
               } while (num3<=0);
                break;
                               
            case 5:
                System.out.println("Por favor digite el número");
                num1= captura .nextInt();
                int cuadra=num1*num1;
                System.out.println("El cuadrado es " + cuadra);
                break;
                
            case 6:
                System.out.println("Por favor digite el número");
                num1= captura .nextInt();
                System.out.println ("Por favor digite el porcentaje que desea aplicar");
                num3=captura .nextDouble();
                double porc=num1*num3/100;
                System.out.println("El porcentaje es " + porc);
                break;
            
            case 7:
            	System.out.println("Por favor digite el número");
                num1= captura .nextInt();
                double raiz=Math.sqrt(num1);
                System.out.println("La raiz es " + raiz);
                break;
            default: 
                System.out.println("¡Error, opción no valida!");
        }
        captura.close();
    } 
}
