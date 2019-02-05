
package matriz;

import java.util.Scanner;
import java.util.Random;

public class Matriz {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Random azar = new Random();
        int x,y;
        System.out.println("Por favor ingrese el numero de columnas y filas que desea en su matriz");
        System.out.println("Comience con número de filas");
        x=leer.nextInt();
        System.out.println("Comience con número de columnas");
        y=leer.nextInt();
        
        int[][] matriz= new int [x][y];
               
        for (int i=0; i<x; i++){
            for (int j=0; j<y; j++){
               matriz[i][j]=azar.nextInt(10)+1;
                }
         }
        for (int i=0; i<x; i++){
            for (int j=0; j<y; j++){
            System.out.print(matriz[i][j]+" ");
            } 
            System.out.println();
           }
        leer.close();
        }
}
