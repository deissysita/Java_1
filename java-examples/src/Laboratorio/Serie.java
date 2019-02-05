package Laboratorio;

public class Serie {

    public static void main(String [] args){
        int x=0, y=1; 
        
        System.out.println("Este programa le permite ver los términos de la serie:");
        for (int i=0; i<20;i++){
            x=x+y;
            y=y+1;
            System.out.println(x);
        }
    }
}
