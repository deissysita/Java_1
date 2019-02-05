package Laboratorio;

import java.util.Scanner;

public class Fiesta {

        public static void main(String[] args) {
            Scanner read= new Scanner(System.in);
                int edad, persona, edadjoven=129, contadorhombre=0, contadormujer=0, edadhombre=0,edadmujer=0,total_invitados=0,promedio_hombre=0,promedio_mujer=0;
        System.out.println("Bienvenido a su programa fiesta"); 
        System.out.println("**********************************"); 
        System.out.println("Este programa permite registrar las edades de invitados mayores de edad (18) y edades menores de 130.\nEl programa capturara las edades de hombre y/o de mujer hasta que se registre una edad igual a cero.\nAl final calculara el total de invitados,total de hombres y mujeres,el promedio de edad por sexo y la edad de la persona mas joven que asistio ");
    do {
        do {
            System.out.println("\nDigite: 1)Hombre 2)Mujer");
            persona=read.nextInt();
            if (persona!=1 && persona!=2){
                System.out.println("¡Opcion invalida!\n");
            }
        } 
        while ( persona!=1 && persona!=2);
        do {
             System.out.println("\nDigite la edad");
             edad=read.nextInt();
                if ( edad<0||edad>129){ 
                    System.out.println("¡Edad Errada!");
                    }
            } 
        while (edad<0||edad>129);
            if (edad>=18 && edad<130){
                if (persona==1){ 
                    contadorhombre++; 
                    edadhombre=edadhombre+edad; 
                    if (edad<edadjoven){
                        edadjoven=edad;
                    }
                }
                else if(persona==2){ 
                    contadormujer++; 
                    edadmujer=edadmujer+edad; 
                    if (edad<edadjoven){
                        edadjoven=edad;
                        }
                }
            }
            else{
                System.out.println("No se permiten menores de edad en la fiesta ");
                }
            } 
        while (edad!=0);
        if (contadorhombre==0 && contadormujer==0){
            edadjoven=0;
            }
        while (contadorhombre!=0){
            total_invitados=contadorhombre+contadormujer; 
            promedio_hombre=edadhombre/contadorhombre; 
            break;
            }
        while (contadormujer!=0){ 
            total_invitados=contadorhombre+contadormujer; 
            promedio_mujer=edadmujer/contadormujer; 
            break;
            }
        System.out.println(" \nTotal de invitados "+total_invitados); System.out.println(" Total de hombres "+contadorhombre); System.out.println(" Total de mujeres "+contadormujer); System.out.println(" Promedio Edad Hombre "+promedio_hombre); System.out.println(" Promedio Edad Mujer "+promedio_mujer);
        System.out.println("La persona mas joven que asistio tiene "+edadjoven+" años");
        read.close();
       }
    }      
