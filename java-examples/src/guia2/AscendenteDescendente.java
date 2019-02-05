package guia2;

import java.util.Scanner;

public class AscendenteDescendente {
   
    public static void main(String[] args) {
        int num1,num2,num3, mayor, menor,medio, promedio;
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Bienvenido a su programa Ascendente, Descendente y Promedio");
        System.out.println("Este programa le permite organizar sus número de forma ascendente \no descendente si usted lo desea");
                 
        System.out.println("Por favor digite el primer número:");
        num1=leer.nextInt();
        
        System.out.println("Por favor digite el segundo número");
        num2 = leer.nextInt();
            
        while (num1==num2){
            System.out.println("Error los números no deben ser iguales."
                   + "Por favor digite nuevamente el número");
            num2=leer.nextInt();
            }
        
        System.out.println("Por favor digite el tercer número");
        num3 = leer.nextInt();
        
        while (num3==num1 || num3==num2){
            System.out.println("Error los números no deben ser iguales."
                   + "Por favor digite nuevamente el número");
            num3=leer.nextInt(); 
            }
            
            if (num1>num2 && num1>num3){
               mayor=num1;
               }
            else if (num2>num1&& num2>num3){
                mayor=num2;
                }
            else{
                mayor=num3;
                }
                
            if (num1<num2 && num1<num3){
               menor=num1;
               }
            else if (num2<num1 && num2<num3){
                menor=num2;  
            }
            else{
                menor=num3;
                }
            
                System.out.println("Por favor digite la opcion  en la que desea ver sus numeros");
                System.out.println("1. Ascendente\n2. Descendente\n3. Promedio");
                int opc;
                
                opc=leer.nextInt();
                
                switch (opc){
                    case 1:
                    medio=(num1+num2+num3)-(mayor+menor);
                        System.out.println("El orden ascendente de los numeros ingresados es:");
                        System.out.println(menor + " " + medio+ " "+ mayor);
                    break;
                  
                    case 2:    
                    medio=(num1+num2+num3)-(mayor+menor);
                        System.out.println("El orden descendente de los numeros ingresados es:");
                        System.out.println(mayor + " " + medio+ " "+ menor);
                
                        break;
                    
                    case 3:    
                        promedio=(num1+num2+num3)/3;
                            System.out.println("El promedio de los numeros ingresados es:");
                            System.out.println(promedio);
                    
                            break;
                    default:
                        System.out.println("¡Error, opción no valida!");
         }
        leer.close();
    }
}
