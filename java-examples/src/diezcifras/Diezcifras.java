package diezcifras;

import java.util.Scanner;
 
public class Diezcifras {

    public static void main(String[] args) {
        long x=0;
        int i=0;
                
        Scanner leer=new Scanner(System.in);
        System.out.println("Por favor digite un número mayor a diez cifras");
        x=leer.nextLong();
        while (x!=0) {
                x=(x/10);
                i++;
        }
        System.out.println(" Las cifras son " +i);
        
        //faltaba cerrar esta variable
        leer.close();
    }
}