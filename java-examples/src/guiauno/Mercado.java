package guiauno;

import java.util.Scanner;

public class Mercado {
    
    public static void main(String[] args) {
    
        Scanner leer= new Scanner(System.in);
        double valor, iva=1.16, subtotal;
        byte cantidad;
        boolean canasta;
        String art;
    
        System.out.println("Bienvenido a su programa costo de su mercado");
        System.out.println("Este programa le mostrará el costo a pagar de productos y cantidades que usted ingrese,\n incluye el iva de aquellos productos que no sean parte de la canasta familiar.");
       
        
        System.out.println("Por favor digite su producto a llevar");
                art=leer.nextLine();
        System.out.println("Por favor asigne su valor");
                valor=leer.nextDouble();
        System.out.println("Por favor digite la cantidad a llevar");
                cantidad=leer.nextByte();
        System.out.println("¿El producto pertenece a la canasta familiar?\n Si digite 'True' \n No digite 'False'");    
                canasta=leer.nextBoolean();
                if(canasta == false) {
                subtotal=(valor*cantidad)*iva;    
                }
                else {
                canasta = false;
                subtotal=valor*cantidad;
                }
        System.out.println(" Producto " +art+ " cantidad " +cantidad+ " total " +subtotal);
        leer.close();
   }
     
}

