package Laboratorio;

import java.util.Scanner;

public class Serie {

    public static void main(String [] args){
        int x=0, c=0; 
        Scanner leer=new Scanner(System.in);
        System.out.println("Este programa le permite ver los 20 primeros tÃ©rminos de la funcíon f(x)=3x-C:");
        System.out.println("Digite el valor de la constante: ");
        c=leer.nextInt();
        for (int i=0; i<20;i++){
            x=3*i-c;
            System.out.println("F("+i+")=3*"+i+"-"+c+"="+x);
        }
    }
}
