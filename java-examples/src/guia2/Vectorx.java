package guia2;

import java.util.Scanner;

public class Vectorx {
      
    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        int opc;
              
        do{
        System.out.println("Bienvenido a su programa vector");
        System.out.println("Este programa le mostrará de forma ascendente o descendente\nla cantidad de números que usted decida.");
        
            System.out.println("Por favor digite el número de posiciones que tendrá su vector");
            
            int x = leer.nextInt();
            int[]vector = new int[x];  
            int[]vectorAux = new int[x];
            int cont=0,veces=0;
            boolean igual=false;
            
            System.out.println("Por favor, digite la opción que desee:");    
            System.out.println("1. Ascendente");
            System.out.println("2. Descendente");
            System.out.println("3. Salir");   
         
        opc=leer.nextByte();
        
        
        
        switch (opc){
            case 1:{
            	System.out.println("Digite los numeros de su vector");
                for (int i =0; i<x; i++){
                	vector[i]=leer.nextInt();
                }       
            //Ordenamiento
            for (int i =0; i<x; i++){
            	cont=0;
            	veces=0;
            	for (int j =0; j<x; j++){
            		if (vector[i]>=vector[j]) {
            			cont++;
            		}
            		if (vector[i]==vector[j]) {
            			veces++;
            			igual=true;
            		}
            	}
            	vectorAux[cont-1]=vector[i];
            	if (igual) {
            		for (int cop=1;cop<veces;cop++) {
            			vectorAux[cont-1-cop]=vector[i];
            		}
            	}
            }                      
            for (int i=0; i<x;i++){
                System.out.print(vectorAux[i]+" ");
            }      
            break;
            }
            case 2:{
            	System.out.println("Digite los numeros de su vector");
                for (int i =0; i<x; i++){
                	vector[i]=leer.nextInt();
                }
            	//Ordenamiento
                for (int i =0; i<x; i++){
                	cont=0;
                	veces=0;
                	for (int j =0; j<x; j++){
                		if (vector[i]<=vector[j]) {
                			cont++;
                		}
                		if (vector[i]==vector[j]) {
                			veces++;
                			igual=true;
                		}
                	}
                	vectorAux[cont-1]=vector[i];
                	if (igual) {
                		for (int cop=1;cop<veces;cop++) {
                			vectorAux[cont-1-cop]=vector[i];
                		}
                	}                	
                }
                for (int i=0; i<x;i++){
                    System.out.print(vectorAux[i]+" ");
                }
                break;
            }
            case 3:
            {
                System.out.println("Gracias por participar, Adios");
                break;
            }
            default:
            {
                System.out.println("¡Error, opción no válida!");
                }
            } 
        }
        while (opc!=0);
        leer.close();
    }  
}
