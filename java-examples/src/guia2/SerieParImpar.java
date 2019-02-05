package guia2;

import java.util.Scanner;

public class SerieParImpar {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int x,y,mayor,menor;
        byte opc;
        
        System.out.println("Bienvenido a su programa serie par o impar\nEste programa le permite ver la serie par o impar de dos numeros que usted ingrese");
        System.out.println("Por favor digite dos números estableciendo un rango");
        
        do{   
        System.out.println("Por favor digite el primer número");
        x=leer.nextInt();
        if(x<=0){
            
            System.out.println("Error digite nuevamente el número, este no puede ser menor o igual a cero");
            x=leer.nextInt();
            }
        }
       while (x<=0);
             
        System.out.println("Por favor digite el segundo número");
        y = leer.nextInt();
        
        do{
        if (y<=0){
        
            System.out.println("Error digite nuevamente el número, este no puede ser menor o igual a cero,"
                    + "el segundo número tampoco puede ser menor o igual al primer número que se a digitado."
                    + "Por favor digite nuevamente el segundo número estableciendo el rango");
            y=leer.nextInt();
            }
        }
        while ( y<=0);
        if (y>x){
                mayor=y;
                menor=x;
                }
            else{
                mayor=x;
                menor=y;
                }
        
        System.out.println("Por favor, digite la serie que desea ver:\n1 Par\n2.Impar.");
        opc=leer.nextByte();
                
                switch (opc){
                    case 1: {
                        System.out.println("A elegido serie par");                                             
                        if (menor % 2 == 1){
                            System.out.println("y el número es impar, por lo tanto.");
                            System.out.println("su serie es:");
                            menor=menor+1;
                            
                            for (int i = menor ; i <= mayor; i=i+2) {
                                System.out.print(i+" ");
                            }
                            System.out.println("");
                        }  
                        else{
                            System.out.println("y el número es par, por lo tanto.");
                            System.out.println("su serie es:");
                            menor=menor+0;
                            
                            for (int i = menor ; i <= mayor; i=i+2) {
                                System.out.print(i+" ");
                            }
                            System.out.println("");
                         }
                    }
                    break;
                    
                    case 2:{
                        System.out.println("A elegido serie impar");                         
                        if (menor%2==0){
                            System.out.println("y el número es par, por lo tanto.");
                            System.out.println("su serie es:");
                            menor=menor+1;
                            for (int i = menor ; i <= mayor; i=i+2) {
                            System.out.print(i+" ");
                            }
                            System.out.println("");
                        }  
                        else{
                        System.out.println("y el número es impar, por lo tanto.");
                        System.out.println("su serie es:");
                            menor=menor+0;
                            
                            for (int i = menor ; i <= mayor; i=i+2) {
                                System.out.print(i+" ");
                            }
                            System.out.println("");
                        }
                    }
                    break;
                                      
                    default:
                    System.out.println("¡Error, opción no válida!");
        }
                leer.close();
    }
}