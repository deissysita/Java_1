package Laboratorio;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Bienvenido a su programa calificacione"); 
        System.out.println("**********************************"); 
        System.out.println("Este programa permite registrar las notas de 10 estudiantes \n permitiendo saber cuantos han sacado insuficiente, aceptable, bueno y excelente");
        
        int nota, ins=0, acep=0, bueno=0, excel=0;
        int alumno[]= new int [10];
        for (int i = 0; i < alumno.length; i++) {
            
            do{
            System.out.println("Ingrese la nota del estudiante");
            nota=read.nextInt();
            if(nota<=0 || nota>100){
                System.out.println("¡Error, ingrese una nota valida!");
            }
            else{
            alumno[i]=nota;
                    if(alumno[i]<=50){ins=ins+1;}
                    if(alumno[i]>50 && alumno[i]<=70){acep=acep+1;}
                    if(alumno[i]>70 && alumno[i]<=80){bueno=bueno+1;}    
                    if(alumno[i]>80){excel=excel+1;}
                }
            }
            while(nota<=0 || nota>100);
            
        }   
        System.out.println("los alumnos menores a 50 fueron: "+ ins);
        System.out.println("los alumnos mayores a 50 y menores a 70 fueron: "+ acep);
        System.out.println("los alumnos mayores a 70 y menores a 80 fueron: "+ bueno);
        System.out.println("los alumnos mayores a 80 fueron: "+ excel);
        read.close();
    }
}   