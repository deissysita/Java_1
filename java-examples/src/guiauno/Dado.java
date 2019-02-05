package guiauno;

import java.util.Random;

public class Dado{
   
    public static void main(String[] args) {
    Random azar =new Random();
    byte x;
    int cont=0;
    x=1;
     
    int dado1;
    int dado2;
    
    System.out.println("Bienvenido a su programa Dado");
    System.out.println("Este programa simula 3 lanzamientos de dado, de tal forma que si en las tres oportunidades\n saca pares, podrá sacar una ficha");
    
    for (int i =0; i<x; i++){
            dado1=azar.nextInt(6)+1; 
            dado2=azar.nextInt(6)+1;  

        if (dado1==dado2 && cont==0){
            System.out.println(dado1+" "+dado2+" Lanzar de nuevo");
            cont++;
            i--;
        } else if (dado1==dado2 && cont>0){
            System.out.println(dado1+" "+dado2+" Lanzar de nuevo");
            cont++;
           i=i-1; 
        }else if (dado1==dado2 && cont>=3){
            System.out.println(dado1+" "+dado2+" Saque una ficha");
            cont++;
           i=i-1; 
        }else{
            System.out.println(dado1+" "+dado2+" Es el turno de otro jugador");
        } 
    }
   }
}
 