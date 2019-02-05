package Laboratorio;

import java.util.Scanner;

public class Llamada {

    public static void main(String[] args) {
        
        Scanner captura = new Scanner(System.in);
              
        /*Captura es el número por leido por pantalla,
        min corresponde a minutos,
        a1 es el dato real a multiplicar por $30, 
        tol es resultado a pagar*/
        System.out.println("Bienvenido a su programa costo de llamada");
        System.out.println("Este programa le permite calcular el valor de su llamada");
        System.out.println("Digite los minutos de su llamada: ");
        double min = captura.nextDouble();
        double a1=0;
        double tol=0;
        
        if(min <= 3) {
            System.out.println("El valor de su llamada es de $200");
        }
            else if (min > 3) {
            a1 = min-3;
            tol = a1*30+200;
            System.out.println("El valor de su llamada es $" + tol);
        } 
        captura.close();
    }
} 