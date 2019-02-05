package guiauno;

import java.util.Random;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
    Random azar =new Random();
    Scanner leer =new Scanner (System.in);
    String continuar="N";
     
    int dado1;
    int dado2;
    int igual=0;
    
    System.out.println("Bienvenido a su programa Dado");
    System.out.println("Este programa simula 3 lanzamientos de dado, de tal forma que si en las tres oportunidades\n saca pares, podrá sacar una ficha");
    
    for (int i =0; i<3; i++){
            dado1=azar.nextInt(6)+1; 
            dado2=azar.nextInt(6)+1;  
            continuar="N";	
        if (i==0){
        	if (dado1==dado2) {
	            System.out.println(dado1+" "+dado2+" Para segundo lanzamiento, presione S ");
	        	igual=1;
	            do {
	            	continuar=leer.nextLine();	
	            }while(!continuar.equals("S"));
        	}else {
        		 System.out.println(dado1+" "+dado2+" Primer lanzamiento ");
        		 break;
        	}
        } 
        if (i==1){
        	if (dado1==dado2)
        	{
	            System.out.println(dado1+" "+dado2+" Para tercer lanzamiento, presione S");
	            if (dado1==dado2 && igual==1) {
	            	igual=2;
	            }
	            do {
	            	continuar=leer.nextLine();	
	            }while(!continuar.equals("S"));
        	}
        	else {
       		 System.out.println(dado1+" "+dado2+" Segundo lanzamiento ");
       		 break;
       	}
        }
    	if (i==2 && dado1==dado2 && igual==2){
            System.out.println(dado1+" "+dado2+" Saque una ficha!!");
        }
    	else if(i==2){
            System.out.println(dado1+" "+dado2+" Es el turno de otro jugador");
        } 
    }
    leer.close();
   }
}
