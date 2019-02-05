package guiauno;

import java.util.Scanner;

public class colores {
   
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer =new Scanner (System.in);
        System.out.println("Bienvenido a combinación de colores");
        System.out.println("Este programa combina colores primarios\nPor favor digite la opción");
        System.out.println("1. Amarillo");
        System.out.println("2. Azul");
        System.out.println("3. Rojo");
        
        System.out.println("Ingrese la combinación de dos colores:");
        
        do{
            System.out.println("Ingrese el primer color:");
            num2=leer.nextInt();
            if (num2>3 ||num2<1) {
            System.out.println("Debe ingresar un color válido");
            }
         } 
        while (num2<1 || num2>3);
          do{
            System.out.println("Ingrese el segundo color:");
            num1=leer.nextInt();
            if (num1>3 ||num1<1) {
            System.out.println("Debe ingresar un color válido");
            }
         } 
        while (num1<1 || num1>3);
          
        if (num1==1 && num2==1) {
            System.out.println("Amarillo");
            }
        else if (num1==2 && num2==2) {
            System.out.println("Azul");
            }
        else if (num1==3 && num2==3){
            System.out.println("Rojo");
            }
        else if ((num1==1 && num2==2)||(num1==2 && num2==1)){
            System.out.println("Verde");
            }
        else if ((num1==1 && num2==3)||(num1==3 && num2==1)){
            System.out.println("Naranja");
            }
        else if ((num1==2 && num2==3)||(num1==3 && num2==2)) {
            System.out.println("Violeta");
            }
        leer.close();
    }
}
