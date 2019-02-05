package guiauno;

import java.util.Random;
import java.util. Scanner;

public class NumerosAleatorios {
  
    public static void main(String[] args) {
    Random azar =new Random();
    Scanner leer= new Scanner(System.in);
    
        System.out.println("Bienvenido a su programa números aleatorios");
        System.out.println("Este programa le muestra números aleatorios, hasta la posición que usted ingrese.");
        System.out.println("Por favor digite un número");
        int num=0;
        do {
            num = leer.nextInt();
            if (num<=0) {
                System.out.println("¡Error, el número no puede ser menor de cero");
                System.out.println("Por favor digite un número");
            }
        } while (num<=0);
        
        int[] aleatorio = new int[num];
        
        for (int i =0; i<num; i++){
            aleatorio[i]=azar.nextInt(num+1); 
            }  
       for (int i=0; i!=num;i++){
              System.out.print(aleatorio[i]+" ");
           }
        System.out.println();  
        leer.close();
    }
}  
