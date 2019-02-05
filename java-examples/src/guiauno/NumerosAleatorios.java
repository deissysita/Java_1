package guiauno;

import java.util.Random;
import java.util. Scanner;

public class NumerosAleatorios {
  
    public static void main(String[] args) {
    Random azar =new Random();
    Scanner leer= new Scanner(System.in);
    String opcion="";
    
        System.out.println("Bienvenido a su programa números aleatorios");
        System.out.println("Este programa le muestra números aleatorios, hasta la posición que usted ingrese. \n Permite elegir si quiere solo pares, impares o combinado");
        System.out.println("Por favor digite un número");
        int num=0;
        do {
            num = leer.nextInt();
            if (num<=0) {
                System.out.println("¡Error, el número no puede ser menor de cero");
                System.out.println("Por favor digite un número");
            }
        } while (num<=0);
        
        do {
        System.out.println("Elija una opci�n: (P)ar, (I)mpar, (C)ombinado");
        opcion = leer.next();
        } while (!(opcion.equals("P") || opcion.equals("I") || opcion.equals("C")));
        
        int[] aleatorio = new int[num];
        
        for (int i =0; i<num; i++){
        	aleatorio[i]=azar.nextInt(num*10); 
        	if (opcion.equals("P")) {
        		if(aleatorio[i]%2==1) {//impar
        			i--;
        		}
        	}else if(opcion.equals("I")) {
        		if(aleatorio[i]%2==0) {//par
        			i--;
        		}
            
            }        	
        }
        for (int i=0; i!=num;i++){
              System.out.print(aleatorio[i]+" ");
           }
        System.out.println();  
        leer.close();
    }
}  
