package Laboratorio;

import java.util.Scanner;

public class Salario {
    
public static void main(String[] args) {
        
     int diasLaborado;
        double comision,porcentaje,auxTra = 0,salarioNeto,totalDeve;
        double salarioBasico,sueldoDevegado,ventas,prestamos,totalDedu = 0;
        String respuesta,cedula,nombreEm;
        porcentaje=0.2;
        Scanner read = new Scanner(System.in);
            
        System.out.println("Bienvenido a sueldo \nEste programa valida el salario correspondiente de un vendedor");
        
        System.out.println("Ingrese el salario b�sico actual");
        salarioBasico=read.nextDouble();
        
            System.out.println("Ingrese su nombre por favor");
                nombreEm=read.next();
                
                System.out.println("Ingrese su cedula");
                cedula=read.next();
                                     
                do{
                System.out.println("Ingrese los dias laborados");
                diasLaborado=read.nextInt(); 
                    if (diasLaborado<1 || diasLaborado>30)
                    System.out.println("¡Error, los días laborales no pueden ser menor de 0 ni mayor de 30");
                    }
               while(diasLaborado<1 || diasLaborado>30); 
                                               
                sueldoDevegado=salarioBasico*diasLaborado/30;
                    
                System.out.println("Registre el saldo en ventas que realizo este mes");
                ventas=read.nextDouble();
                comision=ventas*porcentaje;
                totalDeve = sueldoDevegado+comision;
        
            System.out.println("¿A solicitado un préstamo a la compañía?");
            respuesta=read.next();
             if (respuesta.equalsIgnoreCase("Si")) {
                 System.out.println("Indique por favor el valor del préstamo");
                 prestamos=read.nextDouble();
                 totalDedu=prestamos;
                }
            else if(respuesta.equalsIgnoreCase("No")){
                totalDedu=0;
                }
        
                salarioNeto=totalDeve-totalDedu;
        
                if(totalDeve<=1179000){
                auxTra=70500*diasLaborado/30;
                }
                else if(totalDeve>1179000){
                auxTra=0;  
                } 
        System.out.println("Empleado(a): " +nombreEm);
        System.out.println("identificado(a) con cedula " +cedula);
        System.out.println("recibe comisión de: " +comision);
        System.out.println("tiene un préstamo con la compañía de: " +totalDedu);
        System.out.println("recibe un subsidio transporte por: "+" "+auxTra);
        System.out.println("su salario básico es: "+" "+sueldoDevegado);
        System.out.println("su salario neto es: "+" "+salarioNeto);
        read.close();
    }
}
